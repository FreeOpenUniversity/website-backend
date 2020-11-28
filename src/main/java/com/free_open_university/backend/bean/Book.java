package com.free_open_university.backend.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Booklibrary")
public class Book {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "course_level")
    private int level;
    @Column(name = "link")
    private String link;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "subcategory_id")
    private int subCategoryId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLevel() { return level; }

    public void setLevel(int level) { this.level = level; }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getCategoryId() { return categoryId; }

    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }
}
