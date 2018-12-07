package com.copart.collections.LinkedHasMap;

import java.util.LinkedHashMap;

public class LinkedHasMapMain {

    /* public class LinkedHashMap<K,V>
    extends HashMap<K,V>
    implements Map<K,V> */
    public static void main(String args[]) {

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(101,"Andrew");
        linkedHashMap.put(105,"Ashiek");
        linkedHashMap.put(102,"Mitzy");
        linkedHashMap.put(104,null);
        System.out.println(linkedHashMap);
    }
}
