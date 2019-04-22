package com.example.daodemo.test;

import com.example.daodemo.dbc.DatabaseConnection;

public class testDb {
    public static void main(String[] args){
        DatabaseConnection conn = new DatabaseConnection();
        conn.getConnection();
    }


}
