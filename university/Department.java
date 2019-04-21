package com.university;

import java.util.ArrayList;

public class Department {
String name;
Student student;
    public Department(String name) {
        this.name = name;

    }
    ArrayList<Student> listofstudents = new ArrayList<Student>();
    ArrayList<Course> listofcourses =new ArrayList<Course>();
    ArrayList<Professor>listofprofosor = new ArrayList<Professor>();

    public String getName(){
        return name;
    }

    public void addStudent(Student student){
        if(student.getDepartment().getName().equals(this.name));
listofstudents.add(student);
    }

    public ArrayList<Student> getStudents(){
        return listofstudents;
    }

    public void removeStudent(Student student){
        if(student.getDepartment().getName().equals(this.name)){
            listofstudents.remove(student);
        }
    }

    public void addCourse(Course course){
        //if(student.getDepartment().getName().equals(this.name)){
        //    listofcourses.add(course);
       // }
        if(course.getDepartment().getName().equals(this.name)){
            listofcourses.add(course);
        }
    }

    public ArrayList<Course> getCourses(){
        return listofcourses;
    }

    public void removeCourse(Course course){
        if(course.getDepartment().getName().equals(this.getName())){
            listofcourses.remove(course);

        }
    }

    public void addProfessor(Professor professor){
        if(professor.getDepartment().getName().equals(this.name)){
            listofprofosor.add(professor);
        }

    }

    public ArrayList<Professor> getProfessors(){
        return listofprofosor;
    }

    public void removeProfessor(Professor professor){
        if(professor.getDepartment().getName().equals(this.name)){
listofprofosor.remove(professor);
    }

}}
