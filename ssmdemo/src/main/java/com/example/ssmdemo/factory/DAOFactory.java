package com.example.ssmdemo.factory;


import com.example.ssmdemo.dao.IEmpDAO;
import com.example.ssmdemo.daoImpl.EmpDAOImpl;

import java.sql.Connection;

/**
 * 数据层的实现类--工厂设计类
 * */
public class DAOFactory {
    public static IEmpDAO getIEmpDAOInstance(Connection conn){
        return new EmpDAOImpl(conn);
    }
}
