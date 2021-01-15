package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.BookCategory;
import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.dao.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookCategoryController {

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @GetMapping("/bookcategory")
    public List<BookCategory> getAllBookCategories()
    {
        return bookCategoryRepository.findAll();
    }


    @GetMapping("/bookcategory/{category_id}")
    public Optional<BookCategory> getBookCategoryById(@PathVariable(value="category_id") Long category_id)
    {
        return bookCategoryRepository.findById(category_id);
    }
}
