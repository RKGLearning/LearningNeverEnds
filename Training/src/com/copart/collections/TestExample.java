package com.copart.collections;


import java.util.ArrayList;
import java.util.Iterator;

/** Addall
 * removeall
 * retainall
 */
public class TestExample {
    public static void main(String args[]) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Radhe");
        stringArrayList.add("Gomathi");
        System.out.println("Array List Is : " + stringArrayList);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.stream().forEach(integer -> {
            System.out.println(integer);
        });

    }
}
