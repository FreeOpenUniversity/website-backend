package com.free_open_university.backend.bean;

// import lombok.*;
import javax.persistence.*;

// import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet; 

// @Data
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "image_id")
    private Long imageId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (
        name = "BookCategory",
        joinColumns = @JoinColumn(name = "category_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
        )
    private Set<Book> books;
    
    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }
}
