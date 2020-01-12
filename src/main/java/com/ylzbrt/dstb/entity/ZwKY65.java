package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.common.Name;

import java.math.BigDecimal;

public class ZwKY65 {
    @Name("统筹区编号")
    private String aaa027;
    @Name("身份证号码")
    private String aac002;
    @Name("姓名")
    private String aac003;
    @Name("单位名称")
    private String aab004;
    @Name("年度")
    private Short aae001;
    @Name("个人月缴费基数")
    private BigDecimal aae340;
    @Name("本年划入个人账户金额")
    private BigDecimal ake505;
    @Name("本年住院次数")
    private Integer akc501;
    @Name("本年药店费用")
    private BigDecimal bnydfy;
    @Name("本年普通门诊医保累计费用")
    private BigDecimal bnpmlj;
    @Name("本年特殊门诊医保累计费用")
    private BigDecimal bntmlj;
    @Name("本年住院医保累计费用")
    private BigDecimal bnzylj;
    @Name("本年个人账户支付金额")
    private BigDecimal bkc041;
    @Name("本年统筹基金支付金额")
    private BigDecimal bkc045;
    @Name("本年大额医疗费用补助基金支付金额")
    private BigDecimal bkc052;
    @Name("本年个人现金支付")
    private BigDecimal akc502;

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

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004 == null ? null : aab004.trim();
    }

    public Short getAae001() {
        return aae001;
    }

    public void setAae001(Short aae001) {
        this.aae001 = aae001;
    }

    public BigDecimal getAae340() {
        return aae340;
    }

    public void setAae340(BigDecimal aae340) {
        this.aae340 = aae340;
    }

    public BigDecimal getAke505() {
        return ake505;
    }

    public void setAke505(BigDecimal ake505) {
        this.ake505 = ake505;
    }

    public Integer getAkc501() {
        return akc501;
    }

    public void setAkc501(Integer akc501) {
        this.akc501 = akc501;
    }

    public BigDecimal getBnydfy() {
        return bnydfy;
    }

    public void setBnydfy(BigDecimal bnydfy) {
        this.bnydfy = bnydfy;
    }

    public BigDecimal getBnpmlj() {
        return bnpmlj;
    }

    public void setBnpmlj(BigDecimal bnpmlj) {
        this.bnpmlj = bnpmlj;
    }

    public BigDecimal getBntmlj() {
        return bntmlj;
    }

    public void setBntmlj(BigDecimal bntmlj) {
        this.bntmlj = bntmlj;
    }

    public BigDecimal getBnzylj() {
        return bnzylj;
    }

    public void setBnzylj(BigDecimal bnzylj) {
        this.bnzylj = bnzylj;
    }

    public BigDecimal getBkc041() {
        return bkc041;
    }

    public void setBkc041(BigDecimal bkc041) {
        this.bkc041 = bkc041;
    }

    public BigDecimal getBkc045() {
        return bkc045;
    }

    public void setBkc045(BigDecimal bkc045) {
        this.bkc045 = bkc045;
    }

    public BigDecimal getBkc052() {
        return bkc052;
    }

    public void setBkc052(BigDecimal bkc052) {
        this.bkc052 = bkc052;
    }

    public BigDecimal getAkc502() {
        return akc502;
    }

    public void setAkc502(BigDecimal akc502) {
        this.akc502 = akc502;
    }
}