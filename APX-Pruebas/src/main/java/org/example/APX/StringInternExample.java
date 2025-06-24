package org.example.APX;

public class StringInternExample {
    public static void main(String[] args) {
        String str1 = new String("example");
        String str2 = "example";
        String str3 = str1.intern();

        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
    }
}