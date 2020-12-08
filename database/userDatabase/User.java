package com.free_open_university.backend.bean;

import javax.persistence.*;
// import java.util.List;
// import java.util.Set;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "intro")
    private String intro;

    
    // @Column(name = "category_id")
    // private int categoryId;

    // @ManyToOne
    // @JoinColumn(name = "subcategory_id", referencedColumnName = "id")
    // @JsonIgnore
    // private int subCategoryId;
    // private SubCategory subCategory;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) {
        this.password = password; 
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    // **Category could be used later**
    // public int getCategoryId() { return categoryId; }

    // public void setCategoryId(int categoryId) { this.categoryId = categoryId; }


    // **Int Subcategory**
    // public int getSubCategoryId() {
    //     return subCategoryId;
    // }

    // public void setSubCategoryId(int subCategoryId) {
    //     this.subCategoryId = subCategoryId;
    // }

    // public SubCategory getSubCategory() {
    //     return subCategory;
    // }

    // public void setSubCategory(SubCategory subCategory) {
    //     this.subCategory = subCategory;
    // }
}
