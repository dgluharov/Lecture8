package com.company;

public class Dog extends Animal {


    public Dog(String name, String breed, int age) {
        super(name,breed,age);
    }

    @Override
    public String makeSound() {
        return "Bark";
    }

    public String walk() {
        return "Walk was 5km.";
    }

    public String walk(int distance) {
        return "Walk was " + distance + "km.";
    }
}
