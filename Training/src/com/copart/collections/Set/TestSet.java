package com.copart.collections.Set;

import java.util.HashSet;

public class TestSet {
    public static void main(String args[]) {
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("Mitzy");
        stringHashSet.add("Andrew");
        stringHashSet.add("Mitzy");
        stringHashSet.stream().forEach(s -> {
            System.out.println(s);
        });
    }
}
