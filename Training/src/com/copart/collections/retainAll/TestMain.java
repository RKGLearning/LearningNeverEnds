package com.copart.collections.retainAll;

import java.util.ArrayList;

public class TestMain {
    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Andy");
        arrayList.add("Vishnu".toUpperCase());
        arrayList.add("Sameera");
        arrayList.add("Vishnu".toUpperCase());  // It will retain all the occurrence.

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Andy");
        arrayList1.add("Rakesh");
        arrayList1.add("Sameera");
        arrayList1.add("vishnu".toUpperCase());

        arrayList.retainAll(arrayList1);
        arrayList.stream().forEach(s -> {
            System.out.println(s);
        });
    }
}
