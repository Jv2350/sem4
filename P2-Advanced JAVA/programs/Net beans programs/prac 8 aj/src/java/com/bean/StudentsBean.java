package com.bean;

public class StudentsBean {

    private String firstName = null;
    private String lastName = null;
    private int age; // Changed type to int

    public StudentsBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getAge(){ 
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }
}
