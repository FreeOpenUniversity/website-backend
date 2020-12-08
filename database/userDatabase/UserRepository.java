package com.free_open_university.backend.repositories;

import com.free_open_university.backend.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
 