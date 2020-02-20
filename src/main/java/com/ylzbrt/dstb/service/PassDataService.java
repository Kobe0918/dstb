package com.ylzbrt.dstb.service;

import org.apache.cxf.endpoint.Client;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-02-12 21:20
 * @Description: ${Description}
 */
public interface PassDataService {

    @Async
    void passData(List <?> ob, Class <?> cl ,String catalog,String guid);
}
