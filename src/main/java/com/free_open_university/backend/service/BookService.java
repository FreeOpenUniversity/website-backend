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
    BookRepository bookRepository;

    public List<Book> getAllBooks() {return bookRepository.findAll(); }

    public List<Book> getBooksByLevel(int level) {
        return bookRepository.findByLevel(level);
    }

    public Optional<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public void saveOrUpdate(Book book)
    {
        bookRepository.save(book);
    }

    public void delete(Long id) { bookRepository.deleteById(id); }

    @Transactional
    public Response addBook(Book newBook) {
        try{
            bookRepository.save(newBook);
            return new Response(true, "book added");
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(false, "book not added");
        }
    }
}
