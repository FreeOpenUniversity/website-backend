package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.bean.BookCategory;
import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.repositories.BookRepository;
import com.free_open_university.backend.repositories.CategoryRepository;
import com.free_open_university.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
//@RequestMapping("/category")
public class CategoryController {

    @Autowired
//    CategoryService categoryService;
    CategoryRepository categoryRepository;
    BookRepository bookRepository;

//    @GetMapping
//    public List<Category> getAllCategories() {
//        return categoryService.getAllCategories();
//    }

    @GetMapping("/category")
    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }

    @GetMapping("/category/{id}")
    public Optional<Category> getCategoryById(@PathVariable(value="id") Long id)
    {
        return categoryRepository.findById(id);
    }

//    @GetMapping("/category/{id}/books")
//    public List<Category> getBooksbyCategory(@PathVariable(value="books") Long books)
//    {
//        return categoryRepository.findBooksByCategory(books);
//    }

//    @GetMapping("/category/{id}/books")
//    public List<BookCategory> getBooksbyCategory(@PathVariable(value="books") Long book_id)
//    {
//        return categoryRepository.findBooksByCategory(book_id);
//    }
}
