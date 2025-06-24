package org.example.APX;

public class ProbandoBoolean {
    static boolean b;
    public static void main(String[] args) {
        int x = 0;
        if (b) {
            x = 1;
        } else if (b = false) {
            x = 1;
        } else if (b) {
            x = 1;
        } else {
            x = 4;
        }
    }
}
