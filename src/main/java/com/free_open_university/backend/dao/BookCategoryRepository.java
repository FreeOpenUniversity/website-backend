package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

//    List<BookCategory> findBooksByBookCategory(Long category_id);
//    List<BookCategory> findAllById(Long category_id);
}
