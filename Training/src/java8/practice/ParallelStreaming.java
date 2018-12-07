package java8.practice;

import java.util.List;
import java.util.Arrays;

public class ParallelStreaming
{
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc"," ", "","fhg","jf");
        long count = strList.parallelStream().filter(str -> !str.trim().isEmpty()).count();
        System.out.println(count);
    }
}
