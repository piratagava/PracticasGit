package org.example.APX;

public class Test {
    static int co = 0;

    public static void main(String[] args) {
        int x = 1;

        for (test('1'); test('2') && (x <= 2); test('3')) {
            x++;
            test('4');
        }
        System.out.println(" The co value = " + co);
    }

    static boolean test(char num) {
        System.out.print("" + num);
        co++;
        return true;
    }
}