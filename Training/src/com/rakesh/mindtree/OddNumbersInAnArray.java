package com.rakesh.mindtree;

public class OddNumbersInAnArray {
    public static void main(String args[]){
        int[] myArray = {23, 93, 56, 92, 39};
        System.out.println("Even numbers in the given array are:: ");

        for (int i=0; i<myArray.length; i++){
            if(myArray[i]%2 == 0){
                System.out.println(myArray[i]);
            }
        }
        System.out.println("Odd numbers in the given array are:: ");

        for (int i=0; i<myArray.length; i++){
            if(myArray[i]%2 != 0){
                System.out.println(myArray[i]);
            }
        }
    }
}