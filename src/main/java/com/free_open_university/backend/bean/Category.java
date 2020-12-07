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
    List<Book> bookList;

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

    public List<Book> bookList() {
        return bookList;
    }

    public void setSubCategoryList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
