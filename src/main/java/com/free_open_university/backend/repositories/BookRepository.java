package com.free_open_university.backend.repositories;

import com.free_open_university.backend.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Optional<Book> findByTitle(String title);

    List<Book> findByLevel(int level);

    List<Book> findByCategoryId(int CategoryId);

    @Query("select b from Book b where b.level = :level and b.Category.id = :CategoryId")
     List<Book> findByLevelAndCategoryId(
            @Param("level") int level,
            @Param("CategoryId") int CategoryId);
}
