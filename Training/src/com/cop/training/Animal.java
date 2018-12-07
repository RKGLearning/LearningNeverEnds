package com.cop.training;

public class Animal {
    private String animalName;
    private String animalCharacter;

    public Animal(String animalName,String animalCharacter) {
        this.animalName = animalName;
        this.animalCharacter = animalCharacter;
    }

    public void testFunction(String animalName, String animalCharacter) {
        System.out.println(animalName + " " + animalCharacter);
    }
}
