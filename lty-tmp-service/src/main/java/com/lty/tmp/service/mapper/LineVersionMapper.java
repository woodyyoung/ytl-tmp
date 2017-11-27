package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.LineVersion;
import com.lty.tmp.service.bean.entity.autocreate.LineVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineVersionMapper {
    long countByExample(LineVersionExample example);

    int deleteByExample(LineVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LineVersion record);

    int insertSelective(LineVersion record);

    List<LineVersion> selectByExample(LineVersionExample example);

    LineVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LineVersion record, @Param("example") LineVersionExample example);

    int updateByExample(@Param("record") LineVersion record, @Param("example") LineVersionExample example);

    int updateByPrimaryKeySelective(LineVersion record);

    int updateByPrimaryKey(LineVersion record);
}