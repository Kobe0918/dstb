package com.ylzbrt.dstb;


import com.ylzbrt.dstb.entity.ZwKslwTemp;
import com.ylzbrt.dstb.mapper.ZwKslwTempMapper;
import com.ylzbrt.dstb.service.IDstbService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

//@RunWith(SpringRunner.class)
//@MybatisTest    //缓存mybatsitest注解
@SpringBootTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
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


    @Resource
    public ZwKslwTempMapper mapper;
    @Autowired
    public IDstbService IDstbService;

    @Test
    public void test2() {
        int count = mapper.selectCountAkb021IsNotNull("350500");
        System.out.println(count);
    }

    @Test
    public void test3() {
        List<ZwKslwTemp> zwKslwTemps = mapper.selectZwKslwTempAkb021("350500");
        System.out.println(zwKslwTemps.size());
    }


//    @Test
//    public void test1666(){
//        try {
//        ConfigEntity entity = new ConfigEntity();
//        entity.setAaa027("350000");
//        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//
//            entity.setLastPassTime(simp.parse("2020-09-21 20:37:18"));
//
//        IDstbService.zwAc43(entity,"");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void test4(){
//        ConfigEntity entity = new ConfigEntity();
//        entity.setAaa027("350500");
//        IDstbService.zwKslw(entity);
//    }
//
//
//
//
//    @Test
//    public void test6(){
//        IDstbService.passErrorExcelData();
//    }
//

}
