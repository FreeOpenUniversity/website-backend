package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.UserHistory;
import com.free_open_university.backend.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/userhistory")
public class UserHistoryController {
    
    @Autowired
    UserHistoryService userHistoryService;

    @GetMapping
    public List<UserHistory> getAllUserHistories() {
        return userHistoryService.getAllUserHistories();
    }

}
