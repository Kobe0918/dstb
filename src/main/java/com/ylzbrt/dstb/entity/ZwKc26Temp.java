package com.ylzbrt.dstb.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.ylzbrt.dstb.common.ClassAnnotation;
import com.ylzbrt.dstb.common.FieldsAnnotation;

@ClassAnnotation(value="zw_kc26")
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
    private Short bkc045;

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

    public String getAaa027() {
        return aaa027;
    }

    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027 == null ? null : aaa027.trim();
    }

    public String getAac002() {
        return aac002;
    }

    public void setAac002(String aac002) {
        this.aac002 = aac002 == null ? null : aac002.trim();
    }

    public String getAac003() {
        return aac003;
    }

    public void setAac003(String aac003) {
        this.aac003 = aac003 == null ? null : aac003.trim();
    }

    public String getAae140() {
        return aae140;
    }

    public void setAae140(String aae140) {
        this.aae140 = aae140 == null ? null : aae140.trim();
    }

    public Integer getAke007() {
        return ake007;
    }

    public void setAke007(Integer ake007) {
        this.ake007 = ake007;
    }

    public String getAkb021() {
        return akb021;
    }

    public void setAkb021(String akb021) {
        this.akb021 = akb021 == null ? null : akb021.trim();
    }

    public String getAae072() {
        return aae072;
    }

    public void setAae072(String aae072) {
        this.aae072 = aae072 == null ? null : aae072.trim();
    }

    public String getAkc190() {
        return akc190;
    }

    public void setAkc190(String akc190) {
        this.akc190 = akc190 == null ? null : akc190.trim();
    }

    public BigDecimal getAkc227() {
        return akc227;
    }

    public void setAkc227(BigDecimal akc227) {
        this.akc227 = akc227;
    }

    public BigDecimal getBkc008() {
        return bkc008;
    }

    public void setBkc008(BigDecimal bkc008) {
        this.bkc008 = bkc008;
    }

    public BigDecimal getBkc040() {
        return bkc040;
    }

    public void setBkc040(BigDecimal bkc040) {
        this.bkc040 = bkc040;
    }

    public BigDecimal getBkc041() {
        return bkc041;
    }

    public void setBkc041(BigDecimal bkc041) {
        this.bkc041 = bkc041;
    }

    public Short getBkc045() {
        return bkc045;
    }

    public void setBkc045(Short bkc045) {
        this.bkc045 = bkc045;
    }

    public BigDecimal getBkc052() {
        return bkc052;
    }

    public void setBkc052(BigDecimal bkc052) {
        this.bkc052 = bkc052;
    }

    public String getAac066() {
        return aac066;
    }

    public void setAac066(String aac066) {
        this.aac066 = aac066 == null ? null : aac066.trim();
    }

    public String getAae035() {
        return aae035;
    }

    public void setAae035(String aae035) {
        this.aae035 = aae035;
    }

    public String getBkf010() {
        return bkf010;
    }

    public void setBkf010(String bkf010) {
        this.bkf010 = bkf010 == null ? null : bkf010.trim();
    }

    public String getAka035() {
        return aka035;
    }

    public void setAka035(String aka035) {
        this.aka035 = aka035 == null ? null : aka035.trim();
    }

    public String getPmdylx() {
        return pmdylx;
    }

    public void setPmdylx(String pmdylx) {
        this.pmdylx = pmdylx == null ? null : pmdylx.trim();
    }

    public String getXflx00() {
        return xflx00;
    }

    public void setXflx00(String xflx00) {
        this.xflx00 = xflx00 == null ? null : xflx00.trim();
    }

    public String getSsqy00() {
        return ssqy00;
    }

    public void setSsqy00(String ssqy00) {
        this.ssqy00 = ssqy00 == null ? null : ssqy00.trim();
    }

    public String getSsxq00() {
        return ssxq00;
    }

    public void setSsxq00(String ssxq00) {
        this.ssxq00 = ssxq00 == null ? null : ssxq00.trim();
    }
}