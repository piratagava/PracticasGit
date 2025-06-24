package org.example.APX;

public class ForzandoArray {
    int[] array = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        new ForzandoArray().go(1);
    }

    void go(int x) {
        array[x % 5] = x++;
        go(x);
    }
}
