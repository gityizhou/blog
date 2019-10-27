package com.zhouyi.myblog.web;


import com.zhouyi.myblog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexControllor {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name){
//        int i = 1/0;
//        String blog = null;
//        if(blog == null){
//            throw new NotFoundException("博客不存在");
//        }
        return "index";
    }
}
