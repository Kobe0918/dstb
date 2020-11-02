package com.ylzbrt.dstb.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ClassAnnotation(value = "zw_ac01")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwAc01 {
    //政务接口传输的字段对应标签
    @FieldsAnnotation(value = "姓名")
    //excel对应实体类模板 value为表头，index为excel中的排列位置（从0开始）
    @ExcelProperty(value = "姓名(必填)", index = 2)
    private String aac003;
    @FieldsAnnotation(value = "身份证件类型")
    @ExcelProperty(value = "身份证件类型", index = 3)
    private String aac058;
    @FieldsAnnotation(value = "身份证号码")
    @ExcelProperty(value = "身份证号码(必填)", index = 4)
    private String aac002;
    @FieldsAnnotation(value = "性别")
    @ExcelProperty(value = "性别", index = 5)
    private String aac004;
    @FieldsAnnotation(value = "民族")
    @ExcelProperty(value = "民族", index = 6)
    private String aac005;
    @FieldsAnnotation(value = "出生日期")
    @ExcelProperty(value = "出生日期", index = 7)
    private Integer aac006;
    @FieldsAnnotation(value = "联系电话")
    @ExcelProperty(value = "联系电话", index = 9)
    private String aae005;
    @FieldsAnnotation(value = "地址")
    @ExcelProperty(value = "地址", index = 10)
    private String aae006;
    @FieldsAnnotation(value = "邮政编码")
    @ExcelProperty(value = "邮政编码", index = 11)
    private String aae007;
    @FieldsAnnotation(value = "统筹区编号")
    @ExcelProperty(value = "统筹区编号(必填)", index = 1)
    private String aaa027;
    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;
    @FieldsAnnotation(value = "所属地级市行政区域")
    @ExcelProperty(value = "所属地级市行政区划代码", index = 0)
    private String yae512;
    @FieldsAnnotation(value = "移动电话")
    @ExcelProperty(value = "移动电话", index = 8)
    private String acb501;
    @FieldsAnnotation(value = "备注")
    @ExcelProperty(value = "备注", index = 12)
    private String aae013;
    @ExcelProperty(value = "问题描述（内部）", index = 15)
    private String reason;


}