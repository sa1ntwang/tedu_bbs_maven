package com.tedu.common.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.common.ov.JsonResult;


/**
 * 
 * @ControllerAdvice 修饰的类为一个全局异常处理方法
 *
 */

@ControllerAdvice
public class GlobalExceptionHandle {
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public  JsonResult doHandleRuntimeException(
			RuntimeException e) {
		e.printStackTrace();
		return new JsonResult(e);
		
	}
}
