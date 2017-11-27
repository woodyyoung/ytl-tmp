package com.lty.tmp.service.mapper;

import com.lty.tmp.service.bean.entity.autocreate.DeviceHardware;
import com.lty.tmp.service.bean.entity.autocreate.DeviceHardwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceHardwareMapper {
    long countByExample(DeviceHardwareExample example);

    int deleteByExample(DeviceHardwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceHardware record);

    int insertSelective(DeviceHardware record);

    List<DeviceHardware> selectByExample(DeviceHardwareExample example);

    DeviceHardware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceHardware record, @Param("example") DeviceHardwareExample example);

    int updateByExample(@Param("record") DeviceHardware record, @Param("example") DeviceHardwareExample example);

    int updateByPrimaryKeySelective(DeviceHardware record);

    int updateByPrimaryKey(DeviceHardware record);
}