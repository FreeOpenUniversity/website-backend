package com.free_open_university.backend.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import javax.persistence.*;


@Entity
@Table(name = "UserHistory")
public class UserHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private int userid;
    private User user;

//    private UserHistory userHistory;


    @Column(name = "saved")
    private String saved;
    @Column(name = "progress")
    private DecimalFormat progress;
    @Column(name = "complete")
    private DecimalFormat complete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserId() {
        return userid;
    }

    public void setUserId(int userid) {
        this.userid = userid;
    }

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
