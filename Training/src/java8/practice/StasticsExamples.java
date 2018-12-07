package java8.practice;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Arrays;
public class StasticsExamples
{
    public static void main(String[] args) {
        List<Integer> intArray = Arrays.asList(10,45,697,123,9,11);
        IntSummaryStatistics ints = intArray.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(ints.getMax());
        System.out.println(ints.getAverage());
        System.out.println(ints.getSum());
        System.out.println(ints.getCount());
        System.out.println(ints.getMin());
    }
}
