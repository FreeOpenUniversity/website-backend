package com.free_open_university.backend.bean;

import javax.persistence.*;

@Entity
@Table(name = "SubCategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int subid;
    // @Column(name = "Name")
    private String subname;
    private int catid;

    // @Column(name = "SubCategoryId")
    // private int 
    // @Column(name = "SubCategoryName")

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryId", referencedColumnName =  "id")
    private Category category;

    public SubCategory(int subid, String subname, int catid) {
        super();
        this.subid = subid;
        this.subname = subname;
        this.catid = catid;
    }

    public SubCategory( ) {
        super();
    }

    public int getSubid( ) {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }   

    public String getSubname( ) {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
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
