package spider.netarea.three;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import spider.netarea.CrawlerCache;
import spider.netarea.NetAreaInfo;
import spider.netarea.taobao.TaobaoCrawlerForm;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;

/**
 * Created by panchong on 2021/2/18.
 */
@Slf4j
public class ThreePageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(500);

    private boolean flag = true;

    private TaobaoCrawlerForm form;

    private String preNo;

    private CrawlerCache crawlerCache;

    @Override
    public void process(Page page) {
        String sub = "0000";
        if (flag) {
            for (int index = 0; index <= 9999; index++) {
                if (index < 10) {
                    sub = "000" + index;
                } else if (index < 100) {
                    sub = "00" + index;
                } else if (index < 1000) {
                    sub = "0" + index;
                } else {
                    sub = "" + index;
                }
                page.addTargetRequest(form.getUrl() + preNo + sub + "0001");
            }
            flag = false;
        }

        try {
            String str = page.getRawText();
            if (StringUtils.isNotBlank(str)) {
                str = str.substring(str.indexOf("{"), str.lastIndexOf("}") + 1);
                JSONObject jo = JSON.parseObject(str);
                if (jo != null) {
                    NetAreaInfo netAreaInfo = new NetAreaInfo();
                    String netAreaCode = jo.getString(form.getNetAreaCode());
                    if (netAreaCode.length() > 7) {
                        netAreaCode = netAreaCode.substring(0, 7);
                    }
                    netAreaInfo.setNetAreaCode(netAreaCode);
                    if (jo.getString(form.getOperatorName()).contains("联通")) {
                        netAreaInfo.setOperatorCode("U");
                        netAreaInfo.setOperatorName("联通");
                    } else if (jo.getString(form.getOperatorName()).contains("移动")) {
                        netAreaInfo.setOperatorCode("M");
                        netAreaInfo.setOperatorName("移动");
                    } else if (jo.getString(form.getOperatorName()).contains("电信")) {
                        netAreaInfo.setOperatorCode("T");
                        netAreaInfo.setOperatorName("电信");
                    }
                    netAreaInfo.setAreaName(jo.getString(form.getAreaName()));
                    netAreaInfo.setAreaCode(jo.getString(form.getAreaCode()));
                    if (StringUtils.isNotBlank(form.getCityCode())) {
                        netAreaInfo.setCityCode(jo.getString(form.getCityCode()));
                    }
                    if (StringUtils.isNotBlank(form.getCityName())) {
                        netAreaInfo.setCityName(jo.getString(form.getCityName()));
                    }
                    netAreaInfo.setCreateTime(new Date());
                    netAreaInfo.setUpdateTime(new Date());
                    // 添加到缓存类
                    crawlerCache.getCacheList().add(netAreaInfo);
                }
            }
        } catch (Exception e) {
            // 报错重新加入队列
            String url = page.getUrl().get();
            Integer times = Integer.valueOf(url.substring(url.length() -1));
            if (!times.equals(3)) {
                url = url.substring(0, url.length() -1) + (times + 1);
                log.error("重新爬取 : URL {}", url);
                page.addTargetRequest(url);
            }
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public void setPreNo(String preNo) {
        this.preNo = preNo;
    }

    public void setForm(TaobaoCrawlerForm form) {
        this.form = form;
    }

    public void setCrawlerCache(CrawlerCache crawlerCache) {
        this.crawlerCache = crawlerCache;
    }
}
