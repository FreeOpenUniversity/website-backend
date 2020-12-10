package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.SubCategory;
import com.free_open_university.backend.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sub_category")
public class SubCategoryController {

    @Autowired
    SubCategoryService subCategoryService;

    @GetMapping
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }
 }
