package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public List<Book> getAllBooks() {return bookDao.findAll();}

    public Optional<Book> getBookByName(String name) {return bookDao.findByName(name);}
}
