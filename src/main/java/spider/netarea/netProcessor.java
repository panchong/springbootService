package spider.netarea;

import spider.netarea.taobao.TaobaoCrawlerForm;
import us.codecraft.webmagic.Page;

public abstract class netProcessor {

    CrawlerForm crawlerForm;

    String preNo;

    CrawlerCache crawlerCache;

    public netProcessor(CrawlerForm crawlerForm,String preNo,CrawlerCache crawlerCache) {
        this.crawlerForm = crawlerForm;
        this.preNo = preNo;
        this.crawlerCache = crawlerCache;
    }

    public String process(CrawlerForm crawlerForm,String preNo,CrawlerCache crawlerCache) {
        return "";                   // 3. 组装海报
    }

    // 模拟登录
    protected abstract void setForm(CrawlerForm crawlerForm,String preNo,CrawlerCache crawlerCache);

    // 爬虫提取商品信息(登录后的优惠价格)
    protected abstract void process(Page page) ;
}
