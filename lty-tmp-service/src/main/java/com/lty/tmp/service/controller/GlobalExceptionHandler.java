package com.lty.tmp.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.fasterxml.jackson.core.JsonParseException;
import com.lty.tmp.service.common.exception.BasicException;
import com.lty.tmp.service.common.message.CommonResult;
import com.lty.tmp.service.common.message.Result;

@ControllerAdvice
public class GlobalExceptionHandler {
	static Logger logger = LoggerFactory
			.getLogger(GlobalExceptionHandler.class);

	@ResponseBody
	@ExceptionHandler(Exception.class)
	public Object handleException(Exception ex) {
		ex.printStackTrace();

		if (ex instanceof org.springframework.web.multipart.MaxUploadSizeExceededException) {
			return log(CommonResult.REQUEST_OUT_SIZE);
		}

		if (ex instanceof HttpMessageNotReadableException) {
			if (ex.getCause() instanceof JsonParseException) {
				return log(CommonResult.JSON_INVALID);
			}
		}

		if (ex instanceof MissingServletRequestParameterException) {
			return log(CommonResult.PARAMETER_MISSING);
		}

		if (ex instanceof HttpMediaTypeNotSupportedException) {
			return log(CommonResult.NOT_SUPPORT_FORMAT);
		}

		if (ex instanceof MethodArgumentTypeMismatchException) {
			return log(CommonResult.PARAMETER_ERROR);
		}

		if (ex instanceof DuplicateKeyException) {
			return log(CommonResult.DUPLICATE_RECORD);
		}

		if (ex instanceof BasicException) {
			return log(((BasicException) ex).getResultCode(),
					((BasicException) ex).getResultMsg());
			// return (BasicException) ex;
			// return new BasicException(CommonResult.UNKNOWN_SYSTEM_ERROR);
		}

		return log(CommonResult.UNKNOWN_SYSTEM_ERROR);
	}

	private Result log(CommonResult commonResult) {
		logger.error(commonResult.getResultCode() + " "
				+ commonResult.getResultMsg());
		return new Result(commonResult);
	}

	private Result log(String code, String msg) {
		logger.error(code + " " + msg);
		return new Result(code, msg);
	}
}