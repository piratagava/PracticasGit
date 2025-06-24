package org.example.APX;
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}