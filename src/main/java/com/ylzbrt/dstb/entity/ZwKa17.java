package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.annotion.Name;

public class ZwKa17 {
    @Name("病种名称")
    private String bke043;
    @Name("商品名")
    private String aka091;
    @Name("规格")
    private String aka074;
    @Name("是否医保项目")
    private String bka001;
    @Name("自付比例")
    private String bka010;
    @Name("药品类别")
    private String aka065;
    @Name("所属区域")
    private String ssqy00;
    @Name("诊疗编码")
    private String aka090;

    public String getBke043() {
        return bke043;
    }

    public void setBke043(String bke043) {
        this.bke043 = bke043 == null ? null : bke043.trim();
    }

    public String getAka091() {
        return aka091;
    }

    public void setAka091(String aka091) {
        this.aka091 = aka091 == null ? null : aka091.trim();
    }

    public String getAka074() {
        return aka074;
    }

    public void setAka074(String aka074) {
        this.aka074 = aka074 == null ? null : aka074.trim();
    }

    public String getBka001() {
        return bka001;
    }

    public void setBka001(String bka001) {
        this.bka001 = bka001 == null ? null : bka001.trim();
    }

    public String getBka010() {
        return bka010;
    }

    public void setBka010(String bka010) {
        this.bka010 = bka010 == null ? null : bka010.trim();
    }

    public String getAka065() {
        return aka065;
    }

    public void setAka065(String aka065) {
        this.aka065 = aka065 == null ? null : aka065.trim();
    }

    public String getSsqy00() {
        return ssqy00;
    }

    public void setSsqy00(String ssqy00) {
        this.ssqy00 = ssqy00 == null ? null : ssqy00.trim();
    }

    public String getAka090() {
        return aka090;
    }

    public void setAka090(String aka090) {
        this.aka090 = aka090 == null ? null : aka090.trim();
    }
}