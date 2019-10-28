package com.zhouyi.myblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexControllor {

    @GetMapping("/")
    public String index(){
//        int i = 1/0;
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

}
