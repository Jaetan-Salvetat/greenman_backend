package com.greenman.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    String id;
    public String username;
    public String email;
    public String password;
    public String profileImageUri;
}
