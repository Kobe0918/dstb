package com.ylzbrt.dstb.service.impl;


import com.ylzbrt.dstb.common.Catalog;
import com.ylzbrt.dstb.common.Utils;
import com.ylzbrt.dstb.entity.*;
import com.ylzbrt.dstb.mapper.*;
import com.ylzbrt.dstb.service.IDstbService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DstbServiceImpl2 implements IDstbService2 {

    public Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ZwAc01Mapper ac01Mapper;
    @Autowired
    private ZwDynamicConfigMapper configMapper;
    @Autowired
    private ZwAc43TempMapper ac43Mapper;
    @Autowired
    private ZwKc01TempMapper kc01Mapper;
    @Autowired
    private ZwKslwTempMapper kslwMapper;
    @Autowired
    private ZwKa08TempMapper ka08Mapper;
    @Autowired
    private ZwKc99TempMapper kc99Mapper;
    @Autowired
    private ZwKc26TempMapper kc26Mapper;
    @Autowired
    private TempTrrymxYdZwMapper trrymxYdMapper;
    @Autowired
    private Zw_sjts_logMapper zwSjtsLogMapper;
    @Autowired
    private com.ylzbrt.dstb.service.IPassDataService IPassDataService;
    private String[] AAA027_ARRAYS = {"350000", "350100", "350200", "350300", "350400", "350500", "350600", "350700", "350800", "350900", "350128"};
    private String[] CATALOG = {"WEB2390", "WEB2389", "WEB2388", "WEB2382", "WEB2385", "WEB2384", "WEB2387", "WEB6064"};
    private final int PAGE_SIZE = 500000;


    @Override
    public void zwAc43390IncrementData() {
        try {
            String beginTime = configMapper.getDbTime();
            ///调用存储过程跟新数据
            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            ac43Mapper.doProcedure390(map);
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_AC43_390开始时间：" + beginTime, "zw_ac43_390", "");
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    int totalNumber = ac43Mapper.selectCountToZw390(aaa027, beginTime, endTime);
                    int pageNum = pageSplit(totalNumber);
                    for (int v1 = 0; v1 < pageNum; v1++) {
                        int tempPageBegin = v1 * PAGE_SIZE;
                        int tempPageEnd = (v1 + 1) * PAGE_SIZE;

                        //将对应统筹区的增量数据导入到  zw_kc01_temp中
                        Map<String, Object> map2 = new HashMap<>();
                        map2.put("catalog", "7");
                        map2.put("aaa027", aaa027);
                        map2.put("beginTime", beginTime);
                        map2.put("endTime", endTime);
                        map2.put("tempPageBegin", tempPageBegin);
                        map2.put("tempPageEnd", tempPageEnd);
                        kc01Mapper.ProZwK01Temp(map2);
                        if ("1".equals(map2.get("result"))) {

                            int pageBegin = 0;
                            int pageEnd = 2000;
                            //新增
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwAc43Temp> ac43TempLists = ac43Mapper.selectZwAc43TempInsert390(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(ac43TempLists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwAc43Temp>> lists = Utils.splitList(ac43TempLists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwAc43Temp.class, Catalog.ac43, "add");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwAc43Temp> ac43TempLists = ac43Mapper.selectZwAc43TempUpdate390(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(ac43TempLists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwAc43Temp>> lists = Utils.splitList(ac43TempLists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwAc43Temp.class, Catalog.ac43, "update");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwAc43Temp> ac43TempLists = ac43Mapper.selectZwAc43TempDelete390(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(ac43TempLists)) {
                                    //结束时间
                                    long end = System.currentTimeMillis();
                                    //更新日志 zw_java_log
                                    insertLog(begin, end, start, "test_zw_ac43_390_temp" + v1, aaa027);
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwAc43Temp>> lists = Utils.splitList(ac43TempLists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwAc43Temp.class, Catalog.ac43, "delete");
                                }
                            }
                        } else {
                            insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_ac43_390_temp", aaa027);
                        }
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_AC43_390存储过程出错,详情查看ZW_ERROR_LOG表", "zw_ac43_390", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_ac43_390", "");
        }
    }

    @Override
    public void zwAc43IncrementData() {

        try {
            //"2020-11-01  18:01:01";
            String beginTime = configMapper.getDbTime();
            ///调用存储过程跟新数据
            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            ac43Mapper.doProcedure(map);
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_AC43开始时间：" + beginTime, "zw_ac43", "");
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    int totalNumber = ac43Mapper.selectCountToZw(aaa027, beginTime, endTime);
                    int pageNum = pageSplit(totalNumber);
                    for (int v1 = 0; v1 < pageNum; v1++) {
                        int tempPageBegin = v1 * PAGE_SIZE;
                        int tempPageEnd = (v1 + 1) * PAGE_SIZE;

                        //将对应统筹区的增量数据导入到  zw_kc01_temp中
                        Map<String, Object> map2 = new HashMap<>();
                        map2.put("catalog", "6");
                        map2.put("aaa027", aaa027);
                        map2.put("beginTime", beginTime);
                        map2.put("endTime", endTime);
                        map2.put("tempPageBegin", tempPageBegin);
                        map2.put("tempPageEnd", tempPageEnd);
                        kc01Mapper.ProZwK01Temp(map2);
                        if ("1".equals(map2.get("result"))) {

                            int pageBegin = 0;
                            int pageEnd = 2000;
                            //新增
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwAc43Temp> ac43TempLists = ac43Mapper.selectZwAc43TempInsert(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(ac43TempLists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwAc43Temp>> lists = Utils.splitList(ac43TempLists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwAc43Temp.class, Catalog.ac43, "add");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwAc43Temp> ac43TempLists = ac43Mapper.selectZwAc43TempUpdate(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(ac43TempLists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwAc43Temp>> lists = Utils.splitList(ac43TempLists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwAc43Temp.class, Catalog.ac43, "update");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwAc43Temp> ac43TempLists = ac43Mapper.selectZwAc43TempDelete(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(ac43TempLists)) {
                                    //结束时间
                                    long end = System.currentTimeMillis();
                                    //更新日志 zw_java_log
                                    insertLog(begin, end, start, "test_zw_ac43_temp" + v1, aaa027);
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwAc43Temp>> lists = Utils.splitList(ac43TempLists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwAc43Temp.class, Catalog.ac43, "delete");
                                }
                            }
                        } else {
                            insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_zw_ac43_temp", aaa027);
                        }
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_AC43存储过程出错,详情查看ZW_ERROR_LOG表", "zw_ac43", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_ac43", "");
        }
//        //获取上次跟新的时间
//        Date lastUpdateTime = configMapper.selectLastUpdateTime(Catalog.ac43);
//        String endTime = Utils.getTimeByFormart(new Date(),"yyyy-MM-dd HH:mm:ss");
//
//        //更新这次更新的时间
//        configMapper.updateLastUpdateTime(Catalog.ac43,endTime);
//        for(String aaa027 : AAA027_ARRAYS){
//            int pageBegin = 0;
//            int pageEnd = 500;
//            //新增
//            for (int i = 0; i <= pageBegin; i++) {
//                List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43TempInsert(pageBegin, pageEnd, lastUpdateTime,aaa027);
//                //判断  集合是否有值
//                if (CollectionUtils.isEmpty(zwAc43Temps)) {
//                    break;
//                } else {
//                    pageBegin += 500;
//                    pageEnd += 500;
//                }
//                //多线程跑数据
//                IPassDataService.passDataAc43(zwAc43Temps);
//            }
//
//            pageBegin = 0;
//            pageEnd = 500;
//            //删除
//            for (int i = 0; i <= pageBegin; i++) {
//                List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43TempDelete(pageBegin, pageEnd, lastUpdateTime,aaa027);
//                //判断  集合是否有值
//                if (CollectionUtils.isEmpty(zwAc43Temps)) {
//                    logger.info("zw_ac43 : 没有数据上传");
//                    break;
//                } else {
//                    pageBegin += 500;
//                    pageEnd += 500;
//                }
//                //多线程跑数据
//                IPassDataService.passDataAc43(zwAc43Temps);
//            }
//
//
//            pageBegin = 0;
//            pageEnd = 500;
//            //修改
//            for (int i = 0; i <= pageBegin; i++) {
//                List<ZwAc43Temp> zwAc43Temps = ac43Mapper.selectZwAc43TempUpdate(pageBegin, pageEnd, lastUpdateTime,aaa027);
//                //判断  集合是否有值
//                if (CollectionUtils.isEmpty(zwAc43Temps)) {
//                    break;
//                } else {
//                    pageBegin += 500;
//                    pageEnd += 500;
//                }
//                //多线程跑数据
//                IPassDataService.passDataAc43(zwAc43Temps);
//            }
//        }
    }

    @Override
    public void zwKc26IncrementData() {
//        try {
//        String[] times =  Utils.getKc26DateArray();
//        int count = times.length;
//        for(int h = 0 ; h < count ; h++){
//            if(count == h+1){
//                break;
//            }else{
//                System.out.println(times[h]);
//                System.out.println(times[h+1]);
//                System.out.println("-------------------------------");
//
//                    for (String aaa027 : AAA027_ARRAYS) {
//                        long begin = System.currentTimeMillis();
//                        String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
//
//                        Map<String, Object> map2 = new HashMap<>();
//                        map2.put("catalog", "3");
//                        map2.put("aaa027", aaa027);
//                        map2.put("beginTime", times[h]);
//                        map2.put("endTime", times[h+1]);
//                        map2.put("tempPageBegin", 0);
//                        map2.put("tempPageEnd", 0);
//                        kc01Mapper.ProZwK01Temp(map2);
//                        //存到临时表中
//                        if ("1".equals(map2.get("result"))) {
//                            int pageBegin = 0;
//                            int pageEnd = 2000;
//                            //新增
//                            for (int i = 0; i <= pageBegin; i++) {
//                                List<ZwKc26Temp> zwKc26Lists = kc26Mapper.selectZwKc26TempInsert(pageBegin, pageEnd);
//                                //判断  集合是否有值
//                                if (CollectionUtils.isEmpty(zwKc26Lists)) {
//                                    break;
//                                } else {
//                                    pageBegin += 2000;
//                                    pageEnd += 2000;
//                                }
//                                List<List<ZwKc26Temp>> lists = Utils.splitList(zwKc26Lists);
//                                for (int m = 0; m < lists.size(); m++) {
//                                    //测试
//                                    //IPassDataService.passDataKc26(lists.get(m));
//                                    //多线程跑数据
//                                    IPassDataService.passData(lists.get(m), ZwKc26Temp.class, Catalog.kc26,"add");
//                                }
//                            }
//
//                            pageBegin = 0;
//                            pageEnd = 2000;
//                            //修改
//                            for (int i = 0; i <= pageBegin; i++) {
//                                List<ZwKc26Temp> zwKc26Lists = kc26Mapper.selectZwKc26TempUpdate(pageBegin, pageEnd);
//                                //判断  集合是否有值
//                                if (CollectionUtils.isEmpty(zwKc26Lists)) {
//                                    break;
//                                } else {
//                                    pageBegin += 2000;
//                                    pageEnd += 2000;
//                                }
//                                List<List<ZwKc26Temp>> lists = Utils.splitList(zwKc26Lists);
//                                for (int m = 0; m < lists.size(); m++) {
//                                    //测试
//                                    //IPassDataService.passDataKc26(lists.get(m));
//                                    //多线程跑数据
//                                    IPassDataService.passData(lists.get(m), ZwKc26Temp.class, Catalog.kc26, "update");
//                                }
//                            }
//
//                            pageBegin = 0;
//                            pageEnd = 2000;
//                            //修改
//                            for (int i = 0; i <= pageBegin; i++) {
//                                List<ZwKc26Temp> zwKc26Lists = kc26Mapper.selectZwKc26TempDelete(pageBegin, pageEnd);
//                                //判断  集合是否有值
//                                if (CollectionUtils.isEmpty(zwKc26Lists)) {
//                                    //结束时间
//                                    long end = System.currentTimeMillis();
//                                    //更新日志 zw_java_log
//                                    insertLog(begin, end, start, "zw_kc26", aaa027);
//                                    break;
//                                } else {
//                                    pageBegin += 2000;
//                                    pageEnd += 2000;
//                                }
//                                List<List<ZwKc26Temp>> lists = Utils.splitList(zwKc26Lists);
//                                for (int m = 0; m < lists.size(); m++) {
//                                    //测试
//                                    //IPassDataService.passDataKc26(lists.get(m));
//                                    //多线程跑数据
//                                    IPassDataService.passData(lists.get(m), ZwKc26Temp.class, Catalog.kc26, "delete");
//                                }
//                            }
//                        } else {
//                            insertLog(0, 0, "出错,详情查看ZW_ERROR_LOG表", "zw_kc26_temp表", "all");
//                        }
//                    }
//
//            }
//        }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        try {
            //获取开始时间 2020-11-13 18:00:00
            String beginTime = configMapper.getDbTime();
            Map<String, Object> map = new HashMap<>();
            //map.put("result", "1");
            kc26Mapper.doProcedure(map);
            //结束时间
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_KC26_DATAS开始时间：" + beginTime, "zw_kc26", "");
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");

                    Map<String, Object> map2 = new HashMap<>();
                    map2.put("catalog", "3");
                    map2.put("aaa027", aaa027);
                    map2.put("beginTime", beginTime);
                    map2.put("endTime", endTime);
                    map2.put("tempPageBegin", 0);
                    map2.put("tempPageEnd", 0);
                    kc01Mapper.ProZwK01Temp(map2);
                    //存到临时表中
                    if ("1".equals(map2.get("result"))) {
                        int pageBegin = 0;
                        int pageEnd = 2000;
                        //新增
                        for (int i = 0; i <= pageBegin; i++) {
                            List<ZwKc26Temp> zwKc26Lists = kc26Mapper.selectZwKc26TempInsert(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwKc26Lists)) {
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwKc26Temp>> lists = Utils.splitList(zwKc26Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //测试
                                //IPassDataService.passDataKc26(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwKc26Temp.class, Catalog.kc26, "add");
                            }
                        }

                        pageBegin = 0;
                        pageEnd = 2000;
                        //修改
                        for (int i = 0; i <= pageBegin; i++) {
                            List<ZwKc26Temp> zwKc26Lists = kc26Mapper.selectZwKc26TempUpdate(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwKc26Lists)) {
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwKc26Temp>> lists = Utils.splitList(zwKc26Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //测试
                                //IPassDataService.passDataKc26(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwKc26Temp.class, Catalog.kc26, "update");
                            }
                        }

                        pageBegin = 0;
                        pageEnd = 2000;
                        //修改
                        for (int i = 0; i <= pageBegin; i++) {
                            List<ZwKc26Temp> zwKc26Lists = kc26Mapper.selectZwKc26TempDelete(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwKc26Lists)) {
                                //结束时间
                                long end = System.currentTimeMillis();
                                //更新日志 zw_java_log
                                insertLog(begin, end, start, "test_zw_kc26_temp", aaa027);
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwKc26Temp>> lists = Utils.splitList(zwKc26Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //测试
                                //IPassDataService.passDataKc26(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwKc26Temp.class, Catalog.kc26, "delete");
                            }
                        }
                    } else {
                        insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_zw_kc26_temp", aaa027);
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_KC26_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "zw_kc26", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_kc26", "");
        }
    }


    @Override
    public void zwKc01IncrementData() {
        try {
            //"2020-10-26  01:01:01";
            String beginTime = configMapper.getDbTime();
            ///调用存储过程跟新数据
            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            kc01Mapper.doProcedure(map);
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_KC01_DATAS开始时间：" + beginTime, "zw_kc01", "");
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    int totalNumber = kc01Mapper.selectCountToZw(aaa027, beginTime, endTime);
                    int pageNum = pageSplit(totalNumber);
                    for (int v1 = 0; v1 < pageNum; v1++) {
                        int tempPageBegin = v1 * PAGE_SIZE;
                        int tempPageEnd = (v1 + 1) * PAGE_SIZE;

                        //将对应统筹区的增量数据导入到  zw_kc01_temp中
                        Map<String, Object> map2 = new HashMap<>();
                        map2.put("catalog", "1");
                        map2.put("aaa027", aaa027);
                        map2.put("beginTime", beginTime);
                        map2.put("endTime", endTime);
                        map2.put("tempPageBegin", tempPageBegin);
                        map2.put("tempPageEnd", tempPageEnd);
                        kc01Mapper.ProZwK01Temp(map2);
                        if ("1".equals(map2.get("result"))) {

                            int pageBegin = 0;
                            int pageEnd = 2000;
                            //新增
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwKc01Temp> zwKc01Lists = kc01Mapper.selectZwKc01TempInsert(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(zwKc01Lists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwKc01Temp>> lists = Utils.splitList(zwKc01Lists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwKc01Temp.class, Catalog.kc01, "add");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwKc01Temp> zwKc01Lists = kc01Mapper.selectZwKc01TempUpdate(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(zwKc01Lists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwKc01Temp>> lists = Utils.splitList(zwKc01Lists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwKc01Temp.class, Catalog.kc01, "update");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwKc01Temp> zwKc01Lists = kc01Mapper.selectZwKc01TempDelete(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(zwKc01Lists)) {
                                    //结束时间
                                    long end = System.currentTimeMillis();
                                    //更新日志 zw_java_log
                                    insertLog(begin, end, start, "test_zw_kc01_temp" + v1, aaa027);
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwKc01Temp>> lists = Utils.splitList(zwKc01Lists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //测试
                                    //IPassDataService.passDataKc01(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwKc01Temp.class, Catalog.kc01, "delete");
                                }
                            }
                        } else {
                            insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_zw_kc01_temp", aaa027);
                        }
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_KC01_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "zw_kc01", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_kc01", "");
        }
    }


    @Override
    public void zwKc99IncrementData() {
        try {
            //"2020-10-26  01:01:01";
            String beginTime = configMapper.getDbTime();
            ///调用存储过程跟新数据
            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            kc99Mapper.doProcedure(map);
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_KC99_DATAS开始时间：" + beginTime, "zw_kc99", "");
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    //将对应统筹区的增量数据导入到  zw_kc01_temp中
                    int totalNumber = kc99Mapper.selectCountPassToZw(aaa027, beginTime, endTime);
                    int pageNum = pageSplit(totalNumber);
                    for (int v1 = 0; v1 < pageNum; v1++) {
                        int tempPageBegin = v1 * PAGE_SIZE;
                        int tempPageEnd = (v1 + 1) * PAGE_SIZE;

                        Map<String, Object> map2 = new HashMap<>();
                        map2.put("catalog", "2");
                        map2.put("aaa027", aaa027);
                        map2.put("beginTime", beginTime);
                        map2.put("endTime", endTime);
                        map2.put("tempPageBegin", tempPageBegin);
                        map2.put("tempPageEnd", tempPageEnd);
                        kc01Mapper.ProZwK01Temp(map2);
                        if ("1".equals(map2.get("result"))) {
                            int pageBegin = 0;
                            int pageEnd = 2000;
                            //新增
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwKc99Temp> zwKc99Lists = kc99Mapper.selectZwKc99TempInsert(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(zwKc99Lists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwKc99Temp>> lists = Utils.splitList(zwKc99Lists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //IPassDataService.passDataKc99(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwKc99Temp.class, Catalog.kc99, "add");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwKc99Temp> zwKc99Lists = kc99Mapper.selectZwKc99TempUpdate(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(zwKc99Lists)) {
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwKc99Temp>> lists = Utils.splitList(zwKc99Lists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //IPassDataService.passDataKc99(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwKc99Temp.class, Catalog.kc99, "update");
                                }
                            }

                            pageBegin = 0;
                            pageEnd = 2000;
                            //修改
                            for (int i = 0; i <= pageBegin; i++) {
                                List<ZwKc99Temp> zwKc99Lists = kc99Mapper.selectZwKc99TempDelete(pageBegin, pageEnd);
                                //判断  集合是否有值
                                if (CollectionUtils.isEmpty(zwKc99Lists)) {
                                    //结束时间
                                    long end = System.currentTimeMillis();
                                    //更新日志 zw_java_log
                                    insertLog(begin, end, start, "test_zw_kc99_temp" + v1, aaa027);
                                    break;
                                } else {
                                    pageBegin += 2000;
                                    pageEnd += 2000;
                                }
                                List<List<ZwKc99Temp>> lists = Utils.splitList(zwKc99Lists);
                                for (int m = 0; m < lists.size(); m++) {
                                    //IPassDataService.passDataKc99(lists.get(m));
                                    //多线程跑数据
                                    IPassDataService.passData(lists.get(m), ZwKc99Temp.class, Catalog.kc99, "delete");
                                }
                            }
                        } else {
                            insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_zw_kc99_temp", aaa027);
                        }
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_KC99_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "zw_kc99", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_kc99", "");
        }
    }


    @Override
    public void zwAc01IncrementData() {
        try {
            String beginTime = configMapper.getDbTime();
            ///调用存储过程跟新数据
            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            ac01Mapper.doProcedure(map);
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_AC01_DATAS开始时间：" + beginTime, "zw_ac01", "");
            if ("1".equals(map.get("result"))) {
                //更新这次更新的时间
                //configMapper.updateLastUpdateTime(Catalog.ac01,endTime);
                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    //将对应统筹区的增量数据导入到  zw_ac01_temp中
                    Map<String, Object> map2 = new HashMap<>();
                    map2.put("catalog", "4");
                    map2.put("aaa027", aaa027);
                    map2.put("beginTime", beginTime);
                    map2.put("endTime", endTime);
                    map2.put("tempPageBegin", 0);
                    map2.put("tempPageEnd", 0);
                    kc01Mapper.ProZwK01Temp(map2);
                    if ("1".equals(map2.get("result"))) {
                        int pageBegin = 0;
                        int pageEnd = 2000;
                        //新增
                        for (int i = 0; i <= pageBegin; i++) {
                            List<ZwAc01> zwAc01Lists = ac01Mapper.selectZwAc01TempInsert(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwAc01Lists)) {
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwAc01>> lists = Utils.splitList(zwAc01Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //IPassDataService.passDataAc01(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwAc01.class, Catalog.ac01, "add");
                            }
                        }

                        pageBegin = 0;
                        pageEnd = 2000;
                        //修改
                        for (int i = 0; i <= pageBegin; i++) {
                            List<ZwAc01> zwAc01Lists = ac01Mapper.selectZwAc01TempUpdate(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwAc01Lists)) {
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwAc01>> lists = Utils.splitList(zwAc01Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //IPassDataService.passDataAc01(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwAc01.class, Catalog.ac01, "update");
                            }
                        }

                        pageBegin = 0;
                        pageEnd = 2000;
                        //修改
                        for (int i = 0; i <= pageBegin; i++) {
                            List<ZwAc01> zwAc01Lists = ac01Mapper.selectZwAc01TempDelete(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwAc01Lists)) {
                                //结束时间
                                long end = System.currentTimeMillis();
                                //更新日志 zw_java_log
                                insertLog(begin, end, start, "test_zw_ac01_temp", aaa027);
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwAc01>> lists = Utils.splitList(zwAc01Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //IPassDataService.passDataAc01(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwAc01.class, Catalog.ac01, "delete");
                            }
                        }
                    } else {
                        insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_zw_ac01_temp", aaa027);
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_AC01_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "zw_ac01", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_ac01", "");
        }
    }


    @Override
    public void zwKslwIncrementData() {
        try {
            //获取上次跟新的时间
            //Date lastUpdateTime = configMapper.selectLastUpdateTime(Catalog.kslw);
            String beginTime = configMapper.getDbTime(); //"2020-10-26  01:01:01";

            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            //调用增量存储过程
            kslwMapper.doProcedure(map);

            //本次更新开始时间
            String endTime = configMapper.getDbTime(); //Utils.getTimeByFormart(new Date(),"yyyy-MM-dd HH:mm:ss");
            insertLog(0, 0, "执行PRO_ZW_KSLW_DATAS开始时间：" + beginTime, "zw_kslw", "");
            //更新本次更新时间到zw_dynamic_config表中
            //configMapper.updateLastUpdateTime(Catalog.kslw,endTime);
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    //页码递增
                    int pageBegin = 0;
                    int pageEnd = 2000;

                    //新增的数据
                    for (int i = 0; i <= pageBegin; i++) {
                        //通过上次更新的时间和本次更新的时间来，确定数据的区间
                        List<ZwKslwTemp> zwKslwLists = kslwMapper.selectZwKslwTempInsert(pageBegin, pageEnd, beginTime, endTime, aaa027);
                        //判断  集合是否有值
                        if (CollectionUtils.isEmpty(zwKslwLists)) {
                            break;
                        } else {
                            pageBegin += 2000;
                            pageEnd += 2000;
                        }
                        List<List<ZwKslwTemp>> lists = Utils.splitList(zwKslwLists);
                        for (int m = 0; m < lists.size(); m++) {
                            //插入数据库判断是否有重复数据问题
                            //IPassDataService.passDataKslw(lists.get(m));
                            //多线程跑数据
                            IPassDataService.passData(lists.get(m), ZwKslwTemp.class, Catalog.kslw, "add");
                        }
                    }

                    pageBegin = 0;
                    pageEnd = 2000;
                    //修改
                    for (int i = 0; i <= pageBegin; i++) {
                        List<ZwKslwTemp> zwKslwLists = kslwMapper.selectZwKslwTempUpdate(pageBegin, pageEnd, beginTime, endTime, aaa027);
                        //判断  集合是否有值
                        if (CollectionUtils.isEmpty(zwKslwLists)) {
                            break;
                        } else {
                            pageBegin += 2000;
                            pageEnd += 2000;
                        }
                        List<List<ZwKslwTemp>> lists = Utils.splitList(zwKslwLists);
                        for (int m = 0; m < lists.size(); m++) {
                            //插入数据库判断是否有重复数据问题
                            //IPassDataService.passDataKslw(lists.get(m));
                            //多线程跑数据
                            IPassDataService.passData(lists.get(m), ZwKslwTemp.class, Catalog.kslw, "update");
                        }
                    }

                    pageBegin = 0;
                    pageEnd = 2000;
                    //修改
                    for (int i = 0; i <= pageBegin; i++) {
                        List<ZwKslwTemp> zwKslwLists = kslwMapper.selectZwKslwTempDelete(pageBegin, pageEnd, beginTime, endTime, aaa027);
                        //判断  集合是否有值
                        if (CollectionUtils.isEmpty(zwKslwLists)) {
                            //结束时间
                            long end = System.currentTimeMillis();
                            //更新日志 zw_java_log
                            insertLog(begin, end, start, "test_zw_kslw_temp", aaa027);
                            break;
                        } else {
                            pageBegin += 2000;
                            pageEnd += 2000;
                        }
                        List<List<ZwKslwTemp>> lists = Utils.splitList(zwKslwLists);
                        for (int m = 0; m < lists.size(); m++) {
                            //插入数据库判断是否有重复数据问题
                            //IPassDataService.passDataKslw(lists.get(m));
                            //多线程跑数据
                            IPassDataService.passData(lists.get(m), ZwKslwTemp.class, Catalog.kslw, "delete");
                        }
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_KSLW_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "zw_kslw", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_kslw", "");
        }
        //线程延迟10秒等上面的数据处理完
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //错误数据传输
//        errorDataResubmit(Catalog.kslw,beginTime,configMapper.getDbTime());
    }


    @Override
    public void zwKa08IncrementData() {
        try {
            //获取上次跟新的时间
            //Date lastUpdateTime = configMapper.selectLastUpdateTime(Catalog.ka08);
            //存储过程开始时间
            String beginTime = configMapper.getDbTime();

            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            //调用增量存储过程
            ka08Mapper.doProcedure(map);
            //存储过程结束时间
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_KA08_DATAS开始时间：" + beginTime, "zw_ka08", "");
            if ("1".equals(map.get("result"))) {

                //configMapper.updateLastUpdateTime(Catalog.ka08, endTime);

                for (String aaa027 : AAA027_ARRAYS) {
                    //开始时间
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");

                    //将对应统筹区的增量数据导入到  zw_ka08_temp中
                    Map<String, Object> map2 = new HashMap<>();
                    map2.put("catalog", "5");
                    map2.put("aaa027", aaa027);
                    map2.put("beginTime", beginTime);
                    map2.put("endTime", endTime);
                    map2.put("tempPageBegin", 0);
                    map2.put("tempPageEnd", 0);
                    kc01Mapper.ProZwK01Temp(map2);
                    if ("1".equals(map2.get("result"))) {
                        int pageBegin = 0;
                        int pageEnd = 2000;

                        //新增数据
                        for (int i = 0; i <= pageBegin; i++) {
                            //根据时间获取对应的数据区间，ywbz00=1 为新增数据
                            List<ZwKa08Temp> zwKa08Lists = ka08Mapper.selectZwKa08Insert(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwKa08Lists)) {
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwKa08Temp>> lists = Utils.splitList(zwKa08Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //IPassDataService.passDataKa08(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwKa08Temp.class, Catalog.ka08, "add");
                            }
                        }

                        pageBegin = 0;
                        pageEnd = 2000;
                        //修改
                        for (int i = 0; i <= pageBegin; i++) {
                            //根据时间获取对应的数据区间，ywbz00=2 为修改数据
                            List<ZwKa08Temp> zwKa08Lists = ka08Mapper.selectZwKa08Update(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwKa08Lists)) {
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwKa08Temp>> lists = Utils.splitList(zwKa08Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //IPassDataService.passDataKa08(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwKa08Temp.class, Catalog.ka08, "update");
                            }
                        }

                        //删除数据
                        pageBegin = 0;
                        pageEnd = 2000;
                        //删除
                        for (int i = 0; i <= pageBegin; i++) {
                            //根据时间获取对应的数据区间，ywbz00=3 为删除数据
                            List<ZwKa08Temp> zwKa08Lists = ka08Mapper.selectZwKa08Delete(pageBegin, pageEnd);
                            //判断  集合是否有值
                            if (CollectionUtils.isEmpty(zwKa08Lists)) {
                                //结束时间
                                long end = System.currentTimeMillis();
                                insertLog(begin, end, start, "test_zw_ka08_temp", aaa027);
                                break;
                            } else {
                                pageBegin += 2000;
                                pageEnd += 2000;
                            }
                            List<List<ZwKa08Temp>> lists = Utils.splitList(zwKa08Lists);
                            for (int m = 0; m < lists.size(); m++) {
                                //IPassDataService.passDataKa08(lists.get(m));
                                //多线程跑数据
                                IPassDataService.passData(lists.get(m), ZwKa08Temp.class, Catalog.ka08, "delete");
                            }
                        }
                    } else {
                        insertLog(0, 0, "执行pro_zw_kc01_datas_temp出错,详情查看ZW_ERROR_LOG表", "test_zw_ka08_temp", aaa027);
                    }
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_KA08_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "zw_ka08", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "zw_ka08", "");
        }
        //线程延迟10秒等上面的数据处理完
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //错误数据传输
//        errorDataResubmit(Catalog.ka08,beginTime,configMapper.getDbTime());

    }

    @Override
    public void zwTrrymxYdIncrementData() {
        try {
            //存储过程开始时间
            String beginTime = configMapper.getDbTime();
            Map<String, Object> map = new HashMap<>();
            //map.put("result","1");
            //调用增量存储过程
            trrymxYdMapper.doProcedure(map);
            //存储过程结束时间
            String endTime = configMapper.getDbTime();
            insertLog(0, 0, "执行PRO_ZW_TEMP_TRRYMX_YD_DATAS开始时间：" + beginTime, "temp_trrymx_yd_zw", "");
            if ("1".equals(map.get("result"))) {
                for (String aaa027 : AAA027_ARRAYS) {
                    long begin = System.currentTimeMillis();
                    String start = Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss");
                    int pageBegin = 0;
                    int pageEnd = 2000;

                    //新增数据
                    for (int i = 0; i <= pageBegin; i++) {
                        List<TempTrrymxYdZw> trrymxYdZwList = trrymxYdMapper.selectIncrementData(pageBegin, pageEnd, aaa027);
                        //判断  集合是否有值
                        if (CollectionUtils.isEmpty(trrymxYdZwList)) {
                            break;
                        } else {
                            pageBegin += 2000;
                            pageEnd += 2000;
                        }
                        List<List<TempTrrymxYdZw>> lists = Utils.splitList(trrymxYdZwList);
                        for (int m = 0; m < lists.size(); m++) {
                            //IPassDataService.passDataKa08(lists.get(m));
                            //多线程跑数据
                            IPassDataService.passData(lists.get(m), TempTrrymxYdZw.class, Catalog.temp_trrymx_yd_zw, "add");
                        }
                    }

                    //结束时间
                    long end = System.currentTimeMillis();
                    insertLog(begin, end, start, "temp_trrymx_yd_zw", aaa027);
                }
            } else {
                insertLog(0, 0, "执行PRO_ZW_TEMP_TRRYMX_YD_DATAS存储过程出错,详情查看ZW_ERROR_LOG表", "temp_trrymx_yd_zw", "");
            }
        } catch (Exception e) {
            insertLog(0, 0, "代码出错:" + e.getMessage(), "temp_trrymx_yd_zw", "");
        }
    }



    /**
     * 推送错误数据
     *
     * @throws Exception
     */
    @Override
    public void zwSjtsLog() {
        /*
         *  1.调用该接口传输错误数据
         *  2.读取分页读取错误数据   10条一次
         *  3. 传输数据判断返回结果 修改状态
         * */

        String beginTime = Utils.getBeforeDaySevenClock();
        String endTime = configMapper.getDbTime();

        for (String catalog : CATALOG) {
            //(int m = 0 ; m < 3 ; m++){
            Integer count = zwSjtsLogMapper.selectCount(beginTime, endTime, catalog);
            System.out.println(count + " : " + catalog);
            if (count > 0) {
                int pageSize = 10;
                int pageNumber = count % pageSize > 0 ? (count / pageSize + 1) : (count / pageSize);
                for (int i = 0; i < pageNumber; i++) {
                    int begin = i * pageSize;
                    int end = (i + 1) * pageSize;
                    List<Zw_sjts_log> list = zwSjtsLogMapper.selectByTime(begin, end, beginTime, endTime, catalog);
                    for (Zw_sjts_log vo : list) {
                        IPassDataService.passErrorData(vo);
                    }
                }
            }
            //}
        }
        insertLog(0, 0, Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss"), "zw_sjts_log", "all");
    }


    /**
     * 插入代码推送日志信息
     *
     * @param begin
     * @param end
     * @param start
     * @param tableName
     * @param aaa027
     */
    private void insertLog(long begin, long end, String start, String tableName, String aaa027) {
        long time = end - begin;
        String msg = "开始时间：" + start + " ; 结束时间： " + Utils.getTimeByFormart("yyyy-MM-dd HH:mm:ss") + "; 耗时：" + String.valueOf(time);
        configMapper.insertIntoLog(msg, tableName, aaa027);
    }


    private int pageSplit(int totalNumber) {
        int pageNum = 1;
        if (totalNumber > PAGE_SIZE) {
            if (totalNumber % PAGE_SIZE > 0) {
                pageNum = totalNumber / PAGE_SIZE + 1;
            }
        }
        return pageNum;
    }


}
