package com.nsy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:start
 * @Author:刘翔
 * @Description:
 **/
@RestController
public class start {
    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }
}
