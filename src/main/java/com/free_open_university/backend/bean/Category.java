package com.free_open_university.backend.bean;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    
    // @ManyToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "book_id", referencedColumnName = "id")

    @ManyToMany(mappedBy = "bookcategory")
    @JsonIgnore
    
    // private Book bookList;
    Set<Book> bookList;

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

    public Set<Book> bookList() {
        return bookList;
    }

    public void setSubCategoryList(Set<Book> bookList) {
        this.bookList = bookList;
    }
}
