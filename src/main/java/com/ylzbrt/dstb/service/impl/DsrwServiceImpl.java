package com.ylzbrt.dstb.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.common.Utils;
import com.ylzbrt.dstb.dto.DealMsg;
import com.ylzbrt.dstb.entity.*;
import com.ylzbrt.dstb.mapper.*;
import com.ylzbrt.dstb.service.IDsrwService;
import com.ylzbrt.dstb.webservice.WbClient;
import org.apache.cxf.endpoint.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static com.ylzbrt.dstb.common.Utils.getGuidMsg;


/**
 * @Author: gzy
 * @Description:
 * @Date:Created in  2020/1/5
 * @Modified By:
 */

@Service
public class DsrwServiceImpl implements IDsrwService {
    @Autowired
    private ZwKb01Mapper zwKb01Mapper;
    @Autowired
    private ZwQslwFwwdb0Mapper zwQslwFwwdb0Mapper;
    @Autowired
    private ZwKa02Mapper zwKa02Mapper;
    @Autowired
    private ZwKa17YpMapper zwKa17YpMapper;
    @Autowired
    private ZwKa03Mapper zwKa03Mapper;
    @Autowired
    private ZwKa17Mapper zwKa17Mapper;
    @Autowired
    private ZwKY65Mapper zwKY65Mapper;
    @Autowired
    private KY70Mapper ky70Mapper;
    @Autowired
    private MY56Mapper my56Mapper;
    @Autowired
    private ZwMc01Mapper zwMc01Mapper;
    @Autowired
    private ZwMc03Mapper zwMc03Mapper;
    @Autowired
    private ZwMca1Mapper zwMca1Mapper;
    @Autowired
    private TimerMapper timerMapper;
    @Autowired
    private Utils utils;

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 定点医疗机构和药店
     */
    @Async
//    @Scheduled(fixedRate = Catalog.fixedRate)  //间隔200秒
    public void dealKb01(String option) {
     /*
        第一步：1.in case 备份上次更新数据 调用存储过程 获得执行结果
        第二步；判断更新结果，需要更新则调用查询，推送数据，否则不执行。
        第三步：插入定时器执行日志。
     */
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwKb01Mapper.accessPro(map); //正式运行项目必须去除注释
            // 存储过程正常
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试
            {
                List<ZwKb01> list = zwKb01Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.kb01);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
            }
        } catch (Exception e) {
            log = "定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
            //Utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "定点医疗机构和药店-kb01", log));
        logger.info("定点医疗机构和药店--插入日志 " + log);
    }

    /**
     * 全省联网定点医疗机构和药店-QslwFwwdb0
     */
    @Async

