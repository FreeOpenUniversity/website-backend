package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
 