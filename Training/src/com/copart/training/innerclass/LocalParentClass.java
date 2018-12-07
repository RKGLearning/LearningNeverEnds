package com.copart.training.innerclass;

public class LocalParentClass {
    private int data = 30;
    void display(){
        class LocalInnerClass {
            void msg() {
                System.out.println(data);
            }

        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.msg();
    }
    public static void main(String args[]) {
        LocalParentClass localParentClass = new LocalParentClass();
        localParentClass.display();
    }
}
