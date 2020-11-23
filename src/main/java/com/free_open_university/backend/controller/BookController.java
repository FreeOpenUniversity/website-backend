package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.http.Response;
import com.free_open_university.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping()
    public Book getBookByTitle(@RequestParam(value = "title") String title) {
        return bookService.getBookByTitle(title).get();
    }

    // GET localhost:8080/book?sub_category='sometitle'&level='100'
    // GET localhost:8080/book?level='100'
    @GetMapping
    public List<Book> getBookList(
            @RequestParam (value = "sub_category", required = false) Integer subCategoryId,
            @RequestParam (value = "level", required = false) Integer level) {
        if(subCategoryId != null && level != null){
            return bookService.getBooksByLevelAndSubCategoryId(level, subCategoryId);
        } else if (subCategoryId == null && level != null) {
            return bookService.getBooksByLevel(level);
        } else if (subCategoryId != null && level == null) {
            return bookService.getBooksBySubCategoryId(subCategoryId);
        } else {
            return bookService.getAllBooks();
        }
    }

    @PostMapping
    public Response addBook(@RequestBody  Book newBook) {
        return bookService.addBook(newBook);
    }

}
