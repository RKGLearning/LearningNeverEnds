package com.copart.collections.removeall;

import java.util.ArrayList;

public class TestMain {
    public static void main(String args[]) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Rakesh");
        stringArrayList.add("Vishnu");
        stringArrayList.add("Andy");
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.addAll(stringArrayList);
        stringArrayList1.add("Test");
        stringArrayList1.add("Test2");
        System.out.println(stringArrayList1);
        stringArrayList1.removeAll(stringArrayList);
        System.out.println(stringArrayList1);
    }
}
