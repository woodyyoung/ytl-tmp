package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.ParamConfig;
import com.lty.tmp.service.bean.entity.autocreate.ParamConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamConfigMapper {
    long countByExample(ParamConfigExample example);

    int deleteByExample(ParamConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParamConfig record);

    int insertSelective(ParamConfig record);

    List<ParamConfig> selectByExample(ParamConfigExample example);

    ParamConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParamConfig record, @Param("example") ParamConfigExample example);

    int updateByExample(@Param("record") ParamConfig record, @Param("example") ParamConfigExample example);

    int updateByPrimaryKeySelective(ParamConfig record);

    int updateByPrimaryKey(ParamConfig record);
}