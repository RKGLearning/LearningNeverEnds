package com;

import java.util.HashMap;
import java.util.Map;

public class Test
{
    private static void main(String[] args) {
        Map<Character,Integer> test = new HashMap<Character, Integer>();
        String testString = "abcdef";
        char [] testArray= testString.toCharArray();
        test.put(testArray[0],0);
    }
}
