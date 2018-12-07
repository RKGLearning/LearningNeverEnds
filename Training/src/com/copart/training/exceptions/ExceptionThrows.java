package com.copart.training.exceptions;

public class ExceptionThrows {
    public static void main(String args[]) {
        String name = null;
/*        try {
            System.out.println(name.length());
        } catch(Exception e) {
            System.out.println("Exception happen !!");
        }*/

        if (name == null ) {
            throw new NullPointerException("Null pointer exception happen !!");
        }
        System.out.println("Hurrayyy I reached here with exception");
    }

}
