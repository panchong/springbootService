package spider.netarea.three;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spider.netarea.CrawlerForm;

/**
 * Created by panchong on 2021/2/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThreeCrawlerForm extends CrawlerForm {
    private String netAreaCode;

    private String operatorName;

    private String areaCode;

    private String areaName;

    private String cityCode;

    private String cityName;
}
