package com.company;

public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
