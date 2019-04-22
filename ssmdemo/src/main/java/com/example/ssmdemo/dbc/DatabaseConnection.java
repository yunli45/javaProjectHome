package com.example.ssmdemo.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // 以下几个是链接数据库所需要的参数，设置为静态常量让程序首先调用
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    // ?serverTimezone=UTC  在链接url中添加这个是为了防止在链接的时候出现乱码报错的情况
    private static final String DBURL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private static final String DBUSER = "root";
    private static final String PASSWORD = "123456";
    private Connection conn = null;

    /**
     * 在构造方法里为conn对象进行实例化，可以直接取得数据库的连接对象
     * 由于所有的操作都是基于数据库完成的，如果数据库取得不到连接，那么也就意味着所有的操作都可以停止了
     *
     * */
    public DatabaseConnection(){
        try {
            Class.forName(DBDRIVER);  // 加载驱动
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            // 通过驱动管理类来获取数据库链接
            this.conn = DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
            // 数据库链接成功在控制台打印提示下
            System.out.println("Success connect Mysql server!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 取得一个数据库的连接对象
     * @return Connection实例化对象
     * */
    public Connection getConnection(){
        return this.conn;
    }

    /**
     *  数据库关闭
     * */
    public void close(){
        try {
            this.conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
