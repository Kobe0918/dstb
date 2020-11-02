package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.ClassAnnotation;
import com.ylzbrt.dstb.annotion.FieldsAnnotation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@ClassAnnotation(value="zw_kc26")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZwKc26Temp {
    @FieldsAnnotation(value = "统筹区编号")
    private String aaa027;

    @FieldsAnnotation(value = "身份证号")
    private String aac002;

    @FieldsAnnotation(value = "姓名")
    private String aac003;

    @FieldsAnnotation(value = "险种类别")
    private String aae140;

    @FieldsAnnotation(value = "消费时间")
    private Integer ake007;

    @FieldsAnnotation(value = "网点名称")
    private String akb021;

    @FieldsAnnotation(value = "单据流水号")
    private String aae072;

    @FieldsAnnotation(value = "门诊号")
    private String akc190;

    @FieldsAnnotation(value = "本次总费用")
    private BigDecimal akc227;

    @FieldsAnnotation(value = "医保费用")
    private BigDecimal bkc008;

    @FieldsAnnotation(value = "现金支付金额")
    private BigDecimal bkc040;

    @FieldsAnnotation(value = "个人账户支付")
    private BigDecimal bkc041;

    @FieldsAnnotation(value = "基金支付金额")
    private Integer bkc045;

    @FieldsAnnotation(value = "商保基金支付")
    private BigDecimal bkc052;

    @FieldsAnnotation(value = "消费时工作状态")
    private String aac066;

    @FieldsAnnotation(value = "数据更新时间")
    private String aae035;

    @FieldsAnnotation(value = "就医地")
    private String bkf010;

    @FieldsAnnotation(value = "特殊病种类型")
    private String aka035;

    @FieldsAnnotation(value = "普通门诊待遇类型")
    private String pmdylx;

    @FieldsAnnotation(value = "消费类型")
    private String xflx00;

    @FieldsAnnotation(value = "所属区域")
    private String ssqy00;

    @FieldsAnnotation(value = "所属县区")
    private String ssxq00;


}