package com.ylzbrt.dstb.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ClassAnnotation(value = "zw_ac43")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwAc43Temp {
    @FieldsAnnotation(value = "统筹区编号")
    @ExcelProperty(value = "统筹区编号(必填)", index = 0)
    private String aaa027;

    @FieldsAnnotation(value = "身份证号")
    @ExcelProperty(value = "身份证号(必填)", index = 2)
    private String aac002;

    @FieldsAnnotation(value = "姓名")
    @ExcelProperty(value = "姓名(必填)", index = 1)
    private String aac003;

    @FieldsAnnotation(value = "险种类型")
    @ExcelProperty(value = "险种类型(必填)", index = 6)
    private String aae140;

    @FieldsAnnotation(value = "个人缴费划入账户金额")
    @ExcelProperty(value = "个人缴费划入账户金额(元)", index = 5)
    private BigDecimal aae023;

    @FieldsAnnotation(value = "账目类型")
    @ExcelProperty(value = "账目类型", index = 7)
    private String aaa119;

    @FieldsAnnotation(value = "缴费基数")
    @ExcelProperty(value = "缴费基数(元)", index = 8)
    private BigDecimal aae340;

    @FieldsAnnotation(value = "建账年月")
    @ExcelProperty(value = "建账年月", index = 3)
    private Integer aae206;

    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;

    @FieldsAnnotation(value = "账目年月")
    @ExcelProperty(value = "账目年月", index = 4)
    private Integer zmny00;

    @FieldsAnnotation(value = "个人缴费金额")
    @ExcelProperty(value = "个人缴费金额(元)", index = 9)
    private BigDecimal grjfje;

    @FieldsAnnotation(value = "单位缴费金额")
    @ExcelProperty(value = "单位缴费金额(元)", index = 10)
    private BigDecimal dwjfje;

    @FieldsAnnotation(value = "划拨日期")
    @ExcelProperty(value = "划拨日期", index = 11)
    private Integer hbrq00;

    @FieldsAnnotation(value = "缴费划拨id")
    @ExcelProperty(value = "缴费划拨id(必填)", index = 13)
    private BigDecimal aaz223;

//    private String bae536;
//    private String ywbz00;

    @ExcelProperty(value = "问题描述（内部）", index = 15)
    private String reason;
}