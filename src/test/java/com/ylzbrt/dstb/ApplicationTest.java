package com.ylzbrt.dstb;

import com.ylzbrt.dstb.entity.ZwKslwTemp;
import com.ylzbrt.dstb.mapper.ZwKslwTempMapper;
import com.ylzbrt.dstb.service.IDstbService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb
 * @Author: lzh
 * @CreateTime: 2020-05-20 15:39
 * @Description: ${Description}
 */
@SpringBootTest
class ApplicationTest {

    @Autowired
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
//    public void test4(){
//        ConfigEntity entity = new ConfigEntity();
//        entity.setAaa027("350500");
//        IDstbService.zwKslw(entity);
//    }
}
