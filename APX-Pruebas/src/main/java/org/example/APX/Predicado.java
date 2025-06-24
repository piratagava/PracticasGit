package org.example.APX;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicado {
    public static void main(String[] args) {

        Predicate<String> p = (s) -> s.length() > 5;

        Function<String, Integer> f = String::length;
        Consumer<String> c = (s) -> System.out.println(s.toUpperCase());

        Supplier<String> s = () -> "Hello, world!";

        String testString = "functional";

        System.out.println(p.test(testString));
        System.out.println(f.apply(testString));

        c.accept(testString);

        System.out.println(s.get());

    }
}
