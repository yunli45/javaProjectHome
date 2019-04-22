package com.example.daodemo.factory;

import com.example.daodemo.service.IEmpService;
import com.example.daodemo.serviceImpl.EmpServiceImpl;

public class  ServiceFactory {
    public static IEmpService getIEmpServiceInstance(){
        return new EmpServiceImpl() ;
    }

}
