package com.copart.collections.example1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMain {
    public static void main(String args[]) {
        Student student1 = new Student("Andrew", 1, 25);
        Student student2 = new Student("Mitzy", 2, 16);
        Student student3 = new Student("Sameera", 3, 27);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        System.out.println(studentArrayList);

        studentArrayList.stream().forEach(student -> {
            System.out.println(student.getAge() + " ," + student.getId() + " , " + student.getName() );
        });

        Iterator iterator = studentArrayList.iterator();

        while (iterator.hasNext()) {
            Student studentitr = (Student) iterator.next();
            System.out.println(studentitr.getAge() + " ," + studentitr.getId() + " , " + studentitr.getName() );
        }
    }
}
