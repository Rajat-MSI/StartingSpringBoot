package com.project.startingspringboot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class User
{
    @Id
    private String userId;
    private String userName;
    private String userAddress;
    private String userStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Contact userContact;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Contact getUserContact() {
        return userContact;
    }

    public void setUserContact(Contact userContact) {
        this.userContact = userContact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "\nuserId='" + userId + '\'' +
                "\n, userName='" + userName + '\'' +
                "\n, userAddress='" + userAddress + '\'' +
                "\n, userStatus='" + userStatus + '\'' +
                "\n, userContact='" + userContact + '\'' +
                '}';
    }
}
