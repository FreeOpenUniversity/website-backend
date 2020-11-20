package com.free_open_university.backend.dao;

import com.free_open_university.backend.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookDao extends JpaRepository<Book, Integer> {

    Optional<Book> findByName(String name);
}
