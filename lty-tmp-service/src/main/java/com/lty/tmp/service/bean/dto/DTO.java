package com.lty.tmp.service.bean.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DTO implements Serializable{
}
