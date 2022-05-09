package com.example.banhpeo;

public class Student {
    String email;
    String password;

    public void Student(String email, String password){
        this.email = email;
        this.password = password;
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
