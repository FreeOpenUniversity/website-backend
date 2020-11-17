package com.free_open_university.backend.bean;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Book {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
*/
    @Id
    @Column(name = "book_name")
    private String name;
    @Column(name = "author")
    private String author;

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
