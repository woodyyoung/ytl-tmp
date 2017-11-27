package com.lty.tmp.service.bean.dto;

/**
 * Created by linming on 2017/7/12.
 */
public class BasicRequestDTO extends DTO{
//    @NotNull(message = "token不能为空")
//    @JsonProperty(Constants.TOKEN)
    protected String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
