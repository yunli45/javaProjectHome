package com.example.ssmdemo.controller;


import com.example.ssmdemo.factory.ServiceFactory;
import com.example.ssmdemo.vo.Emp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class indexController {

    @GetMapping("index")
     public List<Emp> testList(){
        List<Emp> rs = new ArrayList<Emp>();
        try {
            rs = ServiceFactory.getIEmpServiceInstance().list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
