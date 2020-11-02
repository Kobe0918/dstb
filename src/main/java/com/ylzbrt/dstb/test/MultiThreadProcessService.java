package com.ylzbrt.dstb.test;

import org.jboss.logging.Logger;

import java.util.UUID;

public class MultiThreadProcessService {


    public static final Logger logger = Logger.getLogger(MultiThreadProcessService.class);

    /**
     * 默认处理流程耗时1000ms
     */
    public void processSomething() {
        //logger.debug("processSomething" + Thread.currentThread() + "......start");
        try {
            Thread.sleep(1000);
            System.out.println(getShortUuid());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //logger.debug("processSomething" + Thread.currentThread() + "......end");
    }

    public static String[] chars = new String[]{
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };


    public String getShortUuid() {
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
}
