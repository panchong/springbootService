package sun.service.impl;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spider.netarea.NetAreaInfo;
import sun.service.NetAreaInfoService;

import java.util.List;
import java.util.Map;

/**
 * Created by panchong on 2021/2/18.
 */
@Service
@Slf4j
public class NetAreaInfoServiceImpl implements NetAreaInfoService {

//    @Autowired
//    private NetAreaInfoMapper netAreaInfoMapper;

    @Override
    public NetAreaInfo selectByNetAreaCode(String netAreaCode) {
//        Map<String, Object> params = Maps.newHashMap();
//        params.put("netAreaCode", netAreaCode);
//        List<NetAreaInfo> netAreaInfoList = netAreaInfoMapper.selectByNetAreaCode(params);
//        if (netAreaInfoList != null && netAreaInfoList.size() > 0) {
//            return netAreaInfoList.get(0);
//        } else {
            return null;
//        }
    }

    @Override
    public void insertSelective(NetAreaInfo record) {
        //netAreaInfoMapper.insertSelective(record);
    }

    @Override
    public void insertByBatch(List<NetAreaInfo> list) {
        //netAreaInfoMapper.insertByBatch(list);
    }

    @Override
    public boolean ckeckPhoneNoSegment(String phoneNoSegment) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("phoneNoSegment", phoneNoSegment + "%");
        NetAreaInfo netAreaInfo = new NetAreaInfo();//netAreaInfoMapper.ckeckPhoneNoSegment(params);
        if (netAreaInfo != null) {
            return true;
        }
        return false;
    }
}
