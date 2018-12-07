package com.copart.collections.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMain {
    public static void main(String args[]) {
        Hashtable<Integer,String> stringHashtable = new Hashtable<Integer, String>();
        stringHashtable.put(101,"Andrew");
        stringHashtable.put(105,"Ashiek");
        stringHashtable.put(102,"Mitzy");
        stringHashtable.put(106,"Rakesh");
//        stringHashtable.put(null,"Sameera"); // Null keys and values are not acceptable by Has Table.

        System.out.println(stringHashtable);
        for (Map.Entry m:stringHashtable.entrySet()) {
            System.out.println("Key is : " + m.getKey() + " Value is :" + m.getValue());

        }
        System.out.println("Value from Map : " + stringHashtable.get(101));
    }
}
