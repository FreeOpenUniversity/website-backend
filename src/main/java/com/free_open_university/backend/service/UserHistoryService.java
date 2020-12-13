package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.UserHistory;
import com.free_open_university.backend.dao.UserHistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHistoryService {
    
    @Autowired
    UserHistoryDao userHistoryDao;

    public List<UserHistory> getAllUserHistories() {
        return userHistoryDao.findAll();
    }

}
