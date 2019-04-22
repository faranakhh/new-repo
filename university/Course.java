package com.university;

import java.util.ArrayList;

/**
 *the class fedine a course for a department in a university
 * @author faranak hosseini
 * @version 1.1 ,13 ordibehesht ,98
 */
public class Course {
    String ID,name,credit;
    Department department;
    Professor professor;
ArrayList<Student>listofstudents = new ArrayList<Student>();
   // public Course(String ID, String name, Department department, Professor professor, int credit) {

   //
    //


    public Course(String ID, String name, Department department, Professor professor, String credit) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.professor = professor;
        this.credit = credit;
    }

    public String getID(){
        return ID;
    }

    public Department getDepartment(){
        return department;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return listofstudents;
    }


    public Professor getProfessor() {
        return professor;
    }

    public String getCredit() {
        return credit;
    }

    public void enrollStudent(Student student){

        if (student!=null&&student.getDepartment().getName().equals(this.department.getName())){
            listofstudents.add(student);
        }

    }


}
