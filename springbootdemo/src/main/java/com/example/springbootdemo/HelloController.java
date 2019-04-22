package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello Sping Boot";
    }

}
