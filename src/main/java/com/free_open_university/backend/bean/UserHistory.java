package com.free_open_university.backend.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UserHistory")
public class UserHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "userid", referencedColumnName = "id", nullable = false)
//    private long userid;
    private User user;

//    private UserHistory userHistory;


    @Column(name = "saved")
    private String saved;
    @Column(name = "progress")
    private DecimalFormat progress;
    @Column(name = "complete")
    private DecimalFormat complete;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public long getUserId() {
//        return userid;
//    }
//
//    public void setUserId(long userid) {
//        this.userid = userid;
//    }

    public String getSaved() {
        return saved;
    }

    public void setEmail(String saved) {
        this.saved = saved;
    }

    public DecimalFormat getProgress() {
        return progress;
    }

    public void setProgress(DecimalFormat progress) {
        this.progress = progress;
    }

    public DecimalFormat getComplete() {
        return complete;
    }

    public void setComplete(DecimalFormat complete) {
        this.complete = complete;
    }

}
