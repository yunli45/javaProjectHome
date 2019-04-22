package com.example.ssmdemo.service;

import com.example.ssmdemo.dao.DemoMapper;
import com.example.ssmdemo.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    DemoMapper demoMapper;

    @Override
    public List<Demo> demoList(Integer id){
        return demoMapper.demoList(id);
    }

}
