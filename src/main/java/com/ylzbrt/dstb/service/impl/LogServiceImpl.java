package com.ylzbrt.dstb.service.impl;

import com.ylzbrt.dstb.entity.Zw_sjts_log;
import com.ylzbrt.dstb.mapper.Zw_sjts_logMapper;
import com.ylzbrt.dstb.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class LogServiceImpl implements ILogService {

    @Autowired
    private Zw_sjts_logMapper zw_sjts_logMapper;

    private String[] chars = new String[]{
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };

    @Override
    public void doInsertLog(String catalog, String soapInXml, String results, String success) {
        Zw_sjts_log dto = new Zw_sjts_log();
        dto.setLogid(getLogid());
        dto.setCatalog(catalog);
        dto.setSoapinxml(soapInXml);
        dto.setResults(results);
        dto.setSuccess(success);
        zw_sjts_logMapper.insert(dto);
    }

    public String getLogid() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateString = formatter.format(date);
        String uid = getShortUuid();
        return dateString + uid;
    }

    private String getShortUuid() {
        StringBuffer stringBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) { // 32 -> 8
            String str = uuid.substring(i * 4, i * 4 + 4);
            // 16进制为基解析
            int strInteger = Integer.parseInt(str, 16);
            // 0x3E -> 字典总数 62
            stringBuffer.append(chars[strInteger % 0x3E]);
        }
        return stringBuffer.toString();
    }


    @Override
    public void updateLogIfTrue(String msg, String logId) {
        zw_sjts_logMapper.updateLogIfTrue(msg, logId);
    }

    @Override
    public void updateLogIfFalse(String msg, String logId, String resubmit) {
        zw_sjts_logMapper.updateLogIfFalse(msg, logId, resubmit);
    }

    @Override
    public void updateLogIfFalse(String msg, String logId) {
        zw_sjts_logMapper.updateLogFalse(msg, logId);
    }


    @Override
    @Async
    public void doDelete(String logId) {
        zw_sjts_logMapper.deleteByPrimaryKey(logId);
    }
}
