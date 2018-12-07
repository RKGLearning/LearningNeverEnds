package java8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString
{
    public static void main(String[] args) {
//        String[] s1 = {"A","C","d","z","b"};
//        String [] s2 = {"m","r","p","j","l"};
        List<String> s1 = new ArrayList<String>();
        s1.add("A");
        s1.add("z");
        s1.add("c");
        s1.add("b");
        s1.add("z");

        Collections.sort(s1,(a1,b1) -> a1.compareTo(b1));
        System.out.println(s1);

    }
}
