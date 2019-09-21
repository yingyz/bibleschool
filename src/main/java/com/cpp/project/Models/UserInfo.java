package com.cpp.project.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @OneToOne(mappedBy = "userInfo", cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;


    private String street;
    private String city;
    private String state;
    private String zip;
    private String language;
    private String dialect;
    private String gender;
    private String phone;
    private Integer age;
    private Date birthday;
    private String birth_city;
    private String birth_nation;

    public UserInfo(String street, String city, String state, String zip, String language, String dialect, String gender, String phone, Integer age, Date birthday, String birth_city, String birth_nation) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.language = language;
        this.dialect = dialect;
        this.gender = gender;
        this.phone = phone;
        this.age = age;
        this.birthday = birthday;
        this.birth_city = birth_city;
        this.birth_nation = birth_nation;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirth_city() {
        return birth_city;
    }

    public void setBirth_city(String birth_city) {
        this.birth_city = birth_city;
    }

    public String getBirth_nation() {
        return birth_nation;
    }

    public void setBirth_nation(String birth_nation) {
        this.birth_nation = birth_nation;
    }
}
