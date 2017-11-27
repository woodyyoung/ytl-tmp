package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.DeviceFactoryOut;
import com.lty.tmp.service.bean.entity.autocreate.DeviceFactoryOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceFactoryOutMapper {
    long countByExample(DeviceFactoryOutExample example);

    int deleteByExample(DeviceFactoryOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceFactoryOut record);

    int insertSelective(DeviceFactoryOut record);

    List<DeviceFactoryOut> selectByExample(DeviceFactoryOutExample example);

    DeviceFactoryOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceFactoryOut record, @Param("example") DeviceFactoryOutExample example);

    int updateByExample(@Param("record") DeviceFactoryOut record, @Param("example") DeviceFactoryOutExample example);

    int updateByPrimaryKeySelective(DeviceFactoryOut record);

    int updateByPrimaryKey(DeviceFactoryOut record);
}