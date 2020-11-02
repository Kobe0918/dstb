package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwKb01;
import com.ylzbrt.dstb.entity.ZwKb01Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwKb01Mapper {
    int insert(ZwKb01 record);

    int insertSelective(ZwKb01 record);

    List<ZwKb01> selectByExample(ZwKb01Example example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map);


}