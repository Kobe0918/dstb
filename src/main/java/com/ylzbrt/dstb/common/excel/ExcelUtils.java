package com.ylzbrt.dstb.common.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Component
public class ExcelUtils<T> {

    public Logger logger = LoggerFactory.getLogger(this.getClass());

    private static Map<String, Integer> map = new HashMap<String, Integer>() {
        {
            put("跨省异地就医登记信息", 0);
            put("特殊病种登记", 1);
            put("个人账户信息", 2);
            put("人员参保信息", 3);
            put("缴费划拨信息", 4);
            put("人员基本信息", 5);
            put("消费记录信息", 6);
        }
    };


    /**
     * 1.读取指定路径下的文件夹(1.不存在：日志打印无数据 2.存在：xlsx文件和xls文件区分开读取)
     * 2.根据文件名判断读取文件对应的类型，循环读取文件夹下的文件（100条插入一次数据库）
     * 3.新建错误数据存放的表，用这个表关联数据获取对应的最新的数据继续推送
     */
//    public static List passErrorExcelData() {
//        ExcelUtils excelUtils = new ExcelUtils();
//        return excelUtils.parsedExcelData(EXCEL_PATH, "",new ArrayList<>());
//    }
//
//
//    //递归遍历对应文件夹下的路径  获取对应数据
//    private List parsedExcelData(String path, String name, List<List> list) {
//
//        System.out.println("start");
//        File excelPath = new File(path);
//        if (excelPath.exists()) {
//            File[] files = excelPath.listFiles();
//            if (files != null && files.length > 0) {
//                for (File f : files) {
//                    if (f.isDirectory()) {
//                        name = f.getName();
//                        parsedExcelData(f.getPath(), name, list);
//                    } else {
//                        switch (map.get(name)) {
//                            case 0: insertExcelData(f.getPath(),ZwKslwTemp.class);
//                               // list.add(zwKslwExcelData(f.getPath()));
//                               //list = zwKslwExcelData(f.getPath());
//                                break;
//                            case 1:
//                               // zwKa08ExcelData(f.getPath());
//                                break;
//                            default:
//                                break;
//                        }
//                    }
//                }
//            }
//        } else {
//            log.error("该路径下不存在！");
//        }
//        System.out.println(list.size());
//        System.out.println("end");
//        return list;
//    }


//    /**
//     * ebatis 包使用excel
//     *
//     * @param path
//     */
//    private void zwKa08ExcelData(String path) {
//        File file = new File(path);
//        Init<ZwKa08Temp> init = new Init<ZwKa08Temp>(file, ZwKa08Temp.class, false);
//        ActionContext<ZwKa08Temp> act = init.start();
//        List<SheetInfo<ZwKa08Temp>> sheets = act.getSheets();
//        log.info(String.valueOf(sheets.size()) + ":  sheets 长度");//2
//        for (SheetInfo<ZwKa08Temp> s : sheets) {
//            List<ZwKa08Temp> info = s.getInfo(); //5000条数据
//            List<List<ZwKa08Temp>> partition = Lists.partition(info, 500);
//            for (int i = 0; i < partition.size(); i++) {
//                List<ZwKa08Temp> temps = partition.get(i);
//                // ka08Mapper.insertLists(temps);
//            }
//        }
//    }


//    private List<ZwKslwTemp> zwKslwExcel(String path) {
//        List<Object> objects = readMoreThan1000RowBySheet(path, ZwKslwTemp.class);
//        List<ZwKslwTemp> list = objects.parallelStream().map(i -> {
//            ZwKslwTemp temp = (ZwKslwTemp) i;
//            return temp;
//        }).collect(Collectors.toList());
//        return list;
////
////            stime = System.currentTimeMillis();
////            List<ZwKslwTemp> zwKslwTemp = new ArrayList<>();
////            objects.stream().forEach(i -> {
////                ZwKslwTemp temp = (ZwKslwTemp)i;
////                zwKslwTemp.add(temp);
////            });
////            etime = System.currentTimeMillis();
////            System.out.println("总共耗时2：" + (etime-stime));
//
//    }


    /**
     * 不用强转
     *
     * @param path  excel文件路径
     * @param clazz 导出excel类对应的实例化对象
     * @return 泛型集合
     */
    public List<Object> parseListByExcel(String path, Class<? extends Object> clazz) {
        //easyexcel调用
        List<Object> objects = readByExcel(path, clazz);
        List<T> list = objects.parallelStream().map(i -> {
            T temp = (T) i;
            return temp;
        }).collect(Collectors.toList());
        return objects;
    }


    /**
     * @param filePath 文件路径
     * @param clazz    文件对应类
     * @return
     */
    public List<Object> readByExcel(String filePath, Class<? extends Object> clazz) {
        if (StringUtils.isEmpty(filePath)) {
            return null;
        }
        ExcelReader excelReader = null;
        InputStream fileStream = null;
        try {
            //文件IO流
            fileStream = new FileInputStream(filePath);
            //easyexcel监听器（不能被springboot容器监管，因为每读取一个文件都需要实例化一次）
            EasyExcelListener<Object> excelListener = new EasyExcelListener<Object>();
            //读取excel文件根据类的标签模板
            excelReader = EasyExcel.read(fileStream, clazz, excelListener).build();
            //这里是只读取第1页
            ReadSheet readSheet = EasyExcel.readSheet(0).build();
            excelReader.read(readSheet);
            return excelListener.getList();

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("产生错误文件位置：" + filePath);
            return null;
        } finally {
            try {
                if (fileStream != null) {
                    fileStream.close();
                }
                if (excelReader != null) {
                    excelReader.finish();
                }
            } catch (Exception e) {
                logger.error("excel文件流关闭失败,原因：{}" + e.getMessage());
            }
        }
    }


}
