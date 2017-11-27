package com.lty.tmp.service.common.constant;

public interface Constants {

    String ResultCode = "result_code";

    String ResultMsg = "result_msg";

    String TraceId = "trace_id";

    String SuccessCode = "0";

    String SuccessMsg = "success";

    String SESSION_KEY = "user";

    String TOKEN = "token";

    String DATA = "data";

    //Token
    public final static String TOKEN_PREFIX = "token_";
    public final static Long TOKEN_EXPIRE_TIME = 3 * 24 * 60 * 1000L;
}