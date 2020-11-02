package com.ylzbrt.dstb.service.impl;

import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.service.IDsrwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: gzy
 * @Description: 用于 直接把表内容上传至政务平台。不访问存储过程
 * @Date:Created in  2020/2/13
 * @Modified By:
 */
@Component
public class DsrwOServiceImpl {
    @Autowired
    private IDsrwService dsrwService;

    //    @Scheduled(cron="05 47 17 * * ?")
    public void oneTime() {
        String option = Catalog.add;
        String AAA027 = "350000";
        System.out.println("一次执行");
        //获取开始时间
        long startTime1 = System.currentTimeMillis();
//        dsrwService.dealZwky65("add","350500");
        //dsrwService.dealZwMy56Qz(option,AAA027);
//        dsrwService.dealZwMc03Qz(option,AAA027);
//        dsrwService.dealZwMc01Qz(option,AAA027);

        //推送 add一次 62万数据，下一次得删除然后在 添加
        // 2020年2月14日执行
//        dsrwService.dealZwMca1Qz(option,AAA027);
//        dsrwService.dealZwky65Qz(option,AAA027);
        //2020年2月23日执行
         /*
        dsrwService.passKb01(option);
        dsrwService.passQslwFwwdb0(option);
        dsrwService.passKa03(option);
        dsrwService.passKa02(option);
        dsrwService.passKa17(option);
        dsrwService.passKa17Yp(option);

        dsrwService.dealZwMy56Qz(option,AAA027);
        dsrwService.dealZwMca1Qz(option,AAA027);
        dsrwService.dealZwMc01Qz(option,AAA027);
        dsrwService.dealZwMc03Qz(option,AAA027);
        */

//        dsrwService.dealZwKy70Qz(option,AAA027);
        // 76次传输的时候出错
        dsrwService.dealZwky65Qz(option, AAA027);
        //获取结束时间
        long endTime1 = System.currentTimeMillis();
        //输出程序运行时间
        System.out.println("代码运行时间：" + (endTime1 - startTime1) + "ms");
    }

    public static void main(String[] args) {
        String low = "aaa027, aac002, aac003, aab004, aae001, aae340, ake505, AKC501, BNYDFY, BNPMLJ, BNTMLJ," +
                "    BNZYLJ, BKC041, BKC045, BKC052, AKC502";
        System.out.println(low.toLowerCase());
    }
}
