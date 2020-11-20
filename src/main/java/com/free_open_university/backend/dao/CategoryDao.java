package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
