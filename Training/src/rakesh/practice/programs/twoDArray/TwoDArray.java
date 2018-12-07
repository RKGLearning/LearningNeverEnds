package rakesh.practice.programs.twoDArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoDArray
{

    public static void main(String[] args) {
        String[][] tDarray  = {{"Panda","30"},
                {"Ashiek","30"},
                {"Rakesh","50"},
                {"Panda","60"}};
        int count = 0;
        int sum = 0;
        String before = "";

        Map<String,Integer> testRes = new HashMap<String, Integer>();
        List<Student> stringList = new ArrayList<Student>();
        for (int i = 0; i < tDarray.length; i ++) {

            Student student = new Student();
            student.setName(tDarray[i][0]);
            student.setMarks(Integer.parseInt(tDarray[i][1]));
            before = before + student.getName() + " " + student.getMarks() + " ";
            if (!(stringList.isEmpty()))
            {
                int testCount = 0;
                int divideCount = 1;

                for (int j = 0; j < stringList.size(); j++)
                {
                    if (stringList.get(j).getName().equalsIgnoreCase(tDarray[i][0]))
                    {
                        stringList.get(j).setMarks((stringList.get(j).getMarks() + Integer.parseInt(tDarray[i][1])) / 2);
                    }
                }
                if ((stringList.size() + 1) != tDarray.length) {
                    stringList.add(student);
                }
            } else
            {
                stringList.add(student);
            }

        }

        String outPut = "";
        int total = 0;
        int highestAvg = 0;
        String nameOfP = "";
        for (int i =0; i < stringList.size(); i ++) {
            outPut = outPut + stringList.get(i).getName() + " " + stringList.get(i).getMarks() + " ";
            total = total + stringList.get(i).getMarks();
        }

        for (int j = 0; j<stringList.size(); j++) {
            if (stringList.get(j).getMarks() >= (total/stringList.size()) ) {
                highestAvg = stringList.get(j).getMarks();
                nameOfP = stringList.get(j).getName();
            }
        }

        System.out.println("before: " + before);
        System.out.println(outPut);
        System.out.println("Average is : " + total/stringList.size());
        System.out.println("Highest Average belongs to " + nameOfP + " and the value is: " + highestAvg);

    }

    public  static  class Student {
        String name;
        int marks;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }
        public void setMarks(int marks) {
            this.marks = marks;
        }
    }


}
