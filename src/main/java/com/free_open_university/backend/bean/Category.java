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
    private int id;

    @Column(name = "name")
    private String name;

    
    // @ManyToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "book_id", referencedColumnName = "id")
    
    // @ManyToMany(mappedBy = "categories")
    // @JsonIgnore
    
    // private Book bookList;


    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (
        name = "BookCategory",
        joinColumns = @JoinColumn(name = "category_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
        )
    private Set<Book> books;
    
    public int getId() { 
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    // public void setBook (Book book) {
    //     this.books.add(book);
    // }

    // public void setSubCategoryList(Set<Book> books) {
    //     this.books = books;
    // }

}
