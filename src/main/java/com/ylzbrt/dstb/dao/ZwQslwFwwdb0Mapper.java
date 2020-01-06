package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.ZwQslwFwwdb0;
import com.ylzbrt.dstb.entity.ZwQslwFwwdb0Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ZwQslwFwwdb0Mapper {
    int insert(ZwQslwFwwdb0 record);

    int insertSelective(ZwQslwFwwdb0 record);

    List<ZwQslwFwwdb0> selectByExample(ZwQslwFwwdb0Example example);
}