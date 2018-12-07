package com.cop.training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String [] args) {
        /** oops Concepts
         * 1. Abstraction
         * 2. Encapsulation
         * 3. Polymorphism
         * 4.Inheritance
         * 5.Association
         * 6.Aggregation
         * 7.Composition
         *
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Please Enter the second number");
        int b = Integer.parseInt(sc.nextLine());
        Total total = new Total();
        EncapsulationTest encapsulationTest = new EncapsulationTest("Rakesh",12,total);
        int c = total.getTotal(a,b);
        System.out.println("Here is the total of two numbers :" + c);
        TestAnimal testAnimal = new TestAnimal("Dog","Barks");
        testAnimal.testFunction("Dog","barks");
        testAnimal.addNumbers(10,20);
    }
}
