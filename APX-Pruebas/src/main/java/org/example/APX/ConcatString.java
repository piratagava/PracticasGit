package org.example.APX;

public class ConcatString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;

        System.out.println("str3 " + str3);

        String str4 = str1.concat(" ").concat(str2);

        System.out.println("str4 = " + str4);

        String str5 = new StringBuilder().append(str1).append(" ").append(str2).toString();

        System.out.println("str5 = " + str5);

        System.out.print(str3.equals(str4) + " ");
        System.out.print(str4.equals(str5) + " ");
        System.out.print((str3 == str4) + " ");
        System.out.println(str4 == str5);
    }
}
