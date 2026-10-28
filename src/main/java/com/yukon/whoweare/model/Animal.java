package com.yukon.whoweare.model;

public class Animal {
    private String animalClass;
    private String numberOfLegs;

    public Animal (String animalClass, String numberOfLegs){
        this.animalClass = animalClass;
        this.numberOfLegs = numberOfLegs;
    }


    public String getAnimalClass(){return animalClass;}
    public String getNumberOfLegs() {return numberOfLegs;}
}

