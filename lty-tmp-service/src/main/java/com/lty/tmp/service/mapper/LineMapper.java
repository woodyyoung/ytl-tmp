package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.Line;
import com.lty.tmp.service.bean.entity.autocreate.LineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineMapper {
    long countByExample(LineExample example);

    int deleteByExample(LineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Line record);

    int insertSelective(Line record);

    List<Line> selectByExample(LineExample example);

    Line selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Line record, @Param("example") LineExample example);

    int updateByExample(@Param("record") Line record, @Param("example") LineExample example);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}