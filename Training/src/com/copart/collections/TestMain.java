package com.copart.collections;

import java.util.ArrayList;
import java.util.Iterator;

//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

 public class TestMain {
    public static void main(String args[]) {
        ArrayList<String> stringsArraList = new ArrayList<String>();
        stringsArraList.add("Andrew");
        stringsArraList.add("Mitzy");
        stringsArraList.add("Rakesh");
        stringsArraList.add("Sameera");
        stringsArraList.add("marz");
        System.out.println(stringsArraList);
        Iterator iterator = stringsArraList.iterator();

        while (iterator.hasNext()) {                  // Interface
            System.out.println(iterator.next());
        }

        for (int i =0; i < stringsArraList.size(); i++) {   // For loop
            System.out.println(stringsArraList.get(i));
        }

        stringsArraList.stream().forEach(s -> {   // Java 8 Lambda Function
            System.out.println(s);
        });
    }
}
