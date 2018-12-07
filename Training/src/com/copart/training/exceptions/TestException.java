package com.copart.training.exceptions;

public class TestException {

    /***
     * try
     * catch
     * finally
     * throw
     * throws
     *
     * ***/

    public static void main(String args[]){

        //int a = 50/0; /*** Airthmetic Exceptions ***/
        String name = null; //*** Null Pointer Exceptions***/
        Student student = new Student(); /*** POJO Level Null Pointer Exceptions **/
        int a[] = new int[5]; /*** 0,1,2,3,4***/
//        System.out.println(a[5]);
//        System.out.println(student.getName());

        /**
         * Try Catch Examples
         */
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            throw new NullPointerException("Value for name is null : " + e.getCause());
        }

        finally{System.out.println("Finally Block Executed");} /** Finally Block Always follows Try Block **/

        try {
            name = "Andrew";
            System.out.println(name.length());
        } catch (NullPointerException e1) {
            System.out.println("Exception 1: " + e1.getMessage());
        }

        finally{System.out.println("Finally Block Executed1");}

    }


}
