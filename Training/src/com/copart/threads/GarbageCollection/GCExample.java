package com.copart.threads.GarbageCollection;

/**
 * In java, garbage means unreferenced objects.
 *
 * Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way
 * to destroy the unused objects.
 *
 * To do so, we were using free() function in C language and delete() in C++. But, in java it is performed
 * automatically. So, java provides better memory management.
 *
 * Advantage of Garbage Collection
 * It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
 * It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
 * How can an object be unreferenced?
 * There are many ways:
 *
 * By nulling the reference
 * By assigning a reference to another
 * By annonymous object etc.
 *
 * 1) By nulling a reference:
 * Employee e=new Employee();
 * e=null;
 * 2) By assigning a reference to another:
 * Employee e1=new Employee();
 * Employee e2=new Employee();
 * e1=e2;//now the first object referred by e1 is available for garbage collection
 * 3) By annonymous object:
 * new Employee();
 *
 * finalize() method
 * The finalize() method is invoked each time before the object is garbage collected. This method can be used to
 * perform cleanup processing. This method is defined in Object class as:
 *
 * protected void finalize(){}
 * Note: The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have
 * created any object without new, you can use finalize method to perform cleanup processing (destroying remaining
 * objects).
 *
 * gc() method
 * The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System
 * and Runtime classes.
 *
 * public static void gc(){}
 * Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC). This thread calls the
 * finalize() method before object is garbage collected.
 */
public class GCExample {
    public void finalize(){
        System.out.println("Object is Garbage Collected");
    }
    public static void main(String [] args) {
        GCExample gc1 = new GCExample();
        GCExample gc2 = new GCExample();
        gc1 = null;
        gc2 = null;
        System.gc();
        }
}

/** Note: Neither finalization nor garbage collection is guaranteed.**/