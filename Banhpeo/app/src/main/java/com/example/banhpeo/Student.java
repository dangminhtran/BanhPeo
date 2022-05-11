package com.example.banhpeo;

public class Student {
    String email;
    String password;
    String name;

    public Student(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }
    public void setEmail(String otherEmail) {
        this.email = otherEmail;
    }

    public void setPassword(String otherPassword) {
        this.password = otherPassword;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
