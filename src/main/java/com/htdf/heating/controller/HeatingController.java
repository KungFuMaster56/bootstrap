package com.htdf.heating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeatingController {
	
    @RequestMapping({"/","/index"})
    public String index(){
       return"/index";
    }
   
    @GetMapping("/login")
    public String login(){
       return"login";
    }
    
    @GetMapping("/{page}.html")
    public String page(@PathVariable("page")String page){
    	return page;
    }
}
