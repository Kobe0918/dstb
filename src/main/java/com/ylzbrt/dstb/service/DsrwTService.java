package com.ylzbrt.dstb.service;

import com.ylzbrt.dstb.entity.ConfigEntity;
import org.apache.cxf.endpoint.Client;
import org.springframework.scheduling.annotation.Async;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-01-13 11:54
 * @Description: ${Description}
 */
public interface DsrwTService {


      void zwAc01();

      void zwKa08();

      @Async
      void zwKc01();

      @Async
      void zwKc99();

      @Async
      void zwKslw();

      @Async
      void zwAc43();

      @Async
      void zwKc26();


}
