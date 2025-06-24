package org.example.APX;

public class ProbandoBoolean {
    static boolean b;
    public static void main(String[] args) {
        int x = 0;
        System.out.println("valor de b boolean = " + b);
        if (b) {
            x = 1;
        } else if (b = false) {
            x = 2;
        } else if (b) {
            x = 3;
            System.out.println("x de 3 para cambios a merge develop=" + x);
        } else {
            x = 4;
            System.out.println("x mas 4 =" + x);
        }

        System.out.println("x=" + x);
        System.out.println("x=" + x);
        System.out.println("x=" + x);
    }
}
