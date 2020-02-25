package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwAc01;
import com.ylzbrt.dstb.entity.ZwKa08Temp;
import com.ylzbrt.dstb.entity.ZwKa08TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKa08TempMapper {
    int insert(ZwKa08Temp record);

    int insertSelective(ZwKa08Temp record);

    List<ZwKa08Temp> selectByExample(ZwKa08TempExample example);

    void ProZwKa08(Map<String,Object> map);

    List<ZwKa08Temp> selectZwKa08Temp(@Param("aaa027") String aaa027);


}