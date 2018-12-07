package com.sirusxm.com.interview;

import java.util.ArrayList;
import java.util.HashSet;

public class Stairs{
    public static int climbStairs(int a) {
        if(a <= 0)
            return 0;
        ArrayList<Integer> steps = new ArrayList<Integer>();
        steps.add(1);
        steps.add(2);
        ArrayList<Integer> currentList = new ArrayList<Integer>();
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        climbStairsCombination(steps, a, 0, currentList, result, set);
        for(ArrayList<Integer> list : result)
            System.out.println(list);
        return result.size();
    }

    public static void climbStairsCombination(ArrayList<Integer> steps, int a, int j, ArrayList<Integer> currentList, ArrayList<ArrayList<Integer>> result, HashSet<ArrayList<Integer>> set){// a is number of steps
        if(a == 0){
            ArrayList<Integer> temp = new ArrayList<Integer>(currentList);
            if(!set.contains(temp)){
                set.add(temp);
                result.add(temp);
            }
            return;
        }
        for(int i = 0; i < steps.size(); i++){
            if(a < steps.get(i))
                return;
            currentList.add(steps.get(i));
            climbStairsCombination(steps, a - steps.get(i), i, currentList, result, set);
            currentList.remove(currentList.size() - 1);
        }

    }
    static int[] fib = new int[100];
    public static int countWays(int a){
        return fibonacci(a + 1);
    }

    public static int fibonacci(int n) {
        if(n <= 1)
            return n;
        if(fib[n] != 0)
            return fib[n];
        fib[n] = fibonacci(n-1) + fibonacci(n-2);
        return fib[n];
    }
    public static void main(String[] args){
        int a = 5;
        System.out.println("Using combinations solutions: " + climbStairs(a));
        System.out.println("Using Fibonacci : " + countWays(a));
    }
}
