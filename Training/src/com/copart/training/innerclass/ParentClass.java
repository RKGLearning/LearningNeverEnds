package com.copart.training.innerclass;

public class ParentClass {

    String name = "Andy";
    int a = 10;
    int b = 20;

    class MemberInnerClass {

        public void printName() {
            System.out.println(name);
            System.out.println(a + b);
        }
    }
    void getMessage() {
        System.out.println("This is Method");
    }
    public static void main(String args[]) {

        ParentClass memberInnerClass = new ParentClass();  //Parent Class
        ParentClass.MemberInnerClass getName1 = memberInnerClass.new MemberInnerClass(); // Member Inner Class
        getName1.printName();
     }
}
