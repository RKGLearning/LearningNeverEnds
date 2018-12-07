package com.copart.oops.inheritance;

public class Programmer extends Employee {
    int bonus = 10000;
    public static void main(String [] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary is :" + p.salary);
        System.out.println("Bonus of Programmer is :" + p.bonus);
    }
}
