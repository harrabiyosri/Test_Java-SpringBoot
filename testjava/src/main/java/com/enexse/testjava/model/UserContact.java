package com.enexse.testjava.model;

import javax.persistence.*;

@Entity
@Table(name="UserContact")
public class UserContact {

    @Id
    @Column(name = "user_id")
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "PhonePrefix")
    private String phonePrefix;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "LandlinePrefix")
    private String landlinePrefix;

    @Column(name = "LandlineNumber")
    private String landlineNumber;

    public UserContact(){

    }

    public UserContact(String phonePrefix , String phoneNumber , String LandlinePrefix , String LandlineNumber) {
        super();
        this.phonePrefix = phonePrefix;
        this.phoneNumber = phoneNumber;
        this.landlinePrefix = LandlinePrefix;
        this.landlineNumber = LandlineNumber;
    }

    public String getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(String phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public String getLandlinePrefix() {
        return landlinePrefix;
    }

    public void setLandlinePrefix(String landlinePrefix) {
        this.landlinePrefix = landlinePrefix;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
