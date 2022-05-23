package com.example.banhpeo;

public class Course {
    private String name;
    private int courseID;

    public Course(String name, int courseID){
        this.name = name;
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}
