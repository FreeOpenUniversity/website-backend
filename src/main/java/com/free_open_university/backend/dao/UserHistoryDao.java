package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface UserHistoryDao extends JpaRepository<UserHistory, Integer> {


    Optional<UserHistory> findBySaved(String saved);

    List<UserHistory> findByProgress(BigDecimal progress);

    List<UserHistory> findByComplete(BigDecimal complete);
}
