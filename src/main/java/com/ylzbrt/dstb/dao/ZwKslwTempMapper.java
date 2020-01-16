package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwAc01;
import com.ylzbrt.dstb.entity.ZwKslwTemp;
import com.ylzbrt.dstb.entity.ZwKslwTempExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface ZwKslwTempMapper {
    int insert(ZwKslwTemp record);

    int insertSelective(ZwKslwTemp record);

    List<ZwKslwTemp> selectByExample(ZwKslwTempExample example);

    void ProZwKslw(Map<String,Object> map);

    List<ZwKslwTemp> selectZwKslwTemp();
}