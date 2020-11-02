package com.ylzbrt.dstb.entity;

import java.util.Date;

public class Zw_sjts_log {
    private String logid;

    private String catalog;

    private String results;

    private String success;

    private String resubmit;

    private Date inDate;

    private Date resubDate;

    private String soapinxml;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results == null ? null : results.trim();
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success == null ? null : success.trim();
    }

    public String getResubmit() {
        return resubmit;
    }

    public void setResubmit(String resubmit) {
        this.resubmit = resubmit == null ? null : resubmit.trim();
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getResubDate() {
        return resubDate;
    }

    public void setResubDate(Date resubDate) {
        this.resubDate = resubDate;
    }

    public String getSoapinxml() {
        return soapinxml;
    }

    public void setSoapinxml(String soapinxml) {
        this.soapinxml = soapinxml == null ? null : soapinxml.trim();
    }
}