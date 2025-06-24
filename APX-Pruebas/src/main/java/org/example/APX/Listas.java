package org.example.APX;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");

        list.add("Banana");

        list.add("Cherry");

        printList(list);

        System.out.println("Size: " + list.size());
        System.out.println("Contains 'Banana': " + list.contains("Banana"));
        System.out.println("Element at index 1: " + list.get(1));
    }

    private static void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
}
