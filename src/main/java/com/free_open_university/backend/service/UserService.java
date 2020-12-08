package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.User;
import com.free_open_university.backend.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
