package com.ylzbrt.dstb.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.common.excel.ExcelUtils;
import com.ylzbrt.dstb.common.excel.InsertConsumer;
import com.ylzbrt.dstb.dto.ZwKslwDTO;
import com.ylzbrt.dstb.entity.*;
import com.ylzbrt.dstb.mapper.*;
import com.ylzbrt.dstb.service.IDstbService;
import com.ylzbrt.dstb.service.IPassDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-01-06
 * @Description: ${ac01,ac43,kc26,ka08,kc01,kc99,kslw 7张表的数据传输}
 */

@Service
public class DstbServiceImpl implements IDstbService {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    //excel存放位置
    @Value("${zw.error.excel.local-address}")
    private String EXCEL_LOCAL_ADDRESS;
    //excel处理的表
    @Value("#{'${zw.error.tableNames}'.split(',')}")
    private List<String> TABLES;

    @Autowired
    private ZwAc01Mapper ac01Mapper;
    @Autowired
    private ZwAc43TempMapper ac43Mapper;
    @Autowired
    private ZwKc26TempMapper kc26Mapper;
    @Autowired
    private ZwKa08TempMapper ka08Mapper;
    @Autowired
    private ZwKc01TempMapper kc01Mapper;
    @Autowired
    private ZwKc99TempMapper kc99Mapper;
    @Autowired
    private ZwKslwTempMapper kslwMapper;
    @Autowired
    private Zw_sjts_logMapper zwSjtsLogMapper;
    @Autowired
    private IPassDataService IPassDataService;
    @Autowired
    ExcelUtils excelUtils;
    @Autowired
    private ZwDynamicConfigMapper configMapper;


//    @Override
//    public void zwAc01(ConfigEntity configEntity,String action) throws Exception {
//        logger.info("zw_ac01 : 开始推送");
//        String aaa027 = configEntity.getAaa027();
//        Date aae035 = configEntity.getLastPassTime();
//        Long count = ac01Mapper.selectNumber(aaa027,aae035);
//        if(count > 0){
//            int pageSize = 500;
//            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
//            for(int i = 0 ; i < pageNumber ; i++  ){
//                long begin = i * pageSize;
//                long end = (i+1) * pageSize;
//                List<ZwAc01> zwAC01List = ac01Mapper.selectZwAC01RightDataByPage(begin,end, aaa027,aae035);
//                IPassDataService.passData(zwAC01List, ZwAc01.class, Catalog.ac01,  action );
//            }
//        }else{
//            logger.info("zw_ac01_error : 没有错误数据更新");
//        }
    //执行存储过程   ****测试占时调用ac01 返回 1
//        Map<String, Object> map = new HashMap<>();
//        map.put("updator", configEntity.getUpdator());
//        map.put("aaa027", configEntity.getAaa027());
//        ac01Mapper.ProZwAc01(map);
    //判断存储过程执行结果
    //if ("1".equals(map.get("result"))) {
//            int pageNo = 1;
//
//            for (int i = 1; i <= pageNo; i++) {
//                //分页获取数据
//                PageHelper.startPage(i, 500);
//                List<ZwAc01> zwAC01List = ac01Mapper.selectZwAC01(configEntity.getAaa027());
//                //判断  集合是否有值
//                if (CollectionUtils.isEmpty(zwAC01List)) {
//                    logger.info("zw_ac01 : 没有数据更新");
//                    break;
//                }
//                //获取页数
//                if (i == 1) {
//                    PageInfo pageInfo = new PageInfo(zwAC01List);
//                    pageNo = pageInfo.getPages();
//                }
//                //多线程跑数据
//                IPassDataService.passData(zwAC01List, ZwAc01.class, Catalog.ac01,flag);
//            }
//            logger.info("zw_ac01 : 数据提交至异步线程完成");
//        } else {
//            logger.error("zw_ac01 : 存储过程出错");
//        }


//    }


