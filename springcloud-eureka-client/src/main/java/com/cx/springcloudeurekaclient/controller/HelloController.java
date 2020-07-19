package com.cx.springcloudeurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String sayHi(String name){
        System.out.println("调用此处");
        return "Hello "+name;
    };
}
