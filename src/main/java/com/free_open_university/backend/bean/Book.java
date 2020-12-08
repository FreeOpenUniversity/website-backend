package com.free_open_university.backend.bean;

// import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;  
// import java.util.stream.Stream;


// import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@EqualsAndHashCode(exclude = "categories")

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "course_level")
    private int level;
    @Column(name = "link")
    private String link;

    // @Column(name = "category_id")
    // private int categoryList;

    // @ManyToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @ManyToMany(cascade = CascadeType.ALL)
    // @JoinTable(name = "BookCategory",
    //     joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
    //     inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
    
    // @JsonIgnore

    private Set<Category> categories = new HashSet<Category>();
    
    @ManyToMany(mappedBy = "books")
    
    // private Category categoryList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getLevel() { 
        return level; 
    }

    public void setLevel(int level) { 
        this.level = level; 
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<Category> getCategoryId() { 
        return categories; 
    }

    public void setCategoryId(Set<Category> categories) { 
        this.categories = categories;
    }
    
    // public Book(String title, Category... categories) {
    //     this.title = title;
    //     this.categories = Stream.of(categories).collect(Collectors.toSet());
    //     this.categories.forEach(x -> x.getBooks().add(this));
    // }
   
}


// public SubCategory getSubCategory() {
//     return subCategory;
// }

// public void setSubCategory(SubCategory subCategory) {
//     this.subCategory = subCategory;
// }

    // **Int Subcategory**
    // public int getSubCategoryId() {
    //         return subCategoryId;
    //     }
    
    // public void setSubCategoryId(int subCategoryId) {
    //         this.subCategoryId = subCategoryId;
    //     }