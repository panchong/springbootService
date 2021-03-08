package sun.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by panchong on 2021/2/18.
 */
@Data
public class NetAreaReq implements Serializable {

    private List<String> crawlerList;
}
