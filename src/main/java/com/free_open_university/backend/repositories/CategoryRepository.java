package com.free_open_university.backend.repositories;

import com.free_open_university.backend.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
