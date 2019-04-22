package com.example.ssmdemo.factory;


import com.example.ssmdemo.serviceImpl.EmpServiceImpl;

public class ServiceFactory {
    public static EmpServiceImpl getIEmpServiceInstance(){
        return new EmpServiceImpl();
    }
}
