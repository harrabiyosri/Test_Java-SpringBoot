package com.enexse.testjava.model;

import javax.persistence.*;

@Entity
@Table(name="User_address")
public class UserAddress {

    @Id
    @Column(name = "user_id")
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "Country")
    private String country;

    @Column(name = "State")
    private String state;

    @Column(name = "AddressLine")
    private String addressLine;

    @Column(name="ZipCode")
    private Integer ZipCode;

    public UserAddress(){

    }

    public UserAddress(String country , String State , String addressLine , Integer ZipCode) {
        super();
        this.country = country;
        this.addressLine = addressLine;
        this.state = State;
        this.ZipCode = ZipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public Integer getZipCode() {
        return ZipCode;
    }

    public void setZipCode(Integer zipCode) {
        ZipCode = zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
