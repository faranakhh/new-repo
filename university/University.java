package com.university;

import java.util.ArrayList;

public class University {
    ArrayList<Department>listofdepartment = new ArrayList<Department>();
    public ArrayList<Department> getDepartments(){
        return listofdepartment;
    }

    public void addDepartment(Department department){
        listofdepartment.add(department);
    }

    public void removeDepartment(Department department){
        listofdepartment.remove(department);
    }
}
