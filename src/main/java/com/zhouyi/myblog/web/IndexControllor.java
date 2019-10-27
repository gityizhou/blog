package com.zhouyi.myblog.web;


import com.zhouyi.myblog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControllor {

    @GetMapping("/")
    public String index(){
//        int i = 1/0;
        String blog = null;
        if(blog == null){
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}
