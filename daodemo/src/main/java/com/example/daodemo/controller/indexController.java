package com.example.daodemo.controller;

import com.example.daodemo.factory.ServiceFactory;
import com.example.daodemo.vo.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/***
 *  注解说明：
 *
 */

//@RestController
@Controller
public class indexController {

//    @GetMapping("index")
    @RequestMapping("/ind")
    @ResponseBody
    public List<Emp> demoList(){
        List<Emp> rs = new ArrayList<Emp>() ;
        try {
            rs = ServiceFactory.getIEmpServiceInstance().list();


        } catch (Exception e) {
             e.printStackTrace();

        }
        return rs;
    }

    @RequestMapping("/hi1")
    @ResponseBody
    public String hello1(){
        return "这是数据，用于简单的测试";
    }

    @RequestMapping("/hi2")
    public String hello2(){
        // 会直接访问templtes文件夹中对应的html文件，将html中内容发送给客户端
        return "index";
    }
}
