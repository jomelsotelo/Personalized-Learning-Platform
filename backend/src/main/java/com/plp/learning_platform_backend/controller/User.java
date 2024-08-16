package com.plp.learning_platform_backend.controller;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String email;

    private String confirmationCode;

    private LocalDateTime expirationTime;

    // Constructors
    public User() {}

    public User(String email, String confirmationCode, LocalDateTime expirationTime) {
        this.email = email;
        this.confirmationCode = confirmationCode;
        this.expirationTime = expirationTime;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", confirmationCode='" + confirmationCode + '\'' +
                ", expirationTime=" + expirationTime +
                '}';
    }
}
