package com.copart.training.innerclass;

public class StaticNestedParentClass {

    private static int data = 30;
    private static String name = "Sameera";

    static class StaticNestedChild{
        void printMsg(){
            System.out.println(data
            );
            System.out.println(name);
        }
    }

    public static void main(String args[]) {
        StaticNestedParentClass.StaticNestedChild staticNestedChild = new StaticNestedParentClass.StaticNestedChild();
        staticNestedChild.printMsg();
    }
}
