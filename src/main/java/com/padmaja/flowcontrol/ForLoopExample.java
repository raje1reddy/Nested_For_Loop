package com.padmaja.flowcontrol;
import java.lang.String;

public class ForLoopExample {
    public int tablesExample() {
        for (int hrs = 1; hrs <= 6; hrs++) {
            for (int min = 1; min <= 60; min++) {
                System.out.println(hrs + "" + min);
            }

        }
        return 0;
    }
}