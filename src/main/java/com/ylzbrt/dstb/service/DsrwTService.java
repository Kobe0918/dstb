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


      void zwAc01(ConfigEntity configEntity);
      void zwKa08(ConfigEntity configEntity);
      void zwKc01(ConfigEntity configEntity);
      void zwKc99(ConfigEntity configEntity);
      void zwKslw(ConfigEntity configEntity);
      void zwAc43(ConfigEntity configEntity);
      void zwKc26(ConfigEntity configEntity);


}
