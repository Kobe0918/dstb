package com.ylzbrt.dstb.dao;

import com.ylzbrt.dstb.entity.MY56;
import com.ylzbrt.dstb.entity.MY56Example;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface MY56Mapper {
    int insert(MY56 record);

    int insertSelective(MY56 record);

    List<MY56> selectByExample(MY56Example example);
    /**
     * 调用存储过程
     * @param map
     * @throws SQLException
     */
    void accessPro(Map map) throws SQLException;


}