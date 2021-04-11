package com.ylzbrt.dstb.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@ClassAnnotation(value = "zw_kslw")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwKslwTemp {
    //政务接口传输的字段对应标签
    @FieldsAnnotation(value = "统筹区编号")
    //excel对应实体类模板 value为表头，index为excel中的排列位置（从0开始）
    @ExcelProperty(value = "统筹区编号(必填)", index = 0)
    private String aaa027;
    @FieldsAnnotation(value = "姓名")
    @ExcelProperty(value = "姓名(必填)", index = 1)
    private String aac003;
    @FieldsAnnotation(value = "身份证号")
    @ExcelProperty(value = "身份证号(必填)", index = 2)
    private String aac002;
    @FieldsAnnotation(value = "就医地")
    @ExcelProperty(value = "就医地", index = 3)
    private String bae033;
    @FieldsAnnotation(value = "开始日期")
    @ExcelProperty(value = "开始日期", index = 4)
    private Long aae030;
    @FieldsAnnotation(value = "终止日期")
    @ExcelProperty(value = "终止日期", index = 5)
    private Long aae031;
    @FieldsAnnotation(value = "参保地")
    @ExcelProperty(value = "参保地", index = 6)
    private String aaa129;
    @FieldsAnnotation(value = "备案医疗机构名称")
    @ExcelProperty(value = "备案医疗机构名称", index = 7)
    private String akb021;
    @ExcelProperty(value = "问题描述（内部）", index = 9)
    private String reason;


}