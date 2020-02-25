package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwAc43Temp;
import com.ylzbrt.dstb.entity.ZwAc43TempExample;
import com.ylzbrt.dstb.entity.ZwKa08Temp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwAc43TempMapper {
    int insert(ZwAc43Temp record);

    int insertSelective(ZwAc43Temp record);

    List<ZwAc43Temp> selectByExample(ZwAc43TempExample example);

    void ProZwAc43(Map<String,Object> map);
    void ProZwAc43390(Map<String,Object> map);

    List<ZwAc43Temp> selectZwAc43Temp(@Param("aaa027") String aaa027);
}