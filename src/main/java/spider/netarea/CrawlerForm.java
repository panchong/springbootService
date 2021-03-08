package spider.netarea;

import lombok.Data;

import java.util.List;

@Data
public abstract class CrawlerForm {

    private List<String> crawlerList;

    private String url;
}
