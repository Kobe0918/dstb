package com.ylzbrt.dstb.service;

import com.ylzbrt.dstb.entity.*;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-02-12 21:20
 * @Description: ${Description}
 */
public interface IPassDataService {

    //测试
    @Async(value = "asyncServiceExecutor")
    void passDataAc43(List<ZwAc43Temp> ob);

    @Async(value = "asyncServiceExecutor")
    void passDataKc01(List<ZwKc01Temp> ob);

    @Async(value = "asyncServiceExecutor")
    void passDataKslw(List<ZwKslwTemp> ob);

    @Async(value = "asyncServiceExecutor")
    void passDataKa08(List<ZwKa08Temp> ob);

    @Async(value = "asyncServiceExecutor")
    void passDataAc01(List<ZwAc01> ob);

    @Async(value = "asyncServiceExecutor")
    void passDataKc26(List<ZwKc26Temp> ob);

    @Async(value = "asyncServiceExecutor")
    void passDataKc99(List<ZwKc99Temp> ob);
    //测试


    @Async(value = "asyncServiceExecutor")
    void passData(List<?> ob, Class<?> cl, String catalog, String action);

    @Async(value = "asyncServiceExecutor")
    void passErrorData(Zw_sjts_log data);


    void passErrorData2(Zw_sjts_log data);


}
