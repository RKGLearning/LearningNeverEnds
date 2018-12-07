package com.copart.oops.Association.Aggregation.example3;

import java.util.ArrayList;
import java.util.List;

/*
In this example, there is an Institute which has no. of departments like CSE, EE. Every department has no. of
students. So, we make a Institute class which has a reference to Object or no. of Objects (i.e. List of Objects) of
the Department class. That means Institute class is associated with Department class through its Object(s). And
Department class has also a reference to Object or Objects (i.e. List of Objects) of Student class means it is
associated with Student class through its Object(s).
It represents a Has-A relationship.
################################ Code Re-Use is Best Achieved by Aggregation ###########################
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Andy", 1, "AS400");
        Student s2 = new Student("Sameera", 2, "SQL");
        Student s3 = new Student("Mitzy", 3, "AS400");
        Student s4 = new Student("jordon", 4, "Scrum");
        Student s5 = new Student("Vishnu", 5, "Java Scripts");
        Student s6 = new Student("Marz", 6, "AS400");

        List<Student> as400_student = new ArrayList<Student>();
        as400_student.add(s1);
        as400_student.add(s3);
        as400_student.add(s6);
        List<Student> sql_student = new ArrayList<Student>();
        sql_student.add(s2);
        List<Student> js_student = new ArrayList<Student>();
        js_student.add(s5);
        List<Student> scrum_student = new ArrayList<Student>();
        scrum_student.add(s4);

        Department department1 = new Department("AS400", as400_student);
        Department department2 = new Department("SQL", sql_student);
        Department department3 = new Department("JAVA SCRIPT", js_student);
        Department department4 = new Department("Scrum", scrum_student);

        List<Department> departments = new ArrayList<Department>();
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);
        departments.add(department4);

        Institute institute = new Institute("COPART", departments);
        System.out.println("Total Students in institue : ");
        System.out.println(institute.getTotalStudentInInstitute());


    }
}
