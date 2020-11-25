package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.dao.BookDao;
import com.free_open_university.backend.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    public List<Book> getBooksByLevel(int level) {
        return bookDao.findByLevel(level);
    }

    public List<Book> getBooksBySubCategoryId(int subCategoryId) {
        return bookDao.findBySubCategoryId(subCategoryId);
    }

    public List<Book>  getBooksByLevelAndSubCategoryId(int level, int subCategorId) {
        return bookDao.findByLevelAndSubCategoryId(level, subCategorId);
    }

    public Optional<Book> getBookByTitle(String title) {
        return bookDao.findByTitle(title);
    }

    @Transactional
    public Response addBook(Book newBook) {
        try{
            bookDao.save(newBook);
            return new Response(true, "book added");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "book not added");
        }
    }
}
