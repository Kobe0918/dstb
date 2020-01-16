package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKc01Temp;
import com.ylzbrt.dstb.entity.ZwKc01TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZwKc01TempMapper {
    int insert(ZwKc01Temp record);

    int insertSelective(ZwKc01Temp record);

    List<ZwKc01Temp> selectByExample(ZwKc01TempExample example);
}