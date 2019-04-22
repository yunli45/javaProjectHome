package com.example.daodemo.test;

import com.example.daodemo.dbc.DatabaseConnection;
import com.example.daodemo.factory.ServiceFactory;
import com.example.daodemo.vo.Emp;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestEmpFindAll {
    public static void main(String[] args) {
        Emp vo = new Emp() ;

//        try {
//            ServiceFactory.getIEmpServiceInstance().insert(vo);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            List<Emp> rs = new ArrayList<Emp>() ;
            rs = ServiceFactory.getIEmpServiceInstance().list();
//            System.out.println(rs.);
            if(rs.size() !=0) {
                for (int i = 0; i < rs.size(); i++) {
                    System.out.println(rs.get(i).getEname());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        DatabaseConnection DB = new DatabaseConnection();
//        DB.getConnection();
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("select * from emp;");
//        while (rs.next()) {
//            System.out.println(rs.getString("ename"));
//        }


    }

}
