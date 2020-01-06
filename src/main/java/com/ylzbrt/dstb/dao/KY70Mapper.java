package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.KY70;
import com.ylzbrt.dstb.entity.KY70Example;
import java.util.List;

public interface KY70Mapper {
    int insert(KY70 record);

    int insertSelective(KY70 record);

    List<KY70> selectByExample(KY70Example example);
}