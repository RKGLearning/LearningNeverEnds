package com.sirusxm.com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StairWay {

    /**
     *
     * @param stepsToUse
     * @param steps
     * @return
     */
    public static final List<int[]> stairClimbingRoutes(int[] stepsToUse, int steps) {

        // create the combination stack.
        // Longest possible combination is 1 step each time.
        int[] combination = new int[steps];
        int comblength = 0;

        List<int[]> results = new ArrayList<>();

        recurseRoute(steps, stepsToUse, combination, comblength, results);
        return results;
    }

    private static void recurseRoute(final int remaining, final int[] strides,
            final int[] combination, final int comblength, final List<int[]> results) {
        if (remaining < 0) {
            // this combination takes us too far.
            return;
        }
        if (remaining == 0) {
            // this combination is just right.
            results.add(Arrays.copyOf(combination, comblength));
            return;
        }
        // need to go further.
        for (int s : strides) {
            combination[comblength] = s;
            recurseRoute(remaining - s, strides, combination, comblength + 1, results);
        }

    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter number of steps in ladder: ");
            int numberOfSteps = Integer.parseInt(sc.nextLine());

        System.out.println("Total number of Iteration to climb the ladders with " + numberOfSteps + "Using "
                + "combination of either 1 step or 2 steps at a time is:  "  + (stairClimbingRoutes(new int[] {1,
                2}, numberOfSteps)).size());
        System.out.println("Iteration to climb the ladders with " + numberOfSteps + "Using "
                + "combination of either 1 step or 2 steps at a time is: ");
        for (int[] combination : stairClimbingRoutes(new int[] {1, 2}, numberOfSteps)) {
            int check = 0;
            for (int s : combination) {
                check += s;
            }
            System.out.println( Arrays.toString(combination));
        }

    }

}
