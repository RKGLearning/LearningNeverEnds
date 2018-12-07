package rakesh.practice.programs.average;

import java.util.*;
public class ClimbSteps
{
    public static int getSteps(int n) {
        int [] outPut = new int[n + 1];
        outPut[0] = 1;
        outPut [1] = 1;
        outPut [2] = 2;
        for (int i = 3; i<= n; i++) {
            outPut[i] = outPut[i-3] + outPut[i-2] + outPut[i -1];
        }
        return outPut[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of stair case");
        int inputValue = sc.nextInt();
        System.out.println("Here is the ways to climb : " + getSteps(inputValue));

    }
}
