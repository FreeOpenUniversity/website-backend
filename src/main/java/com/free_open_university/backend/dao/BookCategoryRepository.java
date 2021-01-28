package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.Book;
import com.free_open_university.backend.bean.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

//    List<BookCategory> findBooksByBookCategory(Long category_id);
//    List<BookCategory> findAllById(Long category_id);



//    @Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(BookCategory.category_id, BookCategory.book_id, Book.title "
//            + "FROM Sale s INNER JOIN s.food f INNER JOIN f.company c")
//    List<JoinDto> fetchDataInnerJoin();
//
//    SELECT BookCategory.category_id, BookCategory.book_id, Book.title FROM BookCategory INNER JOIN Book ON BookCategory.book_id=Book.book_id;

    List<BookCategory> findbyCategory(Long category_id);


}
