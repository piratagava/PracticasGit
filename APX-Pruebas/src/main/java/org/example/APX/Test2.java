package org.example.APX;

public class Test2 {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 5) {
            // Empty loop body
        }
        String message = x > 5 ? "greater than" : "false";
        System.out.println(message + " - " + x);
    }
}