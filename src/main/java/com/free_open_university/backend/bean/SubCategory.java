/*
package com.free_open_university.backend.bean;

import javax.persistence.*;

@Entity
@Table(name = "SubCategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "CategoryId", referencedColumnName = "id")
    private Category category;
}
*/
