package com.university;

import java.util.ArrayList;

public class Student {

    String name,ID,major;
    Department department;
    ArrayList<Course> listofcourses = new ArrayList<Course>();

    public Student(String name, String ID, String major, Department department) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getMajor() {
        return major;
    }

    public Department getDepartment() {
        return department;
    }

    public ArrayList<Course> getCourses() {
     return   listofcourses;
    }

    public void addCourse(Course course){
if(course!=null){
    listofcourses.add(course);
}
    }
}
