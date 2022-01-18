package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sleep();
        dog.setName("Bello");
        System.out.println(dog.getName());
        Cat cat = new Cat();
        cat.purr();
        cat.setName("Simba");
        cat.setAge(9);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

    }
}
