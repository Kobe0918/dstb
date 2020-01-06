package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwKa03;
import com.ylzbrt.dstb.entity.ZwKa03Example;
import java.util.List;

public interface ZwKa03Mapper {
    int insert(ZwKa03 record);

    int insertSelective(ZwKa03 record);

    List<ZwKa03> selectByExample(ZwKa03Example example);
}