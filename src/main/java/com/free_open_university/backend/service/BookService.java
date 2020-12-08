package com.free_open_university.backend.service;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.http.Response;
import com.free_open_university.backend.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookDao;

    public Set<Book> getAllBooks(int BookId) {
        return bookDao.findAll(BookId);
    }

    public Set<Book> getBooksByLevel(int level) {
        return bookDao.findByLevel(level);
    }

    public Set<Book> getBooksByCategoryId(int CategoryId) {
        return bookDao.findByCategoryId(CategoryId);
    }

    public Set<Book>  getBooksByLevelAndCategoryId(int level, int CategoryId) {
        return bookDao.findByLevelAndCategoryId(level, CategoryId);
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