//    @Scheduled(fixedRate = Catalog.fixedRate)  //间隔200秒
    public void dealQslwFwwdb0(String option) {
        logger.info("QslwFwwdb0 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwQslwFwwdb0Mapper.accessPro(map); //正式运行项目必须去除注释
            // 存储过程正常
            if ("1".equals(map.get("code")))
//           if ("1".equals("1"))//为了测试
            {
                //第二步：
                List<ZwQslwFwwdb0> list = zwQslwFwwdb0Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.qslwfwwdb0);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
                logger.error("QslwFwwdb0 : 存储过程出错");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log = "定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
            utils.sendMail(log);//发送错误日志邮件
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "全省联网定点医疗机构和药店-QslwFwwdb0", log));
        logger.info("全省联网定点医疗机构和药店--插入日志 " + log);

    }


    /**
     * 药品目录
     *
     * @throws Exception
     */
    @Async
    // @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa02(String option) {
        logger.info("ka02 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwKa02Mapper.accessPro(map);
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试
            {
                List<ZwKa02> list = zwKa02Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.ka02);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
                logger.error("ka02 : 存储过程出错");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log = "定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
            utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "药品目录-ka02", log));
        logger.info("药品目录--插入日志 " + log);
    }

    /**
     * 特殊药品目录-ka17_yp
     *
     * @throws Exception
     */
    @Async
    //@Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa17Yp(String option) {
        logger.info("ka17_yp : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwKa17YpMapper.accessPro(map);
            //  logger.info(map.get("code"));
            // 存储过程正常
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试
            {
                List<ZwKa17Yp> list = zwKa17YpMapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.ka17_yp);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
                logger.error("ka17_yp : 存储过程出错");
            }
        } catch (Exception e) {
            flag = false;
            log = "定时器服务异常:" + e.getMessage();
        } finally {
            if (!flag) {
//                Utils.sendMail(log);
            }
            //插入日志/推送信息
            timerMapper.insert(new Timer(new Date(), "特殊药品目录-ka17_yp", log));
            logger.info("特殊药品目录-ka17_yp 插入日志 " + log);
        }

    }

    /**
     * 诊疗目录-ka03
     *
     * @throws Exception
     */
    @Async
    // @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa03(String option) {
        logger.info("ka03 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwKa03Mapper.accessPro(map);
            // 存储过程正常
            if ("1".equals(map.get("code")))
//                if ("1".equals("1"))//为了测试
            {
                List<ZwKa03> list = zwKa03Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.ka03);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                flag = false;
                log = "存储过程执行出错";
                logger.error("ka03 : 存储过程出错");
            }
        } catch (Exception e) {
            flag = false;
            log = "定时器服务异常:" + e.getMessage();

        }
        if (!flag) {
//                Utils.sendMail(log);
        }
        //插入日志/推送信息 诊疗目录-ka03
        timerMapper.insert(new Timer(new Date(), "诊疗目录-ka03", log));
        logger.info("诊疗目录-ka03--插入日志 " + log);
    }

    /**
     * 特殊病种诊疗目录-ka17
     *
     * @throws Exception
     */
    @Async
    // @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKa17(String option) {
        logger.info("ka17 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwKa17Mapper.accessPro(map);
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code")))//测试存储过程时要修改
//            if ("1".equals("1"))//为了测试
            {
                List<ZwKa17> list = zwKa17Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.ka17);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                flag = false;
                log = "存储过程执行出错";
                logger.error("ka17 : 存储过程出错");
            }
        } catch (Exception e) {
            flag = false;
            log = "定时器服务异常:" + e.getMessage();

        }
        if (!flag) {
//                Utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "特殊病种诊疗目录-ka17", log));
        logger.info("特殊病种诊疗目录-ka17 插入日志 " + log);
    }

    /**
     * 职工个人权益单-ky65
     */
    @Async
    //@Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKy65(String option) {
        logger.info("ky65 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            map.put("AAA027_", "350000");
            zwKY65Mapper.accessPro(map);
            // 存储过程正常
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试
            {
                List<ZwKY65> list = zwKY65Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.ky65);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                flag = false;
                log = "存储过程执行出错";
                logger.error("ky65 : 存储过程出错");
            }
        } catch (Exception e) {
            flag = false;
            log = "定时器服务异常:" + e.getMessage();

        }
        if (!flag) {
//            Utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "职工个人权益单-ky65", log));
        logger.info("职工个人权益单-ky65 插入日志 " + log);
    }

    /**
     * 生育产前登记-Mc01
     */
    @Async
