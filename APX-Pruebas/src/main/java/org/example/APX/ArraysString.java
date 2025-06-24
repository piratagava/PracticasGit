package org.example.APX;

import java.util.Arrays;

public class ArraysString {
    public static void main(String[] args) {

        String[] strings = { "2", "3", "1", "4" };
        Arrays.sort(strings, 1, 4);

        System.out.println(Arrays.toString(strings));

    }
}
