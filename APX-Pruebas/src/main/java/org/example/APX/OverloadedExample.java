package org.example.APX;

public class OverloadedExample {
    private String name;

    public OverloadedExample() {
        this("Default");
        System.out.println("No-argument constructor called");
    }

    public OverloadedExample(String name) {
        this.name = name;
        System.out.println("Constructor with argument called: " + name);
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public void display(String prefix) {
        System.out.println(prefix + ":" + name);
    }

    public static void main(String[] args) {
        OverloadedExample obj1 = new OverloadedExample();
        obj1.display();
        obj1.display("Hello");

        OverloadedExample obj2 = new OverloadedExample("John");
        obj2.display();
        obj2.display("Hi");
    }
}