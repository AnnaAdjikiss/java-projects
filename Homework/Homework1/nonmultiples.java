package Homework.Homework1;

public class nonmultiples {
    public static String[] searchNonMultiples(int a, int b) {
        StringBuilder sb = new StringBuilder();
        while (a > Byte.MIN_VALUE) {
            if (a % b != 0) sb.append(a + ",");    
            a--;        
        }
        String str = sb. toString();
        String m2[] =  str.split(",");
        return m2;
    }
}
