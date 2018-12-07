package com.sirusxm.com.interview;

import java.io.IOException;

public class FindCombinations
{
/*    public static void main(String[] args) throws IOException {
        System.out.println(climbLadders(2));
    }*/
/*    public static int climbLadders(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int one = 1;
        int two = 0;
        int result = 0;
        for (int i=1;i<=n;i++) {
            result = one + two;
            one = result;
        }
        return  result;
    }*/

    // Returns count of ways to reach
    // n-th stair using 1 or 2 or 3 steps.
    public static int findStep(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        else
            return findStep(n - 2) +
                    findStep(n - 1);
    }

    // Driver function
    public static void main(String argc[]){
        int n = 10;
        System.out.println(findStep(n));
    }
}
