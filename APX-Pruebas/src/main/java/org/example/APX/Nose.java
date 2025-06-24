package org.example.APX;

import java.util.ArrayList;

public class Nose {
    public static void main(String[] args) {

        String v = new String();
        StringBuffer sb = new StringBuffer();
        class MyList extends ArrayList {

        }

        System.out.println((v instanceof String) &&
                (sb instanceof Object) && (new MyList() instanceof ArrayList));

    }
}
