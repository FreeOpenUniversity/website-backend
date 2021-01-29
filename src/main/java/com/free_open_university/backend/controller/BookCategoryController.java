package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.bean.BookCategory;
import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.dao.BookCategoryRepository;
import com.free_open_university.backend.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/bookcategory")
public class BookCategoryController {

    @Autowired
    BookCategoryRepository bookCategoryRepository;
    BookCategoryService bookCategoryService;


    @GetMapping //("/bookcategory")
    public List<BookCategory> getAllBookCategories()
    {
        return bookCategoryRepository.findAll();
    }

//    @GetMapping
//    public List<BookCategory> getAllBookCategories(
//            @RequestParam(value = "category_id", required = false) Long category_id) {
//        if (category_id != null) {
//            return bookCategoryService.getBooksByCategories(category_id);
//        } else {
////            return bookCategoryService.getAllBookCategories();
//            return bookCategoryRepository.findAll();
//        }

////        This won't work because it has to be /bookcategory/{bookcategory_id}
//        @GetMapping("/bookcategory/{category_id}")
//    public List<BookCategory> findByIds(@PathVariable () List<Long> category_id) {
//        return bookCategoryRepository.findAllById(category_id);
//    }


}


