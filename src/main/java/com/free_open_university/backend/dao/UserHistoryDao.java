package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

public interface UserHistoryDao extends JpaRepository<UserHistory, Long> {


    Optional<UserHistory> findBySaved(String saved);

    List<UserHistory> findByProgress(DecimalFormat progress);

    List<UserHistory> findByComplete(DecimalFormat complete);
}
 