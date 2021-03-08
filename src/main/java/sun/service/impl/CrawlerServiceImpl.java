package sun.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spider.netarea.CrawlerCache;
import spider.netarea.CrawlerForm;
import spider.netarea.taobao.TaobaoCrawlerForm;
import spider.netarea.NetAreaInfo;
import spider.netarea.taobao.TaobaoPageProcessor;
import sun.service.CrawlerService;
import sun.service.NetAreaInfoService;
import us.codecraft.webmagic.Spider;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by panchong on 2021/2/18.
 */
@Service
@Slf4j
public class CrawlerServiceImpl implements CrawlerService{
    public static CrawlerCache<NetAreaInfo> crawlerCache = new CrawlerCache<NetAreaInfo>();

    @Autowired
    private NetAreaInfoService netAreaInfoService;

    @Override
    public void crawler(CrawlerForm form) {
        //DubboxResultTemplate template = new DubboxResultTemplate();
        log.info("运营商归属地爬虫开始 -- 参数 : {}", JSON.toJSONString(form));
        if (form.getCrawlerList() != null && form.getCrawlerList().size() > 0) {
            // 1 : 线程池
            ExecutorService executorService = Executors.newFixedThreadPool(20);
            crawlerFor :
            for (String str : form.getCrawlerList()) {
                // 如果号码段已经存在
                if (netAreaInfoService.ckeckPhoneNoSegment(str)) {
                    continue crawlerFor;
                }
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        provider(form, str);
                    }
                });
            }
            consumer();
            executorService.shutdown();
        }
//        template.setDubboxCode(RespEnum.SUCCESS.getRespCode());
//        template.setDubboxMsg(RespEnum.SUCCESS.getRespDesc());
//        return template;
    }

    private void provider(TaobaoCrawlerForm form, String preNo) {
        TaobaoPageProcessor netAreaPageProcessor = new TaobaoPageProcessor();
        // 设置爬虫爬取URL, 参数名
        netAreaPageProcessor.setForm(form);
        // 设置爬取内容缓存
        netAreaPageProcessor.setCrawlerCache(crawlerCache);
        // 设置号码段
        netAreaPageProcessor.setPreNo(preNo);
        Spider.create(netAreaPageProcessor)
                .addUrl(form.getUrl() + preNo + "00000000")
                .thread(10)
                .start();
    }

    private void consumer() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                boolean flag = true;
                int failCount = 0;
                do {
                    List<NetAreaInfo> netAreaInfoList = Lists.newArrayList();
                    try {
                        // 休眠2秒钟
                        Thread.sleep(2000);

                        BlockingQueue<NetAreaInfo> set = crawlerCache.getCacheList();
                        netAreaInfoList.addAll(set);
                        if (netAreaInfoList.size() > 0) {
                            flag = true;
                            // 限制获取上限
                            if (netAreaInfoList.size() > 300) {
                                netAreaInfoList = netAreaInfoList.subList(0, 300);
                            }
                            crawlerCache.getCacheList().removeAll(netAreaInfoList);
                            netAreaInfoService.insertByBatch(netAreaInfoList);
                        } else {
                            flag = false;
                            Thread.sleep(2000);
                        }
                    } catch (Exception e) {
                        log.error("处理结果线程报错 e : {}", e);
                        crawlerCache.getCacheList().addAll(netAreaInfoList);
                    }
                    if (!flag && failCount < 10) {
                        failCount ++;
                        flag = true;
                    } else {
                        log.info("failCount {} , flag = {}", failCount, flag);
                    }
                } while (flag);
            }
        };
        run.run();
    }
}
