package com.copart.collections.TreeMap;

import com.sun.tools.javac.tree.TreeMaker;

import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String args[]) {
        TreeMap<Integer,String> stringTreeMap = new TreeMap<Integer, String>();
        stringTreeMap.put(101,"Andrew");
        stringTreeMap.put(105,"Ashiek");
        stringTreeMap.put(102,"Mitzy");
        stringTreeMap.put(104,null);
        System.out.println(stringTreeMap);
    }
}
