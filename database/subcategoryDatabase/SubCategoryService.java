package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.SubCategory;
import com.free_open_university.backend.repositories.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    @Autowired
    SubCategoryRepository subCategoryDao;

    public List<SubCategory> getAllSubCategories() {
        return subCategoryDao.findAll();
    }
}
