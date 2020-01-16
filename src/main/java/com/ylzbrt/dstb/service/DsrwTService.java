package com.ylzbrt.dstb.service;

import com.ylzbrt.dstb.entity.ConfigEntity;
import org.springframework.scheduling.annotation.Async;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.service
 * @Author: lzh
 * @CreateTime: 2020-01-13 11:54
 * @Description: ${Description}
 */
public interface DsrwTService {


      @Async
      void zwAc01();

      @Async
      void zwKa08();

      @Async
      void zwKslw();
}
