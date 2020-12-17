package com.free_open_university.backend.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UserHistory")
public class UserHistory{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id")
    @JsonIgnore
    private User user;

    @Column(name = "saved")
    private String saved;
    @Column(name = "progress")
    private BigDecimal progress;
    @Column(name = "complete")
    private BigDecimal complete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSaved() {
        return saved;
    }

    public void setSaved(String saved) {
        this.saved = saved;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public BigDecimal getComplete() {
        return complete;
    }

    public void setComplete(BigDecimal complete) {
        this.complete = complete;
    }
}
