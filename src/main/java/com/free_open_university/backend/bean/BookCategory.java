package com.free_open_university.backend.bean;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "BookCategory")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long book_id;
    @Column(name = "category_id")
    private Long category_id;


    public Long getBookId() {
        return book_id;
    }

    public void getBookId(Long book_id) {
        this.book_id = book_id;
    }

    public Long getCategoryId() {
        return category_id;
    }

    public void setCategoryId(Long category_id) {
        this.category_id = category_id;
    }

}
