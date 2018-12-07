package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCountOfEmptyString
{
    public static void main(String[] args) {
        List<String> strArr = Arrays.asList("abc","","ckd", "dd","  ","dd");
        long count = strArr.stream().filter(str -> str.trim().isEmpty()).count();
        List<String> str1 = strArr.stream().filter(str -> str.trim().equalsIgnoreCase("abc")).collect(Collectors
                .toList());
        System.out.println(count);
        System.out.println(str1);
    }
}
