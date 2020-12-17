package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.UserHistory;
import com.free_open_university.backend.dao.UserHistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

@Service
public class UserHistoryService {
    
    @Autowired
    UserHistoryDao userHistoryDao;

    public List<UserHistory> getAllUserHistories() {
        return userHistoryDao.findAll();
    }

    public Optional<UserHistory> getUserHistoryBySaved(String saved) {return userHistoryDao.findBySaved(saved);}

    public List<UserHistory> getUserHistoryByProgress(DecimalFormat progress) {return userHistoryDao.findByProgress(progress); }

    public List<UserHistory> getUserHistoryByComplete(DecimalFormat complete) {return userHistoryDao.findByComplete(complete); }

}
