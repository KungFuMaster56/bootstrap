package com.htdf.heating.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: GlobalExceptionHandler 
 * @Description: 全局异常处理
 * @author: yuy
 * @date: 2017年8月25日 下午3:36:02
 */
//@ControllerAdvice
public class GlobalExceptionHandler {
	
    public static final String DEFAULT_ERROR_VIEW = "error";
	
	//@ExceptionHandler(value=Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e){
		ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
	}
}
