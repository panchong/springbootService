package sun.service;

import spider.netarea.CrawlerForm;
import spider.netarea.taobao.TaobaoCrawlerForm;

/**
 * Created by panchong on 2021/2/18.
 */
public interface CrawlerService {
    /**
     * 根据手机号码获取 运营商&归属地信息
     * @param form
     * @return
     */

    void crawler(CrawlerForm form);
}
