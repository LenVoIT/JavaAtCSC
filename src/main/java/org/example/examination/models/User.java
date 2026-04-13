package org.example.examination.models;

import java.time.LocalDate;

public class User {
    private String username;
    private String password;
    private String fullName;
    private String dob;
    private String idCardNo; //cccd
    private String address;
    private Gender gender;
    private Status status;
    private Role role;

    public User() {
    }

    public User(String username, String password, String fullName, String dob, String idCardNo, String address, Gender gender, Status status, Role role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.dob = dob;
        this.idCardNo = idCardNo;
        this.address = address;
        this.gender = gender;
        this.status = status;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
