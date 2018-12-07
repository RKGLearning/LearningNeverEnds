package com.copart.oops.Association.Aggregation.example3;

import java.util.List;

public class Institute {
    String name;
    private List<Department> departments;

    Institute(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public int getTotalStudentInInstitute() {
        int noOfStudents = 0;
        List<Student> students;
        for (Department departments : departments){
            students = departments.getStudents();
            for (Student studentList : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
