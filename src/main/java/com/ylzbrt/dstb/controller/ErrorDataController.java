package com.ylzbrt.dstb.controller;

import com.ylzbrt.dstb.common.Utils;
import com.ylzbrt.dstb.entity.ZwDynamicConfigEntity;
import com.ylzbrt.dstb.mapper.ZwDynamicConfigMapper;
import com.ylzbrt.dstb.service.IDstbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class ErrorDataController {

    @Autowired
    private IDstbService IDstbService;

    @Autowired
    private ZwDynamicConfigMapper configMapper;
    @Autowired
    private DynamicScheduleTask2 task;


    /**
     * 错误数据处理
     * 解析excel插入数据库
     *
     * @return
     */
    @RequestMapping("/parseExcelIntoDB")
    public String parseExcelIntoDB() {
        IDstbService.insertByEcel();
        return "解析excel处理中.....";
    }

    //重启项目或修改zw_dynamic表配置后，都需要访问一下这个路径，去刷新任务。
    @RequestMapping("/refresh")
    public String refresh() {
        List<ZwDynamicConfigEntity> configEntities = configMapper.selectScheduledTask();
        task.refreshTask(configEntities);
        return "更新完毕";
    }

    /**
     * 推送错误数据到政务平台删除
     *
     * @return
     */
    @RequestMapping("/passErrorDataToZw")
    public String passErrorDataToZw(@RequestParam("action") String action) {
        //推送错误数据到政务平台删除
        //IDstbService.zwKc01ErrorData(action);
//        IDstbService.zwKc01ErrorData(action);
//        IDstbService.zwAc43ErrorData(action);
//        try {
//           IDstbService.zwAc01ErrorData(action);
//            IDstbService.zwKa08ErrorData(action);
//             IDstbService.zwKc99ErrorData(action);
//            IDstbService.zwKslwErrorData(action);

        IDstbService.zwKc01ErrorData(action);
//            IDstbService.zwAc43ErrorData(action);

////            IDstbService.zwKc26ErrorData(action);
//
//            String format = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
//            IDstbService.zwSjtsLog(Integer.valueOf(format),true);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return "传输错误数据......";
    }


    //    @Value("${zwjk.url}")
//    private String url;
    //excel存放位置
    @Value("${zw.error.excel.local-address}")
    private String EXCEL_LOCAL_ADDRESS;
    //excel处理的表
    @Value("#{'${zw.error.tableNames}'.split(',')}")
    private List<String> TABLES;
    @Value("${dstb.mail.host}")
    private String HOST;
    @Value("${dstb.mail.username}")
    private String USERNAME;
    @Value("${dstb.mail.password}")
    private String PASSWORD;
    @Value("${dstb.mail.default-encoding}")
    private String ENCODING;
    @Value("${dstb.mail.receiver}")
    private String RECEIVER;
    @Value("${dstb.mail.title}")
    private String TITLE;
    @Value("${zw.login.login-method}")
    private String METHOD;
    @Value("${zw.login.username}")
    private String ZWUSERNAME;
    @Value("${zw.login.password}")
    private String ZWPASSWORD;
    @Autowired
    Utils utils;

    @RequestMapping("/test")
    public String pass() throws Exception {

        String guid = utils.getGuid();
        System.out.println(guid);
//        System.out.println(url +  " : url");
        System.out.println(EXCEL_LOCAL_ADDRESS + " : EXCEL_LOCAL_ADDRESS");
        TABLES.stream().forEach(i -> {
            System.out.println(i);
        });
        System.out.println(HOST + " : HOST");
        return "test";
    }

    public static void main(String[] args) {
        String format = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(Integer.valueOf(format));
    }
}
