package com.free_open_university.backend.bean;

// import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

// import lombok.*;

import java.util.HashSet;
import java.util.Set;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;  
// import java.util.stream.Stream;


// import com.fasterxml.jackson.annotation.JsonIgnore;

// @Data
// @EqualsAndHashCode(exclude = "categories")

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "course_level")
    private int level;
    @Column(name = "link")
    private String link;
    @Column(name = "image_id")
    private long imageId;

    // @Column(name = "category_id")
    // private int categoryList;

    // @ManyToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @ManyToMany(cascade = CascadeType.ALL)
    // @JoinTable(name = "BookCategory",
    //     joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
    //     inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
    
    // @JsonIgnore
    
    // private Category categoryList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }
}
