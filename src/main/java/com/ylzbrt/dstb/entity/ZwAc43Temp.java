package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ClassAnnotation(value="zw_ac43")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwAc43Temp {
    @FieldsAnnotation(value = "统筹区编号")
    private String aaa027;

    @FieldsAnnotation(value = "身份证号")
    private String aac002;

    @FieldsAnnotation(value = "姓名")
    private String aac003;

    @FieldsAnnotation(value = "险种类型")
    private String aae140;

    @FieldsAnnotation(value = "个人缴费划入账户金额")
    private Short aae023;

    @FieldsAnnotation(value = "账目类型")
    private String aaa119;

    @FieldsAnnotation(value = "缴费基数")
    private BigDecimal aae340;

    @FieldsAnnotation(value = "建账年月")
    private Integer aae206;

    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;

    @FieldsAnnotation(value = "账目年月")
    private Integer zmny00;

    @FieldsAnnotation(value = "个人缴费金额")
    private BigDecimal grjfje;

    @FieldsAnnotation(value = "单位缴费金额")
    private BigDecimal dwjfje;

    @FieldsAnnotation(value = "划拨日期")
    private Integer hbrq00;

    @FieldsAnnotation(value = "缴费划拨id")
    private BigDecimal aaz223;

    private String bae536;
    private String ywbz00;

}