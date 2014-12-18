package com.shinowit.web;

import com.shinowit.entity.Entity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/17.
 */
@Controller
public class Test001 {

    @ModelAttribute
    public Entity newUser(){
        System.out.print("fdfsaf");
        Entity en=new Entity();
        en.setUsername("SB程程");
        en.setUserpass("doubi");
        return en;
    }

    @RequestMapping(value="/t1")
    public String test1(){
        return "aa";
    }
    @RequestMapping(value = "/t2")
    public String test2(@ModelAttribute Entity ent){
        ent.setUsername("doubi");
        return "aa";
    }

}
