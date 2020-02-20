package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa08Temp;
import com.ylzbrt.dstb.entity.ZwKc26Temp;
import com.ylzbrt.dstb.entity.ZwKc26TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKc26TempMapper {
    int insert(ZwKc26Temp record);

    int insertSelective(ZwKc26Temp record);

    List<ZwKc26Temp> selectByExample(ZwKc26TempExample example);

    void ProZwKc26(Map<String,Object> map);

    List<ZwKc26Temp> selectZwKc26Temp();

}