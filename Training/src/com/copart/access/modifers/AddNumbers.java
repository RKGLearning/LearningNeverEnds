package com.copart.access.modifers;

import java.lang.Integer;
public class AddNumbers {
    /*** Private access modifiers only accessible with in the class ***/
    private void addNumbers(int a, int b) {
        int c = 0;
        c = a + b;
        System.out.println("Private Access Modifer Total is : " + c);
    }

    /*** Default Access Modifiers This is Accessible only within the Package***/
    void addition (int a, int b) {
        int c = 0;
        c = a + b;
        System.out.println("Default Access Modifiers Total is : " + c);
    }

    /** protected access modifers is accessible within the package and outside of the package through inheritence **/
    protected void addTwoNumbers (int a, int b) {
        int c = 0;
        c = a + b;
        System.out.println("Protected Access Modifiers Total is : " + c);
    }

    /** Public access modifers are accessible everywhere . It has widest scope among all modifers ***/
    public void addTnumbers (int a, int b) {
        int c = 0;
        c = a + b;
        System.out.println("Public Access Modifer Total is : " + c);
        TestModel testModel = new TestModel();
        testModel.setName("Rakesh");
        testModel.getName();
    }


}