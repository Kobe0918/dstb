package com.ylzbrt.dstb;

import com.ylzbrt.dstb.dao.Ky60Mapper;
import com.ylzbrt.dstb.entity.Ky60;
import com.ylzbrt.dstb.entity.Ky60Example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@MybatisTest    //缓存mybatsitest注解
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DstbApplicationTests {
    @Resource
    private Ky60Mapper ky60Mapper;
    @Test
    public void contextLoads() throws Exception {
        Ky60Example ky60Example = new Ky60Example();
        //测试调用存储过程
        Map<String,Object> map = new HashMap <String,Object>();
        ky60Mapper.testReturnResult(map);
        System.out.println(map.get("code"));
//        List<Ky60> list =  ky60Mapper.selectByExample(ky60Example);
//        System.out.println(list.size());
//        for(Ky60  s : list)
//        {
//            System.out.println(s.toString());
//        }


    }

}
