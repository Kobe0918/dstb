package com.ylzbrt.dstb.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ClassAnnotation(value = "zw_kc99")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwKc99Temp {
    //政务接口传输的字段对应标签
    @FieldsAnnotation(value = "统筹区编号")
    //excel对应实体类模板 value为表头，index为excel中的排列位置（从0开始）
    @ExcelProperty(value = "统筹区编号(必填)", index = 0)
    private String aaa027;
    @FieldsAnnotation(value = "身份证号")
    @ExcelProperty(value = "身份证号(必填)", index = 2)
    private String aac002;
    @FieldsAnnotation(value = "姓名")
    @ExcelProperty(value = "姓名(必填)", index = 1)
    private String aac003;
    @FieldsAnnotation(value = "地区")
    @ExcelProperty(value = "地区", index = 3)
    private String aaa129;
    @FieldsAnnotation(value = "险种类型")
    @ExcelProperty(value = "险种类型", index = 4)
    private String aae140;
    @FieldsAnnotation(value = "参保日期")
    @ExcelProperty(value = "参保日期", index = 5)
    private Integer aab050;
    @FieldsAnnotation(value = "单位名称")
    @ExcelProperty(value = "单位名称", index = 7)
    private String aab004;
    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;
    @FieldsAnnotation(value = "工作状态")
    @ExcelProperty(value = "工作状态", index = 8)
    private String aac066;
    @FieldsAnnotation(value = "年度缴费基数")
    @ExcelProperty(value = "年度缴费基数", index = 6)
    private BigDecimal ndjfjs;
    @ExcelProperty(value = "问题描述（内部）", index = 11)
    private String reason;
}