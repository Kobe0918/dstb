package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwMc03;
import com.ylzbrt.dstb.entity.ZwMc03Example;
import java.util.List;

public interface ZwMc03Mapper {
    int insert(ZwMc03 record);

    int insertSelective(ZwMc03 record);

    List<ZwMc03> selectByExample(ZwMc03Example example);
}