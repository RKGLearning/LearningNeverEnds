package com.copart.collections.Set.LinkedHasset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedMain {

//    public class LinkedHasSet<E> extends HashSet<E> implements Set<E>
    public static void main(String args[]) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Mitzy");
        linkedHashSet.add("Andrew");
        linkedHashSet.add("Sameera");
        linkedHashSet.add("Vishnu");
        linkedHashSet.add("Rakesh");
        linkedHashSet.add("Andrew");

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
