package com.example.springbootdemo.dao;


public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAll();
}