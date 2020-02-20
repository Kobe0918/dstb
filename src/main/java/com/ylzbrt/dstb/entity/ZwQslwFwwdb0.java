package com.ylzbrt.dstb.entity;

import com.ylzbrt.dstb.common.Name;

public class ZwQslwFwwdb0 {
    @Name("网点编号")
    private String fwwdbh;
    @Name("网点名称")
    private String fwwdmc;
    @Name("类别")
    private String wdlb00;
    @Name("地址")
    private String wddz00;
    @Name("所属医保中心")
    private String fzxmc0;
    @Name("所属区域")
    private String ssqy00;

    public String getFwwdbh() {
        return fwwdbh;
    }

    public void setFwwdbh(String fwwdbh) {
        this.fwwdbh = fwwdbh == null ? null : fwwdbh.trim();
    }

    public String getFwwdmc() {
        return fwwdmc;
    }

    public void setFwwdmc(String fwwdmc) {
        this.fwwdmc = fwwdmc == null ? null : fwwdmc.trim();
    }

    public String getWdlb00() {
        return wdlb00;
    }

    public void setWdlb00(String wdlb00) {
        this.wdlb00 = wdlb00 == null ? null : wdlb00.trim();
    }

    public String getWddz00() {
        return wddz00;
    }

    public void setWddz00(String wddz00) {
        this.wddz00 = wddz00 == null ? null : wddz00.trim();
    }

    public String getFzxmc0() {
        return fzxmc0;
    }

    public void setFzxmc0(String fzxmc0) {
        this.fzxmc0 = fzxmc0 == null ? null : fzxmc0.trim();
    }

    public String getSsqy00() {
        return ssqy00;
    }

    public void setSsqy00(String ssqy00) {
        this.ssqy00 = ssqy00 == null ? null : ssqy00.trim();
    }
}