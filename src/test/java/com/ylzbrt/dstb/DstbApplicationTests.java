package com.ylzbrt.dstb;


import com.ylzbrt.dstb.service.DsrwService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@MybatisTest    //缓存mybatsitest注解
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DstbApplicationTests {
//    @Resource
//    private Ky60Mapper ky60Mapper;
    @Test
    public void contextLoads() throws Exception {
  /*      Ky60Example ky60Example = new Ky60Example();
        //测试调用存储过程
        Map<String,Object> map = new HashMap <String,Object>();
        ky60Mapper.testReturnResult(map);
        System.out.println(map.get("code"));*/
//        List<Ky60> list =  ky60Mapper.selectByExample(ky60Example);
//        System.out.println(list.size());
//        for(Ky60  s : list)
//        {
//            System.out.println(s.toString());
//        }


    }
    @Test
    public void kb01test(){
        DsrwService dsrwService = new DsrwService();
        dsrwService.dealKb01();
    }

}
