package com.copart.collections.LinkedList.Example1;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class TestMain {
    public static void main(String args[]) {
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("Andrew");
//        stringLinkedList.add("Mitzy");
        stringLinkedList.add("Sameera");
        stringLinkedList.add("Vishnu");
        stringLinkedList.add("Rakesh");
        stringLinkedList.add("Marz");
        System.out.println("Here is the List : " + stringLinkedList);

/*        Iterator iterator = stringLinkedList.iterator();

        while (iterator.hasNext()) {
            String nextValue = iterator.next().toString();
            if (nextValue.equals("Mitzy")) {
                System.out.println(nextValue);
            }
        }*/

/*        for (int i = 0; i < stringLinkedList.size(); i++) {
            System.out.println(stringLinkedList.get(1));
        }*/

/** Lambda Function **/

        AtomicReference<String> printMessage = null;

        stringLinkedList.stream().forEach(selement -> {
            if (selement.equals("Mitzy")) {

                printMessage.set("Hi Mitzy");
                System.out.println(selement);
            } /*else {
                System.out.println(" Element not Available");
            }*/
        });

        if (printMessage != null) {
            System.out.println(printMessage);
        } else {
            System.out.println(" Element not Available");
        }
    }
}
