//package com.example.ssmdemo.test;
//
//import com.example.ssmdemo.factory.ServiceFactory;
//import com.example.ssmdemo.serviceImpl.EmpServiceImpl;
//import com.example.ssmdemo.vo.Emp;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class testService {
//    public static void main(String[] srgs){
//        List<Emp> rs = new ArrayList<Emp>();
//        try {
//            rs = ServiceFactory.getIEmpServiceInstance().list();
//            if (rs.size()!=0){
//                for (int i = 0; i < rs.size(); i++) {
//                    System.out.println(rs.get(i).getEname());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
