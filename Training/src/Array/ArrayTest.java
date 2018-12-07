package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        System.out.println("Please enter the number of element: ");
        int totalElement = sc.nextInt();

        System.out.println("Please enter the numers: ");

        int[] inputArray = new int[totalElement];

        for (int i=0; i<totalElement; i++) {
            inputArray[i] = sc.nextInt();
        }

        for (int j = 0; j<inputArray.length; j++) {
            if (inputArray[j] > 1000 || inputArray[j] < 0 ) {
                System.out.println("Invalid Input :");
            }
        }



    }
}
