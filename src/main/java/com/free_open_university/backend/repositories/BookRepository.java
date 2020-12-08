package com.free_open_university.backend.repositories;

import com.free_open_university.backend.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Optional<Book> findByTitle(String title);

    Set<Book> findByLevel(int level);

    Set<Book> findByCategoryId(int CategoryId);

    Set<Book> findAll(int BookId);   

    @Query("select b from Book b where b.level = :level and b.Category.id = :CategoryId")
     Set<Book> findByLevelAndCategoryId(
            @Param("level") int level,
            @Param("CategoryId") int CategoryId);
}
