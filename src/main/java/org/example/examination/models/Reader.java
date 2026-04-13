package org.example.examination.models;

import java.time.LocalDate;

public class Reader {
    private String id;
    private String fullName;
    private String idCardNo;
    private String dob;
    private Gender gender;
    private String email;
    private String address;
    private LocalDate createdDate;
    private LocalDate expiredDate;

    public Reader() {
    }

    public Reader(String id, String fullName, String idCardNo, String dob, Gender gender, String email, String address, LocalDate createdDate, LocalDate expiredDate) {
        this.id = id;
        this.fullName = fullName;
        this.idCardNo = idCardNo;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.createdDate = createdDate;
        this.expiredDate = expiredDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }
}
