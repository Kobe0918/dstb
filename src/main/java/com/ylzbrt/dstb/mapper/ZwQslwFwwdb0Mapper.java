package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwQslwFwwdb0;
import com.ylzbrt.dstb.entity.ZwQslwFwwdb0Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwQslwFwwdb0Mapper {
    int insert(ZwQslwFwwdb0 record);

    int insertSelective(ZwQslwFwwdb0 record);

    List<ZwQslwFwwdb0> selectByExample(ZwQslwFwwdb0Example example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;
}