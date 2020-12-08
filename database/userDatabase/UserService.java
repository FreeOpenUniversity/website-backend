package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.User;
import com.free_open_university.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    UserRepository userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
