package java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSquare
{
    public static void main(String[] args) {
        List<Integer> intArray =  Arrays.asList(2,4,6,3,7,9);
        List<Integer> sq = intArray.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(sq);

    }
}
