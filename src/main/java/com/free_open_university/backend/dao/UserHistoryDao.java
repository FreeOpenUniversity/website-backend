package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryDao extends JpaRepository<UserHistory, Integer> {
}
 