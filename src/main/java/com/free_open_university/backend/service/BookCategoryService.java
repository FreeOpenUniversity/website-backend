package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.bean.BookCategory;
import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.dao.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookCategoryService {

    @Autowired
    BookCategoryRepository bookCategoryRepository;

//    public List<BookCategory> getAllBookCategories() {
//        return bookCategoryRepository.findAll();
//    }

//    public List<BookCategory> getBooksByCategories(Long category_id) {
//        return bookCategoryRepository.findbyCategory(category_id);
//    }

//    public List<BookCategory> getBooksbyCategoryId(Long category_id) { return bookCategoryRepository.findAllById(category_id); }

}
