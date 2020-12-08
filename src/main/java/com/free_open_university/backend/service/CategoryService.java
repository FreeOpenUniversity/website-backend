package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryDao;

    public Set<Category> getAllCategories(int CategoryId) {
        return categoryDao.findAll(CategoryId);
    }

}
