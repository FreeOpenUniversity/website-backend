package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.http.Response;
import com.free_open_university.backend.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookDao;

    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    public List<Book> getBooksByLevel(int level) {
        return bookDao.findByLevel(level);
    }

    public List<Book> getBooksByCategoryId(int subCategoryId) {
        return bookDao.findByCategoryId(subCategoryId);
    }

    public List<Book>  getBooksByLevelAndCategoryId(int level, int subCategoryId) {
        return bookDao.findByLevelAndCategoryId(level, subCategoryId);
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
