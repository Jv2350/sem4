package com.example.practicalno13;

public class User {
    private long id;
    private String name;
    private String email;
    public User() {
// Default constructor
    }
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}