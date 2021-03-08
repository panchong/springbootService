package spider.netarea;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by panchong on 2021/2/18.
 */
public class CrawlerCache<T> {

    private BlockingQueue<T> cacheList = null;

    public CrawlerCache() {
        cacheList = new LinkedBlockingQueue<T>();
    }

    public BlockingQueue<T> getCacheList() {
        return cacheList;
    }

    public void setCacheList(BlockingQueue<T> cacheList){
        this.cacheList = cacheList;
    }
}
