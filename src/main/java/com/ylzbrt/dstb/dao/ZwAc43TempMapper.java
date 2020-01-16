package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwAc43Temp;
import com.ylzbrt.dstb.entity.ZwAc43TempExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZwAc43TempMapper {
    int insert(ZwAc43Temp record);

    int insertSelective(ZwAc43Temp record);

    List<ZwAc43Temp> selectByExample(ZwAc43TempExample example);
}