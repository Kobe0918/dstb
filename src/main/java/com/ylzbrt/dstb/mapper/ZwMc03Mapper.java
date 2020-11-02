package com.ylzbrt.dstb.mapper;

import com.ylzbrt.dstb.entity.ZwMc03;
import com.ylzbrt.dstb.entity.ZwMc03Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ZwMc03Mapper {
    int insert(ZwMc03 record);

    int insertSelective(ZwMc03 record);

    List<ZwMc03> selectByExample(ZwMc03Example example);

    /**
     * 调用存储过程
     *
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;
}