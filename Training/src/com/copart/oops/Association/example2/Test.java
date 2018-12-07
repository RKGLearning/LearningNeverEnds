package com.copart.oops.Association.example2;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("BOA");
        Employee employee = new Employee("Rakesh");
        System.out.println(
                "Here is the Association : " + employee.getEmployeeName() + " is employee of " + bank.getBankName
                        ());
    }
}
