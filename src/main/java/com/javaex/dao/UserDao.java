package com.javaex.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;

@Repository
public class UserDao {

    @Autowired
    HttpSession httpSession;


}
