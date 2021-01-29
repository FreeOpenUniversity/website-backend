package com.free_open_university.backend.controller;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.http.Response;
import com.free_open_university.backend.repositories.BookRepository;
import com.free_open_university.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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


    @PostMapping("/addBook")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    private Long addBook(@RequestBody Book book)

    {
        bookService.saveOrUpdate(book);
        return book.getId();
    }

    @PostMapping("/addBooks")
    public List<Book> saveAllBook(@RequestBody List<Book> bookList) {
        return (List<Book>) bookService.saveAllBook(bookList);
    }

    @DeleteMapping("/deleteBook/{book_id}")
    private void deleteBook(@PathVariable("book_id") Long id)
    {
        bookService.delete(id);
    }

//    @DeleteMapping("/deleteBooks")
//    public String deleteInBatch(@RequestBody List<Book> bookList) {
//        bookService.deleteInBatch(bookList);
//        return "All Students deleted successfully";
//    }

    @PutMapping("/updateBook")
    private Book updateBook(@RequestBody Book book)
    {
        bookService.saveOrUpdate(book);
        return book;
    }

}


//    @PostMapping("/batch_upload")
//    public Response addBookBatch(@RequestBody Set<Book> books) {
//        Response response = new Response();
//        for (Book book : books) {
//            response = bookService.addBook(book);
//            if(!response.isSuccess()) {
//                return response;
//            }
//        }
//        return new Response(true,200,"books added");
//    }
