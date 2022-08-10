package Homework.Homework1;

public class multiples {
    public static String[] searchMultiples(int a, int b) {
        StringBuilder sb = new StringBuilder();
        while (a < Byte.MAX_VALUE) {
            if (a % b == 0) sb.append(a + ",");    
            a++;        
        }
        String str = sb. toString();
        String m1[] =  str.split(",");
        return m1;
    }
    
}
