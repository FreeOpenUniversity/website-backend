package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.http.Response;
import com.free_open_university.backend.repositories.BookRepository;
import com.free_open_university.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    BookRepository bookRepository;

/*    @GetMapping // todo: need another path
    public Book getBookByTitle(@RequestParam(value = "title") String title) {
        return bookService.getBookByTitle(title).get();
    }*/

    // GET localhost:8080/book?level=6
    @GetMapping
    public List<Book> getBookId(
            @RequestParam (value = "level", required = false) Integer level) {
        if(level != null){
            return bookService.getBooksByLevel(level);
        }else {
            return bookService.getAllBooks();
        }
        
                // if(subCategoryId != null && level != null){
        //     return bookService.getBooksByLevelAndSubCategoryId(level, subCategoryId);
        // } else if (subCategoryId == null && level != null) {
        //     return bookService.getBooksByLevel(level);
        // } else if (subCategoryId != null && level == null) {
        //     return bookService.getBooksBySubCategoryId(subCategoryId);
        // } else {
        //     return bookService.getAllBooks();
        // }
    }

//    @PostMapping
//    public Response addBook(@RequestBody  Book newBook) {
//        return bookService.addBook(newBook);
//    }

    @PostMapping("/upload")
    public Book addBook(@RequestBody Book book)
    {
        return bookRepository.save(book);
    }

    @PostMapping("/batch_upload")
    public Response addBookBatch(@RequestBody Set<Book> books) {
        Response response = new Response();
        for (Book book : books) {
            response = bookService.addBook(book);
            if(!response.isSuccess()) {
                return response;
            }
        }
        return new Response(true,200,"books added");
    }

}
