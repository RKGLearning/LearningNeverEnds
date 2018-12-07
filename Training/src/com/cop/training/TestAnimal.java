package com.cop.training;

public class TestAnimal extends Animal {
    public void addNumbers(int a, int b) {
        int sum = 0;
        sum = a + b;
        System.out.println("Total is : " + sum);
    }
    public TestAnimal(String animalName, String animalCharacter) {
        super(animalName, animalCharacter);
    }


}
