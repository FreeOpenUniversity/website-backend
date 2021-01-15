package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.bean.BookCategory;
import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

//    public List<Category> getBooksbyCategory(Long books) { return categoryRepository.findBooksByCategory(books); }

//    public List<BookCategory> getBooksbyCategory(Long book_id) { return categoryRepository.findBooksByCategory(book_id); }
}