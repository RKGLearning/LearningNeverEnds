package com.copart.collections.Set.TreeSet;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeMain {
/*    public class TreeSet<E> extends AbstractSet<E>
            implements NavigableSet<E>, Cloneable, java.io.Serializable*/
    public static void main(String args[]) {
        TreeSet<String> skillSet = new TreeSet<String>();
        skillSet.add("Java");
        skillSet.add("COBOL");
        skillSet.add("AS400");
        skillSet.add("React");
        skillSet.add("sql");
        skillSet.add("RestApi");
        skillSet.add("COBOL");
        skillSet.stream().forEach(s -> {
            System.out.println(s);
        });
    }
}
