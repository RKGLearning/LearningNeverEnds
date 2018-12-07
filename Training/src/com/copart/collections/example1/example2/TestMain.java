package com.copart.collections.example1.example2;

import java.util.ArrayList;

public class TestMain {
    public static void main(String args[]) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Andrew");
        stringArrayList.add("Mitzy");
        stringArrayList.add("sameera");
        stringArrayList.add("Vishnu");
        ArrayList<String> stringArrayList1 = new ArrayList<String>();
        stringArrayList1.addAll(stringArrayList);
        stringArrayList1.add("Rakesh");
        System.out.println(stringArrayList1);

        stringArrayList1.stream().forEach(s -> {
            System.out.println(s);
        });

    }
}
