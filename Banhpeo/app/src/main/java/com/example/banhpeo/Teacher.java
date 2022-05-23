package com.example.banhpeo;


import java.util.ArrayList;

public class Teacher extends Account{

    private ArrayList<Course> courses;

    public Teacher(String name, String email, String password, int dateOfBirth) {
        super(name, email, password, dateOfBirth);
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) throws IllegalArgumentException{
        if(!courses.contains(course)) {
            courses.add(course);
        } else {
            throw new IllegalArgumentException("Try Again!!!");
        }
    }

    public void deleteCourse(Course course) throws IllegalArgumentException{
        if(!courses.contains(course)){
            throw new IllegalArgumentException("Try Again!!!");
        } else {
            courses.remove(course);
        }
    }

//    public void changeCourseName(Course course){
//        if(!courses.contains(course)){
//            throw new IllegalArgumentException("Try Again!!!");
//        } else {
//            course.setName();
//        }
//    }
}
