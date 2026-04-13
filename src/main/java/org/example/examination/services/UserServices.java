package org.example.examination.services;

import org.example.examination.models.Gender;
import org.example.examination.models.Role;
import org.example.examination.models.Status;
import org.example.examination.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserServices {

    private final List<User> listUsers = new ArrayList<>();
    private User currrentUser;
    public void logIn(String username, String password){

    }
    public void logOut(){

    }
    public boolean changePassword(String password){

        return false;
    }
    public void updateUserInfo(String fullName, LocalDate dob, String idCardNo, String address,
                               Gender gender){

    }
    public void createUser(String username, String password, String fullname, LocalDate dob, String idCardNo, String address,
                           Gender gender, Role role){

    }
    public void updateRole(String username, Role role){

    }
    public void updateStatus(String username, Status status){

    }
}
