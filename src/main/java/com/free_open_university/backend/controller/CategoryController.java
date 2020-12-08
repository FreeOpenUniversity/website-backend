package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public Set<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
