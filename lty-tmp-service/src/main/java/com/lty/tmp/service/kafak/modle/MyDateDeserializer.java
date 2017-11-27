package com.lty.tmp.service.kafak.modle;

import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * 
 * @描述: 
 * @作者: PXF
 * @创建时间: 2017年10月20日
 * @版本: 1.0
 */
@Component
public class MyDateDeserializer extends JsonDeserializer<Date> {

	@Override  
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {  
		
//        String value = jp.getValueAsString();
//        Long longvalue = Long.valueOf("value");
//        Long datevalue =longvalue * 1000;
//        String valuedate = String.valueOf(datevalue);
		
		long longvalue = jp.getLongValue();
		Long datevalue =longvalue * 1000;
//		String valuedate = String.valueOf(datevalue);
//      DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		
        try {  
            return new Date(datevalue);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
    }  

}
