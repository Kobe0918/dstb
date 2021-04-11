package com.ylzbrt.dstb.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ClassAnnotation("temp_trrymx_yd_zw")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempTrrymxYdZw {
    @FieldsAnnotation("参保地")
    @ExcelProperty(value = {"参保地"}, index = 0)
    private String aaa027;

    @FieldsAnnotation("姓名")
    @ExcelProperty(value = {"姓名"}, index = 1)
    private String aac003;

    @FieldsAnnotation("身份证号")
    @ExcelProperty(value = {"身份证号"}, index = 1)
    private String aac002;

    @FieldsAnnotation("电话")
    @ExcelProperty(value = {"电话"}, index = 1)
    private String aae005;

    @FieldsAnnotation("地址")
    @ExcelProperty(value = {"地址"}, index = 1)
    private String aae006;

    @FieldsAnnotation("年龄")
    @ExcelProperty(value = {"年龄"}, index = 1)
    private Integer akc023;

    @FieldsAnnotation("网点编号")
    @ExcelProperty(value = {"网点编号"}, index = 1)
    private String akb020;

    @FieldsAnnotation("网点名称")
    @ExcelProperty(value = {"网点名称"}, index = 1)
    private String akb021;

    @FieldsAnnotation("结算时间")
    @ExcelProperty(value = {"结算时间"}, index = 1)
    private Integer ake056;

    @FieldsAnnotation("项目编号")
    @ExcelProperty(value = {"项目编号"}, index = 1)
    private String ake001;

    @FieldsAnnotation("项目名称")
    @ExcelProperty(value = {"项目名称"}, index = 1)
    private String ake002;

    @FieldsAnnotation("标准名称")
    @ExcelProperty(value = {"标准名称"}, index = 1)
    private String ake004;


}
