package com.example.ssmdemo.controller;

import com.example.ssmdemo.model.Demo;
import com.example.ssmdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
public class IndexController {

//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    @ResponseBody

    @Autowired
    DemoService demoService;

    @GetMapping("index0")
    public List<Demo> demoList(Integer id){
        return demoService.demoList(id);
    }

    @GetMapping("/index")
    public Map<String , String> index(){
        Map map = new HashMap();
        map.put("技能书","修正元");
        return map;
    }


}
