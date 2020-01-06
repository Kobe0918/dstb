package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwMca1;
import com.ylzbrt.dstb.entity.ZwMca1Example;
import java.util.List;

public interface ZwMca1Mapper {
    int insert(ZwMca1 record);

    int insertSelective(ZwMca1 record);

    List<ZwMca1> selectByExample(ZwMca1Example example);
}