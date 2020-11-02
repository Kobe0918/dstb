package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwMc01;
import com.ylzbrt.dstb.entity.ZwMc01Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwMc01Mapper {
    int insert(ZwMc01 record);

    int insertSelective(ZwMc01 record);

    List<ZwMc01> selectByExample(ZwMc01Example example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;
}