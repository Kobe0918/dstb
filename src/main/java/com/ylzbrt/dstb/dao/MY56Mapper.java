package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.MY56;
import com.ylzbrt.dstb.entity.MY56Example;
import java.util.List;

public interface MY56Mapper {
    int insert(MY56 record);

    int insertSelective(MY56 record);

    List<MY56> selectByExample(MY56Example example);
}