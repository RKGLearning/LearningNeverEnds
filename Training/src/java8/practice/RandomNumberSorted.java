package java8.practice;

import java.util.Random;

public class RandomNumberSorted
{
    public static void main(String [] args) {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
