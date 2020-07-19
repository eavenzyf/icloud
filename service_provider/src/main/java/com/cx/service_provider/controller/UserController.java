package com.cx.service_provider.controller;
import com.cx.service_provider.service.ISayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ISayHiService sayHiService;
    @GetMapping("hi")
    String sayHi(String name){
        System.out.println("hello");
        return sayHiService.sayHi(name);
    };
}
