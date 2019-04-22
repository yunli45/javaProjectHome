package com.example.ssmdemo.dao;

import com.example.ssmdemo.model.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
//@Repository
@Service
public interface DemoMapper {
    @Select("select *  from demo where id=#{id}")
    List<Demo> demoList(Integer id);
}
