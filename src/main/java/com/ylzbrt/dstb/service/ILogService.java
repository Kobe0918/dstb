package com.ylzbrt.dstb.service;

public interface ILogService {

    void doInsertLog(String catalog, String soapInXml, String results, String success);

    void updateLogIfTrue(String msg, String logId);

    void updateLogIfFalse(String msg, String logId, String resubmit);

    void updateLogIfFalse(String msg, String logId);

    void doDelete(String logId);
}
