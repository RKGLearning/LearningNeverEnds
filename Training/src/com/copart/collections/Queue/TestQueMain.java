package com.copart.collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueMain {
    public static void main(String args[]) {

        PriorityQueue<String> priorityQueue =  new PriorityQueue<String>();
        priorityQueue.add("Rakesh");
        priorityQueue.add("Andrew");
        priorityQueue.add("Ashiek");
        priorityQueue.add("Vishnu");
        priorityQueue.add("Sameera");

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.element());
//        System.out.println(priorityQueue.peek());

        Iterator iterator = priorityQueue.iterator();

/*        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        priorityQueue.remove();
        System.out.println(priorityQueue);

    }
}
