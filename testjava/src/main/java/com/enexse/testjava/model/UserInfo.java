package com.enexse.testjava.model;

import javax.persistence.*;

@Entity
@Table(name="UserInfo")
public class UserInfo {

    @Id
    @Column(name = "user_id")
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "Status")
    private String status;

    @Column(name="DeleteDate")
    private String deleteDate;

    @Column(name="AdminUser")
    private boolean adminUser;

    @Column(name="EmailPecVerified")
    private boolean emailPecVerified;

    @Column(name="TemporalPassword")
    private boolean temporalPassword;

    public UserInfo(){

    }

    public UserInfo(String status , String DeleteDate , boolean AdminUser , boolean EmailPecVerified , boolean TemporalPassword) {
        super();
        this.status = status;
        this.deleteDate = DeleteDate;
        this.adminUser = AdminUser;
        this.emailPecVerified = EmailPecVerified;
        this.temporalPassword = TemporalPassword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public boolean isAdminUser() {
        return adminUser;
    }

    public void setAdminUser(boolean adminUser) {
        this.adminUser = adminUser;
    }

    public boolean isEmailPecVerified() {
        return emailPecVerified;
    }

    public void setEmailPecVerified(boolean emailPecVerified) {
        this.emailPecVerified = emailPecVerified;
    }

    public boolean isTemporalPassword() {
        return temporalPassword;
    }

    public void setTemporalPassword(boolean temporalPassword) {
        this.temporalPassword = temporalPassword;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
