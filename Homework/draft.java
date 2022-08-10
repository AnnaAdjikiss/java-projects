package Homework;

import java.util.Arrays;

//import java.util.Random;
public class draft {
    public static void main(String[] args) {
        //int i = (int) ((Math.random() * (Byte.MAX_VALUE - Byte.MIN_VALUE)) + Byte.MIN_VALUE);
        //System.out.println(i);
        int[] arr = new int[30];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) ((Math.random() * (Byte.MAX_VALUE - Byte.MIN_VALUE)) + Byte.MIN_VALUE);
        }
        System.out.println(Arrays.toString(arr));

        //System.out.println("m1 (все числа больше i, кратные n): " + Arrays.toString(multiples.searchMultiples(i, n)));
        //System.out.println("m2 (все числа меньше i, некратные n): " + Arrays.toString(nonmultiples.searchNonMultiples(i, n)));
    
    }
}


        /* 
        int n = 7;
        int i = 77;
        
        StringBuilder sb = new StringBuilder();
        while (i < 100) {
            if (i % n == 0) sb.append(i + ",");    
            i++;        
        }
        //System.out.println(sb);
        String str = sb. toString();
        String m1[] =  str.split(",");
        System.out.println(Arrays.toString(m1));
        //System.out.println(m1);
   */
        //int i = (Byte.MIN_VALUE + (int) (Math.random() * Byte.MAX_VALUE));
        //Random random = new Random();
        //byte ran = (byte)random.nextInt();
        //System.out.println(ran);
        //int size = Byte.MAX_VALUE;
        //int min = Byte.MIN_VALUE;
        //System.out.println(size);
        //System.out.println(min);
    

