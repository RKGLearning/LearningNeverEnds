package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample
{
    public static void main(String[] args) {
        List<String> strArray = Arrays.asList("abc","ddf","gfg","gghf"," ","","    ");
        List<String> outList = strArray.stream().filter(str -> !str.trim().isEmpty()).collect(Collectors.toList());
        String mergedString = strArray.stream().filter(str -> !str.trim().isEmpty()).collect(Collectors.joining
                (","));
        System.out.println(outList);
        System.out.println(mergedString);
    }
}