//    @Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMc01(String option) {
        logger.info("Mc01 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwMc01Mapper.accessPro(map);
            // 存储过程正常
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试
            {
                List<ZwMc01> list = zwMc01Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.mc01);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                flag = false;
                log = "存储过程执行出错";
                logger.error("Mc01 : 存储过程出错");
            }
        } catch (Exception e) {
            flag = false;
            log = "政务接口服务异常:" + e.getMessage();

        }
        if (!flag) {
//            Utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "生育产前登记-Mc01", log));
        logger.info("生育产前登记-Mc01 插入日志 " + log);
    }

    /**
     * 生育保险刷卡记录-Ky70
     */
    @Async
    //@Scheduled(fixedRate = Catalog.fixedRate)
    public void dealKy70(String option) {
        logger.info("Ky70 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            map.put("code", "");
            ky70Mapper.accessPro(map);
//             存储过程正常执行  //测试存储过程时要修改
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试
            {
                List<KY70> list = ky70Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.ky70);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                flag = false;
                log = "存储过程执行出错";
                logger.error("Ky70 : 存储过程出错");
            }
        } catch (Exception e) {
            flag = false;
            log = "定时器服务异常:" + e.getMessage();

        }
        if (!flag) {
//                Utils.sendMail(log);
        }
        timerMapper.insert(new Timer(new Date(), "生育保险刷卡记录-Ky70", log));
        //插入日志/推送信息
        logger.info("生育保险刷卡记录-Ky70 插入日志 " + log);
    }

    /**
     * 生育登记信息-Mca1
     */
    @Async
    //@Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMca1(String option) {
        logger.info("Mca1 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            map.put("code", "");
            zwMca1Mapper.accessPro(map);
            // 存储过程正常
            // map.get("code")  替换 "1"
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试（不调用存储过程）
            {
                List<ZwMca1> list = zwMca1Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.mca1);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
                logger.error("Mca1 : 存储过程出错");
            }
        } catch (Exception e) {
            log = "定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
//                Utils.sendMail(log);
        }
        timerMapper.insert(new Timer(new Date(), "生育登记信息-Mca1", log));
        //插入日志/推送信息
        logger.info("生育登记信息-Mca1 插入日志 " + log);
    }

    /**
     * 生育待遇发放信息-Mc03
     */
    @Async
    //@Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMc03(String option) {
        logger.info("Mc03 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            zwMc03Mapper.accessPro(map);
            // 存储过程正常
            //   替换 "1"  map.get("code")
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试（不调用存储过程）
            {
                List<ZwMc03> list = zwMc03Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.mc03);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
                logger.error("Mc03 : 存储过程出错");
            }
        } catch (Exception e) {
            log = "定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
//                Utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "生育待遇发放信息-Mc03", log));
    }

    /**
     * 生育保险个人权益单-My56
     */
    @Async
    //@Scheduled(fixedRate = Catalog.fixedRate)
    public void dealMy56(String option) {
        logger.info("My56 : 开始推送");
        String log = "推送成功";
        boolean flag = true;
        try {
            //第一步：
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("UPDATOR", "定时器");
            my56Mapper.accessPro(map);
            // 存储过程正常
            if ("1".equals(map.get("code")))
//            if ("1".equals("1"))//为了测试（不调用存储过程）
            {
                List<MY56> list = my56Mapper.selectByExample(null);
                DealMsg dealMsg = dealPush(list, option, Catalog.my56);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
            } else {
                log = "存储过程执行出错";
                flag = false;
                logger.error("My56 : 存储过程出错");
            }
        } catch (Exception e) {
            log = "生育保险个人权益单-My56 定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
            //Utils.sendMail(log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "生育保险个人权益单-My56", log));
    }


    /**
     * 定点医疗机构和药店
     * 数据传输
     *
     * @param option
     */
    public void passKb01(String option) {
        passTableData(zwKb01Mapper.selectByExample(null), option, Catalog.kb01, "定点医疗机构和药店", "全省");
    }

    /**
     * 全省联网定点医疗机构和药店
     * 数据传输
     *
     * @param option
     */
    @Override
    public void passQslwFwwdb0(String option) {
        passTableData(zwQslwFwwdb0Mapper.selectByExample(null), option, Catalog.qslwfwwdb0, "全省联网定点医疗机构和药店", "全省");

    }

    /**
     * 药品目录
     * 数据传输
     *
     * @param option
     */
    @Override
    public void passKa02(String option) {
        passTableData(zwKa02Mapper.selectByExample(null), option, Catalog.ka02, "药品目录", "全省");

    }

    /**
     * 特殊药品目录
     * 数据传输
     *
     * @param option
     */
    @Override
    public void passKa17Yp(String option) {
        passTableData(zwKa17YpMapper.selectByExample(null), option, Catalog.ka17_yp, "特殊药品目录", "全省");
    }

    /**
     * 诊疗目录
     * 数据传输
     *
     * @param option
     */
    @Override
    public void passKa03(String option) {
        passTableData(zwKa03Mapper.selectByExample(null), option, Catalog.ka03, "诊疗目录", "全省");

    }

    /**
     * 特殊病种诊疗目录
     * 数据传输
     *
     * @param option
     */
    @Override
    public void passKa17(String option) {
        passTableData(zwKa17Mapper.selectByExample(null), option, Catalog.ka17, "特殊病种诊疗目录", "全省");

    }

    /**
     * 泉州增量数据传输
     *
     * @param option
     */
    @Override
    public void dealZwky65Qz(String option, String AAA027) {

        // 用于测试 减低传输 频率、数量会不会让端口报出的错误减少 结果：还是报错
        String log = "推送成功";
        boolean flag = true;
        long size = 0;
        try {
            //第一步：获取数据库的数据
            ZwKY65 condition = new ZwKY65();
            condition.setAaa027(AAA027);
            //初始化  第一次传输
            int times = 3;
            for (int i = 3; i <= times; i++) {
                //程序等待30秒
//                if(i != 1) {
//                    TimeUnit.MINUTES.sleep(10);
//                }
                PageHelper.startPage(i, Catalog.size);
                List<ZwKY65> list = zwKY65Mapper.selectByCondition(condition);
                //获取总页数（需要传输的次数）
                if (i == 3) {
                    PageInfo pageInfo = new PageInfo(list);
                    times = pageInfo.getPages();
                }
                DealMsg dealMsg = dealPush(list, option, Catalog.ky65);
                log = dealMsg.getLog();
                flag = dealMsg.getFlag();
                size += list.size();
                //
                if (!flag) {
                    break;
                }
                logger.info("-------------------------------------------------");
            }
        } catch (Exception e) {
            flag = false;
            log = "定时器服务异常:" + e.getMessage();
        }
        if (!flag) {
//            Utils.sendMail(log);
            logger.info("出错信息：" + log);
        }
        //插入日志/推送信息
        timerMapper.insert(new Timer(new Date(), "职工个人权益单-ky65 地区=" + AAA027 + " 操作=" + option + " 数据量=" + size, log));
        logger.info("职工个人权益单-ky65  操作=" + option + " 数据量=" + size + " 日志=" + log);
    }

    /**
     * 生育产前登记-Mc01
     * 全量数据传输
     *
     * @param option
     * @param AAA027
     */
    @Override
    public void dealZwMc01Qz(String option, String AAA027) {
        passTableData(zwMc01Mapper.selectByExample(null), option, Catalog.mc01, "生育产前登记-Mc01", AAA027);
    }

    /**
     * 生育保险刷卡记录-Ky70
     * 全量增量数据传输
     *
     * @param option
     * @param AAA027
     */
    @Override
    public void dealZwKy70Qz(String option, String AAA027) {
        passTableData(ky70Mapper.selectByExample(null), option, Catalog.ky70, "生育保险刷卡记录-Ky70", AAA027);
    }

    /**
     * 生育登记信息-Mca1
     * 全量数据传输
     *
     * @param option
     * @param AAA027
     */
    @Override
    public void dealZwMca1Qz(String option, String AAA027) {
        passTableData(zwMca1Mapper.selectByExample(null), option, Catalog.mca1, "生育登记信息-Mca1", AAA027);
    }

    /**
     * 生育待遇发放信息-Mc03
     * <p>
     * 全量数据传输
     *
     * @param option
     * @param AAA027
     */
    @Override
    public void dealZwMc03Qz(String option, String AAA027) {
        passTableData(zwMc03Mapper.selectByExample(null), option, Catalog.mc03, "生育待遇发放信息-Mc03", AAA027);

    }

    /**
     * 生育保险个人权益单-My56
     * <p>
     * 全量数据传输
     *
     * @param option
     * @param AAA027
     */
    @Override
    public void dealZwMy56Qz(String option, String AAA027) {
        passTableData(my56Mapper.selectByExample(null), option, Catalog.my56, "生育保险个人权益单-My56", AAA027);
    }


    /**
     * 封装推送至政务数据的处理
     *
     * @param list      要推送的数据
     * @param option    操作（增删改）
     * @param catalogId 表对应的目录id
     * @return
     */
    public DealMsg dealPush(List list, String option, String catalogId) {
        DealMsg dealMsg = new DealMsg();
        //初始化 以防空值
        dealMsg.setFlag(true);
        dealMsg.setLog("推送成功");
        if (list.size() > 0) {
            // 数据量
            int size = list.size();
            //记录下标
            int index = 0;
            logger.info("重新生成本地客户端");
            Client client = WbClient.getWebService();
            //获取Gid
            Object[] guidObjects = null;
            try {
                guidObjects = guidObjects(client);
                //每500条提交一次
                for (int i = 1; i <= (size % 500 > 0 ? size / 500 + 1 : size / 500); i++) {
                    // 若是过期则获取重新获取一次
//                    if (!getGuidMsg(guidObjects[0].toString())) {
//                        try {
//                            guidObjects = guidObjects(client);
//                            logger.info("guid过期再次访问guid接口返回结果:" + getGuidMsg(guidObjects[0].toString()));
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            dealMsg.setLog("过期后再次获取gid接口异常（政务接口问题）");
//                            dealMsg.setFlag(false);
//                            break;
//                        }
//                    }
                    //gid没有过期或者错误 并推送至政务平台
//                    if (getGuidMsg(guidObjects[0].toString())) {
//                        //头部
//                        String sb = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
//                                "<table>";
//                        //500条数据的拼接成row格式
//                        for (int j = 1; j <= (size - i * 500 > 0 ? 500 : size - (i - 1) * 500); j++) {
//                            sb = sb + Utils.getXml(list.get(index), option);
//                            index++;
//                        }
//                        //xml尾部
//                        sb = sb + "</table>";
//
//                        //推送至政务外网
//                        Object[] objects = null;
//                        try {
//                            objects = client.invoke("pushXml", guidObjects[0].toString(), catalogId, sb);
//                            if ("false".equals(Utils.getPushMsg(objects[0].toString()))) {
//                                dealMsg.setFlag(false);
//                                dealMsg.setLog("推送接口获取异常，返回信息:" + objects[0].toString());
//                                break;
//                            }
//                        } catch (Exception e) {
//                            dealMsg.setFlag(false);
//                            dealMsg.setLog("政务推送接口异常" + e.getMessage());
//                            break;
//                        }
//                        //输出调用结果，Object数组第一条数据为返回结果
//                        logger.info(" 调用结果:" + objects[0].toString());
//                        //打印传输数据到本地文件里面
////                            Utils.outFile(sb);
//                        //初始化xml拼接
//                        sb = "";
//                    } else {
//                        dealMsg.setFlag(false);
//                        dealMsg.setLog("gid接口获取异常,返回消息为:" + guidObjects[0].toString());
//                        break;
//                    }
                    logger.info("第" + i + "一共推送数目为：" + index);
                }
            } catch (Exception e) {
                e.printStackTrace();
                dealMsg.setLog("获取gid接口异常（政务接口问题）");
                dealMsg.setFlag(false);
            }
        } else {
            dealMsg.setFlag(false);
            dealMsg.setLog("没有更新数据");
        }
        return dealMsg;
    }

    public Object[] guidObjects(Client client) throws Exception {


        Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
        logger.info("获取新的guid：" + guidObjects[0].toString());
        return guidObjects;
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
       /* Client client = WbClient.getWebService();
        try {
            Object[] guidObjects = client.invoke("LoginByAccount", "ybjybxx_hjpt", "sdo@1108");
            logger.info(guidObjects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        /*int size = 1000;
        logger.info(size);
        int index = 0;
        for (int i = 1; i <= (size%500 > 0?size/500+1:size/500); i++) {

            for (int j = 1; j <= (size - i*500 > 0 ?500:size-(i-1)*500); j++) {
                index += 1;
                logger.info("执行次数：" + j);
            }
            logger.info("-----------------提交次数："+i +",总数："+(index+1));
        }*/

    /*   测试解析xml回复信息
        StringBuffer sb = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<Response><flag>true</flag><msg>操作成功</msg></Response>");
        // step 1: 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
        DocumentBuilderFactory factory = DocumentBuilderFactory
                .newInstance();
        // step 2:获得具体的dom解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        // step3: 解析一个xml文档，获得Document对象（根结点）
        Document doc = builder.parse(new InputSource((new StringReader(sb.toString()))));

        NodeList list = doc.getElementsByTagName("flag");
        Node book = list.item(0);
        if(book.getFirstChild().getNodeValue().equals("true"))
        {
            logger.info("yes");
        }
        logger.info(book.getFirstChild().getNodeValue());
        */
        //获取类的变量和名称
       /* ZwKa02 zwKa02 =new ZwKa02();
        zwKa02.setAka060("123");
        logger.info(Utils.getXml(zwKa02));*/

    }

    /**
     * @param list     查询的表数据
     * @param option   操作（add/delete)
     * @param catalog  目录号
     * @param printMsg 打印的信息
     * @param AAA027   对应的地市
     */
    public void passTableData(List list, String option, String catalog, String printMsg, String AAA027) {
        String log = "推送成功";
        boolean flag = true;
        try {
            DealMsg dealMsg = dealPush(list, option, catalog);
            log = dealMsg.getLog();
            flag = dealMsg.getFlag();
            logger.info("size:{}", list.size());
        } catch (Exception e) {
            log = printMsg + " 定时器服务异常:" + e.getMessage();
            flag = false;
        }
        if (!flag) {
        }
        timerMapper.insert(new Timer(new Date(), printMsg + " 地区=" + AAA027 + " 操作=" + option + " 数量=" + list.size(), log));
        //插入日志/推送信息
        logger.info(printMsg + "  地区=" + AAA027 + " 操作=" + option);

    }
}

