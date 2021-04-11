package com.ylzbrt.dstb.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ClassAnnotation(value = "zw_kc01")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwKc01Temp {
    //政务接口传输的字段对应标签
    @FieldsAnnotation(value = "统筹区编号")
    //excel对应实体类模板 value为表头，index为excel中的排列位置（从0开始）
    @ExcelProperty(value = "统筹区编号(必填)", index = 0)
    private String aaa027;

    @FieldsAnnotation(value = "证件号码")
    @ExcelProperty(value = "证件号码(必填)", index = 1)
    private String aac002;

    @FieldsAnnotation(value = "姓名")
    @ExcelProperty(value = "姓名(必填)", index = 2)
    private String aac003;

    @FieldsAnnotation(value = "社保卡号")
    @ExcelProperty(value = "社保卡号", index = 5)
    private String aaz501;

    @FieldsAnnotation(value = "社保卡状态")
    @ExcelProperty(value = "社保卡状态", index = 6)
    private String aaz502;

    @FieldsAnnotation(value = "个人账户余额")
    @ExcelProperty(value = "个人账户余额", index = 7)
    private BigDecimal akc087;

    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;

    @FieldsAnnotation(value = "所属区域")
    @ExcelProperty(value = "所属区域", index = 3)
    private String ssqy00;

    @FieldsAnnotation(value = "所属县区")
    @ExcelProperty(value = "所属县区", index = 4)
    private String ssxq00;


    @ExcelProperty(value = "问题描述（内部）", index = 10)
    private String reason;

}