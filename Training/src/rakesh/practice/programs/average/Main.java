package rakesh.practice.programs.average;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String args[]) {
        int markTotal = 0;
        String highestName = null;
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Rakesh",70));
        studentList.add(new Student("Gomathi",94));
        studentList.add(new Student("Praveen",95));
        studentList.add(new Student("karam",95));
        studentList.add(new Student("Janani",69));
        studentList.add(new Student("Panda",76));

        for (int i = 0; i < studentList.size();i++) {
            markTotal = markTotal + studentList.get(i).getMarks();
        }
        int average = markTotal/studentList.size();
        System.out.println(average);

        for (int j=0; j<studentList.size(); j++) {
            if (studentList.get(j).getMarks() > average) {
                average = studentList.get(j).getMarks();
                highestName = studentList.get(j).getName();
            }
        }
        System.out.println("Highest Average is for student name: " + highestName + " And the marks is " + average);
    }
}
