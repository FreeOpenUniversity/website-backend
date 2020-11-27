package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    public List<Category> getAllCategories() {
        return categoryDao.findAll();
    }

}