    @Override
    public void zwKa08(ConfigEntity configEntity, String action) throws Exception {
        logger.info("zw_ka08 : 开始推送");
        String aaa027 = configEntity.getAaa027();
        Date aae035 = configEntity.getLastPassTime();
        Long count = ka08Mapper.selectNumber(aaa027, aae035);
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08RightDataByPage(begin, end, aaa027, aae035);
                IPassDataService.passData(zwKa08Temps, ZwKa08Temp.class, Catalog.ka08, action);
            }
        } else {
            logger.info("zw_ac01_error : 没有错误数据更新");
        }
        //调用存储过程
//        Map<String, Object> map = new HashMap<>();
//        map.put("updator", configEntity.getUpdator());
//        map.put("aaa027", configEntity.getAaa027());
//        ka08Mapper.ProZwKa08(map);
//        //判断存储过程执行结果
//        if ("1".equals(map.get("result"))) {
//            int pageNo = 1;
//            for (int i = 1; i <= pageNo; i++) {
//                //分页获取数据
//                PageHelper.startPage(i, 500);
//                List<ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08Temp(configEntity.getAaa027());
//
//                //判断  集合是否有值
//                if (CollectionUtils.isEmpty(zwKa08Temps)) {
//                    logger.info("zw_ka08 : 没有数据更新");
//                    break;
//                }
//                //获取页数
//                if (i == 1) {
//                    PageInfo pageInfo = new PageInfo(zwKa08Temps);
//                    pageNo = pageInfo.getPages();
//                }
//                //多线程跑数据
//                IPassDataService.passData(zwKa08Temps, ZwKa08Temp.class, Catalog.ka08, flag);
//            }
//            logger.info("zw_ka08 : 数据提交至异步线程完成");
//        } else {
//            logger.error("zw_ka08 : 存储过程出错");
//        }
    }


    @Override
    public void zwKc01(ConfigEntity configEntity, String flag) throws Exception {
        logger.info("zw_kc01 : 开始推送");
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map<String, Object> map = new HashMap<>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kc01Mapper.ProZwK01(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            // String guid = Utils.getGuid();
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List<ZwKc01Temp> zwKc01Temps = kc01Mapper.selectZwKc01Temp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc01Temps)) {
                    logger.info("zw_kc01 : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc01Temps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                IPassDataService.passData(zwKc01Temps, ZwKc01Temp.class, Catalog.kc01, flag);
            }
            logger.info("zw_kc01 : 数据提交至异步线程完成");
        } else {
            logger.error("zw_kc01 : 存储过程出错");
        }
    }


    @Override
    public void zwKc99(ConfigEntity configEntity, String flag) throws Exception {
        logger.info("zw_kc99 : 开始推送");
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map<String, Object> map = new HashMap<>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kc99Mapper.ProZwKc99(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;

            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List<ZwKc99Temp> zwKc99Temps = kc99Mapper.selectZwKc99Temp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc99Temps)) {
                    logger.info("zw_kc99 : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc99Temps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                IPassDataService.passData(zwKc99Temps, ZwKc99Temp.class, Catalog.kc99, flag);
            }
            logger.info("zw_kc99 : 数据提交至异步线程完成");
        } else {
            logger.error("zw_kc99 : 存储过程出错");
        }
    }


    @Override
    public void zwKslw(ConfigEntity configEntity, String flag) throws Exception {
        logger.info("zw_kslw : 开始推送");
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map<String, Object> map = new HashMap<>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kslwMapper.ProZwKslw(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int count = kslwMapper.selectCountAkb021IsNotNull(configEntity.getAaa027());
            // 5/26 for all
//            int count = kslwMapper.selectCountAkb021NotNull();

            if (count > 0) {
                // 获取zw_kslw中对应的统筹区数据 获取 akb021字段  截取单个id 对应定点医疗机构获取名称给定数据
                List<ZwKslwTemp> zwKslwTemp = kslwMapper.selectZwKslwTempAkb021(configEntity.getAaa027());

                // 5/26 for all
//                List <ZwKslwTemp> zwKslwTemp = kslwMapper.selectZwKslwTempAll();

                List<ZwKslwTemp> finalData = new ArrayList<>();
                logger.info(String.valueOf(zwKslwTemp.size()));
                for (int m = 0; m < zwKslwTemp.size(); m++) {
                    ZwKslwTemp temp = zwKslwTemp.get(m);
                    subStringData(temp, finalData);
                }

//                删除数据库中原有的数据
                kslwMapper.deleteDataAkb021IsNotNull(configEntity.getAaa027());
                // 5/26 for all
//                kslwMapper.deleteAkb021IsNotNull();


//               插入finaldata
                List<List<ZwKslwTemp>> lists = Lists.partition(finalData, 500);
                int lcount = lists.size();
                for (int h = 0; h < lcount; h++) {
                    kslwMapper.insertDataAkb021(lists.get(h));
                }
            }

            int pageNo = 1;

            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List<ZwKslwTemp> zwKslwTemps = kslwMapper.selectZwKslwTemp(configEntity.getAaa027());
                // 5/26 for all
//                List <ZwKslwTemp> zwKslwTemps = kslwMapper.selectZwKslwTempAll();
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKslwTemps)) {
                    logger.info("zw_kslw : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKslwTemps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                IPassDataService.passData(zwKslwTemps, ZwKslwTemp.class, Catalog.kslw, flag);
            }
            logger.info("zw_kslw : 数据提交至异步线程完成");
        } else {
            logger.error("zw_kslw : 存储过程出错");
        }
    }


    @Override
    public void zwAc01() {
        //获取上次跟新的时间
//        Date lastUpdateTime = configMapper.selectLastUpdateTime(Catalog.ac01);
//        //更新这次更新的时间
//        configMapper.updateLastUpdateTime(Catalog.ac01);
//        int pageBegin = 0;
//        int pageEnd = 500;
//        //新增
//        for (int i = 0; i <= pageBegin; i++) {
//            List<ZwAc01> ZwAc01Lists = ac01Mapper.selectZwAc01TempInsert(pageBegin, pageEnd, lastUpdateTime);
//            //判断  集合是否有值
//            if (CollectionUtils.isEmpty(ZwAc01Lists)) {
//                break;
//            } else {
//                pageBegin += 500;
//                pageEnd += 500;
//            }
//            //多线程跑数据
//            IPassDataService.passDataAc01(ZwAc01Lists);
//        }
    }


    @Override
    public void zwAc43() {
        //获取上次跟新的时间
//        Date lastUpdateTime = configMapper.selectLastUpdateTime(Catalog.ac43);
//
//        //更新这次更新的时间
//        configMapper.updateLastUpdateTime(Catalog.ac43);
//
//        int pageBegin = 0;
//        int pageEnd = 500;
//        //新增
////        for (int i = 0; i <= pageBegin; i++) {
////            List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43TempInsert(pageBegin, pageEnd, lastUpdateTime);
////            //判断  集合是否有值
////            if (CollectionUtils.isEmpty(zwAc43Temps)) {
////                break;
////            } else {
////                pageBegin += 500;
////                pageEnd += 500;
////            }
////            //多线程跑数据
////            IPassDataService.passData(zwAc43Temps);
////        }
////
////        pageBegin = 0;
////        pageEnd = 500;
////        //删除
////        for (int i = 0; i <= pageBegin; i++) {
////            List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43TempDelete(pageBegin, pageEnd, lastUpdateTime);
////            //判断  集合是否有值
////            if (CollectionUtils.isEmpty(zwAc43Temps)) {
////                logger.info("zw_ac43 : 没有数据上传");
////                break;
////            } else {
////                pageBegin += 500;
////                pageEnd += 500;
////            }
////            //多线程跑数据
////            IPassDataService.passData(zwAc43Temps);
////        }
//
//
//        pageBegin = 0;
//        pageEnd = 500;
//        //修改
//        for (int i = 0; i <= pageBegin; i++) {
//            List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43TempUpdate(pageBegin, pageEnd, lastUpdateTime);
//            //判断  集合是否有值
//            if (CollectionUtils.isEmpty(zwAc43Temps)) {
//                break;
//            } else {
//                pageBegin += 500;
//                pageEnd += 500;
//            }
//            //多线程跑数据
//            IPassDataService.passData(zwAc43Temps);
//        }


//        logger.info("zw_ac43 : 开始推送");
//        //执行存储过程   ****测试占时调用ac01 返回 1
//        Map<String, Object> map = new HashMap<>();
//        map.put("updator", configEntity.getUpdator());
//        map.put("aaa027", configEntity.getAaa027());
//        ac43Mapper.ProZwAc43(map);  //不含390险种
//
//        //判断存储过程执行结果
//        if ("1".equals(map.get("result"))) {
//            logger.info("zw_ac43 : 存储过程执行完成");
//            ac43Mapper.ProZwAc43390(map);  //获取390险种对应的存储过程
//            if ("1".equals(map.get("result"))) {
//                int pageNo = 1;
//
//                for (int i = 1; i <= pageNo; i++) {
//                    //分页获取数据
//                    PageHelper.startPage(i, 500);
//                    List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43Temp(configEntity.getAaa027());
//                    //判断  集合是否有值
//                    if (CollectionUtils.isEmpty(zwAc43Temps)) {
//                        logger.info("zw_ac43 : 没有数据更新");
//                        break;
//                    }
//                    //获取页数
//                    if (i == 1) {
//                        PageInfo pageInfo = new PageInfo(zwAc43Temps);
//                        pageNo = pageInfo.getPages();
//                    }
//                    //多线程跑数据
//                    IPassDataService.passData(zwAc43Temps, ZwAc43Temp.class, Catalog.ac43, flag);
////                    Future <String> result =
//                    //                   try {
//                    //线程返回结果。0为政务接口异常导致的失败，1为传输成功。while死循环直到推送成功跳出，弊端可能出现死循环
////                        while(true) {
////                            if ("0".equals(result.get())) {
////                                IPassDataService.passData(zwAc43Temps, ZwAc43Temp.class, Catalog.ac43, guid);
////                            }
////                            else{
////                                break;
////                            }
////                        }
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    } catch (ExecutionException e) {
////                        e.printStackTrace();
////                    }
//                }
//            } else {
//                logger.error("zw_ac43_390 : 存储过程出错");
//            }
//            logger.info("zw_ac43 : 数据提交至异步线程完成");
//        } else {
//            logger.error("zw_ac43 : 存储过程出错");
//        }
    }


    @Override
    public void zwKc26(ConfigEntity configEntity, String flag) throws Exception {
        logger.info("zwKc26 : 开始推送");
        //执行存储过程   ****测试占时调用ac01 返回 1
        Map<String, Object> map = new HashMap<>();
        map.put("updator", configEntity.getUpdator());
        map.put("aaa027", configEntity.getAaa027());
        kc26Mapper.ProZwKc26(map);

        //判断存储过程执行结果
        if ("1".equals(map.get("result"))) {
            int pageNo = 1;
            //String guid = Utils.getGuid();
            for (int i = 1; i <= pageNo; i++) {
                //分页获取数据
                PageHelper.startPage(i, 500);
                List<ZwKc26Temp> zwKc26Temps = kc26Mapper.selectZwKc26Temp(configEntity.getAaa027());
                //判断  集合是否有值
                if (CollectionUtils.isEmpty(zwKc26Temps)) {
                    logger.info("zw_kc26 : 没有数据更新");
                    break;
                }
                //获取页数
                if (i == 1) {
                    PageInfo pageInfo = new PageInfo(zwKc26Temps);
                    pageNo = pageInfo.getPages();
                }
                //多线程跑数据
                IPassDataService.passData(zwKc26Temps, ZwKc26Temp.class, Catalog.kc26, flag);
            }
            logger.info("zwKc26 : 数据提交至异步线程完成");
        } else {
            logger.error("zwKc26 : 存储过程出错");
        }
    }


    private void subStringData(ZwKslwTemp temp, List<ZwKslwTemp> finalData) {
        String aab299 = temp.getBae033();
        String akb021 = temp.getAkb021();
        String[] ids = akb021.split(";");
//           1. 读取ids  2. 去重  3. 取出对应机构的名称 4.拼接数据
//         去重
        TreeSet<String> treeSet = new TreeSet<String>(Arrays.asList(ids));
        List<ZwKslwDTO> list = new ArrayList<ZwKslwDTO>();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            ZwKslwDTO dto = new ZwKslwDTO();
            dto.setAab299(aab299);
            dto.setAkb020(it.next().toString().trim());
            list.add(dto);
        }
        List<String> orgNameList = kslwMapper.getAkb021FromQglwKb01(list);
        StringBuffer str = new StringBuffer();
        if (orgNameList.size() == 0) {
            str.append(akb021);
        } else {
            for (String s : orgNameList) {
                str.append(s + ";");
            }
        }

        ZwKslwTemp z1 = new ZwKslwTemp();
        BeanUtils.copyProperties(temp, z1);
        z1.setAkb021(str.toString());
        finalData.add(z1);
    }


    /**
     * @param upTime 推送时间
     * @param flag   推送先前的错误数据还是这次更新以后错误的数据 true是之前  false是这次之后
     * @throws Exception
     */
    @Override
    public void zwSjtsLog(Integer upTime, boolean flag) throws Exception {
        /*
         *  1.调用该接口传输错误数据
         *  2.读取分页读取错误数据   10条一次
         *  3. 传输数据判断返回结果 修改状态
         * */
        logger.info("zw_sjts_log : 开始推送");
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
        Date d = simp.parse(simp.format(upTime));
        Long count = flag ? zwSjtsLogMapper.selectCountBeforeTime(upTime) : zwSjtsLogMapper.selectCountAfterTime(upTime);
        if (count > 0) {
            int pageSize = 10;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<Zw_sjts_log> list = flag ? zwSjtsLogMapper.selectZwSjtsLogDataByPageBeforeTime(begin, end, upTime) : zwSjtsLogMapper.selectZwSjtsLogDataByPageAfterTime(begin, end, upTime);
                for (Zw_sjts_log vo : list) {
                    IPassDataService.passErrorData(vo);
                }
            }
        } else {
            logger.info("zw_sjts_log : 没有错误数据更新");
        }
        logger.info("zw_sjts_log : 数据提交至异步线程完成");
    }
    //end


    /**
     * 该方法需注意：1.政务错误数据需要放在EXCEL_PATH/ZwAc01（ZwKa08）文件夹下
     * 2.excel转化的类需要在包com.ylzbrt.dstb.entity.下
     * 3.实体类需要注意命名规则ZwAc01需要和tableNames的相同，且命名规则为 Zw开头 Ac01 Temp结尾
     */
    @Async
    @Override
    public void insertByEcel() {
        try {
            for (int i = 0; i < TABLES.size(); i++) {
                //文件夹位置
                //String path = System.getProperty("user.dir") + File.separator +  EXCEL_LOCAL_ADDRESS + File.separator + TABLES.get(i);
                String path = "F:\\ZwError\\" + TABLES.get(i);
                ;
                File f = new File(path);
                if (f.exists() && f.isDirectory()) {
                    File file2 = new File(f.getPath());
                    File[] files = file2.listFiles();
                    if (files != null && files.length > 0) {
                        //动态实例化excel对应的实体类
                        StringBuilder str = new StringBuilder();
                        str.append("com.ylzbrt.dstb.entity.");
                        str.append(TABLES.get(i));
                        if (!TABLES.get(i).equals("ZwAc01")) {
                            str.append("Temp");
                        }
                        Class clazz = Class.forName(str.toString());
                        //end
                        for (File f1 : files) {
                            List list = excelUtils.readByExcel(f1.getPath(), clazz);
                            switch (TABLES.get(i)) {
                                case "ZwKa08":
                                    //插入数据到数据库
                                    InsertConsumer.insertData(list, ka08Mapper::insertErrorList);
                                    break;
                                case "ZwKslw":
                                    InsertConsumer.insertData(list, kslwMapper::insertErrorList);
                                    break;
                                case "ZwAc01":
                                    InsertConsumer.insertData(list, ac01Mapper::insertErrorList);
                                    break;
                                case "ZwAc43":
                                    InsertConsumer.insertData(list, ac43Mapper::insertErrorList);
                                    break;
                                case "ZwKc26":
                                    InsertConsumer.insertData(list, kc26Mapper::insertErrorList);
                                    break;
                                case "ZwKc99":
                                    InsertConsumer.insertData(list, kc99Mapper::insertErrorList);
                                    break;
                                case "ZwKc01":
                                    InsertConsumer.insertData(list, kc01Mapper::insertErrorList);
                                    break;
                                default:
                                    break;
                            }
                            if (!CollectionUtils.isEmpty(list)) {
                                list.clear(); //没必要，以防万一
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //   end


    /**
     * excel导入错误数据推送到政务
     *
     * @param action "delete" 标识
     */
    //begin
    @Override
    public void zwAc01ErrorData(String action) {
        logger.info("zw_ac01_error : 开始推送");
        Long count = ac01Mapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwAc01> zwAC01List = ac01Mapper.selectZwAC01ErrorDataByPage(begin, end);
                IPassDataService.passData(zwAC01List, ZwAc01.class, Catalog.ac01, action);
            }
        } else {
            logger.info("zw_ac01_error : 没有错误数据更新");
        }
        logger.info("zw_ac01_error : 数据提交至异步线程完成");
    }


    @Override
    public void zwKa08ErrorData(String action) {
        logger.info("zw_ka08_error : 开始推送");
        Long count = ka08Mapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                long star = System.currentTimeMillis();
                List<ZwKa08Temp> zwKa08Temps = ka08Mapper.selectZwKa08ErrorDataByPage(begin, end);
                long stop = System.currentTimeMillis();
                logger.info("耗时：" + (stop - star));
                IPassDataService.passData(zwKa08Temps, ZwKa08Temp.class, Catalog.ka08, action);
            }
        } else {
            logger.info("zw_ka08_error : 没有错误数据更新");
        }
        logger.info("zw_ka08_error : 数据提交至异步线程完成");
    }

    @Override
    public void zwKc99ErrorData(String action) {
        logger.info("zw_kc99_error : 开始推送");
        Long count = kc99Mapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwKc99Temp> zwKc99Temps = kc99Mapper.selectZwKc99ErrorDataByPage(begin, end);
                IPassDataService.passData(zwKc99Temps, ZwKc99Temp.class, Catalog.kc99, action);
            }
        }
        logger.info("zw_kc99_error : 数据提交至异步线程完成");
    }


    @Override
    public void zwKslwErrorData(String action) {
        logger.info("zw_kslw_error : 开始推送");
        Long count = kslwMapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwKslwTemp> zwKslwTemps = kslwMapper.selectZwKslwErrorDataByPage(begin, end);
                IPassDataService.passData(zwKslwTemps, ZwKslwTemp.class, Catalog.kslw, action);
            }
        } else {
            logger.info("zw_kslw_error : 没有错误数据更新");
        }
        logger.info("zw_kslw_error : 数据提交至异步线程完成");
    }

    @Override
    public void zwKc01ErrorData(String action) {
        logger.info("zw_kc01_error : 开始推送");
        Long count = kc01Mapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwKc01Temp> zwKc01Temps = kc01Mapper.selectZwKc01ErrorDataByPage(begin, end);
                IPassDataService.passData(zwKc01Temps, ZwKc01Temp.class, Catalog.kc01, action);
            }
        }
        logger.info("zw_kc01_error : 数据提交至异步线程完成");
    }


    @Override
    public void zwKc26ErrorData(String action) {
        logger.info("zw_kc26_error : 开始推送");
        Long count = kc26Mapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwKc26Temp> zwKc26Temps = kc26Mapper.selectZwKc26ErrorDataByPage(begin, end);
                IPassDataService.passData(zwKc26Temps, ZwKc26Temp.class, Catalog.kc26, action);
            }
        } else {
            logger.info("zw_kc26_error : 没有错误数据更新");
        }
        logger.info("zw_kc26_error : 数据提交至异步线程完成");
    }


    @Override
    public void zwAc43ErrorData(String action) {
        logger.info("zw_ac43_error : 开始推送");
        Long count = ac43Mapper.selectCount();
        if (count > 0) {
            int pageSize = 500;
            long pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
            for (int i = 0; i < pageNumber; i++) {
                long begin = i * pageSize;
                long end = (i + 1) * pageSize;
                List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43ErrorDataByPage(begin, end);
                IPassDataService.passData(zwAc43Temps, ZwAc43Temp.class, Catalog.ac43, action);
            }
        } else {
            logger.info("zw_ac43_error : 没有错误数据更新");
        }
        logger.info("zw_ac43_error : 数据提交至异步线程完成");
    }
    //    end
}
