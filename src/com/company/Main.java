package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Sharo", "Neighborhood Superior", 2);
        Cat cat = new Cat("Maca", "Evil cat", 3);


        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
        System.out.println(dog.walk());
        System.out.println(dog.walk(7));
    }
}
