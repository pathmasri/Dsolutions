package com.dsolutions.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class Home {  
  
    @RequestMapping("/submitjob")  
    public ModelAndView showMessage() {  
        System.out.println("from controller");  
        return new ModelAndView("hello", "message", "test");  
       
    }  
}  
