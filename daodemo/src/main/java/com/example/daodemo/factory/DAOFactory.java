package com.example.daodemo.factory;

import com.example.daodemo.dao.IEmpDao;
import com.example.daodemo.daoImpl.*;

import java.sql.Connection;

/**
 * 数据层的实现类--工厂设计类
 *
 * */

public class DAOFactory {
    public static IEmpDao getIEmpDAOInstance(Connection conn){
        return new EmpDAOImpl(conn);
    }
}
