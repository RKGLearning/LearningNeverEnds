package com.copart.collections.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortMain {
    public static void main(String args[]) {
        List<String> strings = new ArrayList<String>();
        strings.add("Andrew");
        strings.add("Vishnu");
        strings.add("Mitzy");
        strings.add("Sameera");
        System.out.println(strings);
        Collections.sort(strings); // Ascending

        Collections.reverse(strings); // Descending

        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
