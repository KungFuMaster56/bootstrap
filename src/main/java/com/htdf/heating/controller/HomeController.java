package com.htdf.heating.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest reqeust,String username){
		ModelAndView mv = new ModelAndView("/login");
		String msg ="";
		String	exception = (String) reqeust.getAttribute("shiroLoginFailure");
		if(!StringUtils.isEmpty(exception)){
			if (UnknownAccountException.class.getName().equals(exception)) {  
				msg = "UnknownAccountException -- > 账号不存在：";  
			} else if (IncorrectCredentialsException.class.getName().equals(exception)) {  
				msg = "IncorrectCredentialsException -- > 密码不正确：";  
			} else if ("kaptchaValidateFailed".equals(exception)) {  
				msg = "kaptchaValidateFailed -- > 验证码错误";  
			} else {  
				msg = "else >> "+exception;  
			}  
		}
		mv.addObject("msg", msg);
		return mv;
	}
}
