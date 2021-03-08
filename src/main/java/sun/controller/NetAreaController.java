package sun.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spider.netarea.taobao.TaobaoCrawlerForm;
import sun.service.CrawlerService;
import sun.vo.NetAreaReq;

/**
 * Created by panchong on 2021/2/18.
 */
@Controller
@RequestMapping(value = "netArea")
@Slf4j
public class NetAreaController {

    @Autowired
    private CrawlerService crawlerService;

    @RequestMapping(value = "/crawler")
    @ResponseBody
    public void crawler(@RequestBody NetAreaReq netAreaReq) {
        log.info("Request parameters: {}", JSON.toJSONString(netAreaReq));
        TaobaoCrawlerForm form = new TaobaoCrawlerForm();
        form.setCrawlerList(netAreaReq.getCrawlerList());
        form.setUrl("http://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=");
//        __GetZoneResult_ = {
//                mts:'1851910',
//                province:'北京',
//                catName:'中国联通',
//                telString:'18519101034',
//                areaVid:'29400',
//                ispVid:'137815084',
//                carrier:'北京联通'
//        }
        //form.setUrl("https://cx.shouji.360.cn/phonearea.php?number=");
//        {
//            "code": 0,
//                "data": {
//            "province": "北京",
//                    "city": "",
//                    "sp": "联通"
//        }
//        }
        //form.setUrl("https://www.iteblog.com/api/mobile.php?mobile=");
//        {
//            "ID": "280889",
//                "prefix": "1851910",
//                "province": "北京",
//                "city": "北京",
//                "operator": "中国联通",
//                "areaCode": "010",
//                "zip": "100000",
//                "ret": 0,
//                "searchStr": "18519101034",
//                "from": "https://www.iteblog.com/api/mobile.php",
//                "ip": "114.243.220.66",
//                "ua": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36"
//        }
        crawlerService.crawler(form);
    }
}
