package com.lty.tmp.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lty.tmp.service.bean.entity.AdVersion;
import com.lty.tmp.service.bean.entity.AppUpgradeVersion;
import com.lty.tmp.service.bean.entity.autocreate.BlackListVersion;
import com.lty.tmp.service.bean.entity.autocreate.LineVersion;

public interface VersionMapper {
   
    List<LineVersion> getLineVersion(@Param("xmlType") String xmlType);
    
    List<AdVersion> getAdVersion();
    
    List<AppUpgradeVersion> getAppUpgradeVersion();
    
    List<BlackListVersion> getBlackListVersion();

}