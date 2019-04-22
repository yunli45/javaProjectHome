package com.example.daodemo.dbc;

import java.sql.*;

// DatabaseConnection只是无条件的提供有数据库连接，而至于说有没有连接对象，它都不关心
// 以后设置为配置文件形式
public class DatabaseConnection {

    private static final String DBDRIVER = "com.mysql.jdbc.Driver" ;
    private static final String DBURL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC" ;
    private static final String DBUSER = "root" ;
    private static final String PASSWORD = "123456" ;
    private Connection conn = null;
    /*
     * 在构造方法里为conn对象进行实例化，可以直接取得数据库的连接对象
     * 由于所有的操作都是基于数据库完成的，如果数据库取得不到连接，那么也就意味着所有的操作都可以停止了
     *
     * */
    public DatabaseConnection(){
        try {
            Class.forName(DBDRIVER) ;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            this.conn = DriverManager.getConnection(DBURL,DBUSER,PASSWORD) ;
            System.out.println("Success connect Mysql server!");


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /*
     * 取得一个数据库的连接对象
     * @return Connection实例化对象
     * */
    public Connection getConnection(){
        return this.conn ;
    }
    /*
     * 数据库的关闭
     * */
    public void close(){
        if(this.conn != null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
