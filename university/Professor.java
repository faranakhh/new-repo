package com.university;

import java.util.ArrayList;

public class Professor {
Department department;
String name;
ArrayList<Course>listofcourses = new ArrayList<Course>();

    public Professor(Department department, String name) {
        this.department = department;
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return listofcourses;
    }
}
