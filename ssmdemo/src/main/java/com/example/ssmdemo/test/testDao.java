//package com.example.ssmdemo.test;
//
//import com.example.ssmdemo.daoImpl.EmpDAOImpl;
//import com.example.ssmdemo.dbc.DatabaseConnection;
//import com.example.ssmdemo.vo.Emp;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//import java.util.List;
//
//public class testDao {
//    public static void main(String[] args){
//        //在这个类的对象内部就提供有一个数据库连接类的实例化对象
//        DatabaseConnection dbc = new DatabaseConnection() ;
//        Connection conn =  dbc.getConnection();
//        EmpDAOImpl dao =  new EmpDAOImpl(conn);
//        List<Emp> rs = new ArrayList<Emp>()   ;
//
//        try {
//            rs = dao.findAll();
//            if(rs.size() !=0){
//                for(int i=0; i<rs.size(); i++){
//                    System.out.println(rs.get(i).getEname());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
