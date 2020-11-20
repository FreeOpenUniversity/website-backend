package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {return bookService.getAllBooks();}

    @GetMapping("/{name}")
    public Book getBookByName(@PathVariable String name) {return bookService.getBookByName(name).get();}
}
