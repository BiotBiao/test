package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.management.modelmbean.ModelMBean;

/**
 * Created by Administrator on 2014/12/17.
 */
@Controller
public class test {
    @RequestMapping("/test")
    public String login (Model model ){
//        ModelAndView mo=new ModelAndView();
        model.addAttribute("name","sb程程");
        return "test";
    }
}
