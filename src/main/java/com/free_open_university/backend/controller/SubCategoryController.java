package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.SubCategory;
import com.free_open_university.backend.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {

    @Autowired
    SubCategoryService subcategoryService;

    @GetMapping
    public List<SubCategory> getAllSubCategories() { return subcategoryService.getAllSubCategories();}
}
