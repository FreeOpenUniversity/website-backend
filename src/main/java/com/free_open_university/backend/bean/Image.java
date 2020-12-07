package com.free_open_university.backend.bean;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "ImageLibrary")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String filename;

    private String filetype;

    @Lob
    private String imageData;

    public Image() {

    }
    public Image(String filename, String filetype, String imageData) {
        this.setFilename(filename);
        this.setImageData(imageData);
        this.setFiletype(filetype);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String location) {
        this.filename = location;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }
}

