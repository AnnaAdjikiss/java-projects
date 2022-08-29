package Homework.Homework6;

import java.util.Random;

public class randomKeys {
    public static int[] createArray (int size) {
        int i,j;
        int[] Array = new int[size];
        for (i = 0; i < Array.length; ) {
            int randomNumber = new Random().nextInt(100);
            for (j = 0; j < i; j++) {
                if (Array[j] == randomNumber) {
                    break;
                }
            }
            if (j == i) {
                Array[i] = randomNumber;
                i++;
            }
        }
    return Array;
    }
}