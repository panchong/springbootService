package sun.service;

import spider.netarea.NetAreaInfo;

import java.util.List;

/**
 * Created by panchong on 2021/2/18.
 */
public interface NetAreaInfoService {

    NetAreaInfo selectByNetAreaCode(String netAreaCode);

    void insertSelective(NetAreaInfo record);

    void insertByBatch(List<NetAreaInfo> list);

    boolean ckeckPhoneNoSegment(String phoneNoSegment);

}
