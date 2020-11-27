package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryDao extends JpaRepository<SubCategory, Integer> {
}
