package com.copart.collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestMapMain {
    public static void main(String args[]) {
        Map<String,String> testMap = new HashMap<String, String>();
        testMap.put("1","Andrew");
        testMap.put("2","Mitzy");
        testMap.put("3","Sameera");
        testMap.put("4","Sameera");

/*        for (Map.Entry m:testMap.entrySet()) {
            System.out.println("Keys is : " + m.getKey().toString() + " Value is " +  m.getValue());
        }*/
        System.out.println(testMap);
        testMap.remove("3");
        System.out.println(testMap);


        HashMap<Integer,Integer> integerIntegerHashMap = new HashMap<Integer, Integer>();
        integerIntegerHashMap.put(1,1);
        integerIntegerHashMap.put(2,1);
        integerIntegerHashMap.put(3,2);
        integerIntegerHashMap.put(4,1);
        integerIntegerHashMap.put(5,2);
        System.out.println(integerIntegerHashMap);
        integerIntegerHashMap.remove(3);
        System.out.println(integerIntegerHashMap);

        Map map = Collections.synchronizedMap(integerIntegerHashMap); // This behave Thread Safe
    }
}
