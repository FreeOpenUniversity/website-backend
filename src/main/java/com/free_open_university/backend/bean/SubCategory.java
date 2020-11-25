package com.free_open_university.backend.bean;

import javax.persistence.*;

@Entity
@Table(name = "SubCategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    // @Column(name = "Name")
    private String name;
    private int catid;

    // @Column(name = "SubCategoryId")
    // private int 
    // @Column(name = "SubCategoryName")

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryId", referencedColumnName =  "id")
    private Category category;

    public SubCategory(int id, String name, int catid) {
        super();
        this.id = id;
        this.name = name;
        this.catid = catid;
    }

    public SubCategory( ) {
        super();
    }

    public int getId( ) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   

    public String getSubname( ) {
        return name;
    }

    public void setSubname(String name) {
        this.name = name;
    }

    public int getCatid( ) {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}

/*
@JoinColumn(name = "CategoryId", referencedColumnName =  "id")
private Category category;

public String getName() {
    return name;
}

public List<SubCategory> getSubCategoryList() {
    return subCategoryList;
}

public void setSubCategoryList(List<SubCategory> subCategoryList) {
    this.subCategoryList = subCategoryList;     
}   
*/
