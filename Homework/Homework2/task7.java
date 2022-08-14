package Homework.Homework2;

public class task7 {
    public static void main(String[] args) {
        
        String str = "";
        for (int i = 0; i < 10_000; i++) {
           str += "=";
        }
        System.out.println(str); 
        var s = System.currentTimeMillis();
        String str1 = str.replace("=", "равно");
        System.out.println(str1);        
        var str_time = System.currentTimeMillis() - s;
 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
        sb.append("=");
        }
        System.out.println(sb);
        var s1 = System.currentTimeMillis();
        for (int index = 0; index < 50_000; index += 5) {
        sb.replace(index, index+1, "равно");            
        }
        System.out.println(sb); 
        var sb_time = System.currentTimeMillis() - s1;

        System.out.println("Время работы алгоритма с применением String: " + str_time);
        System.out.println("Время работы алгоритма с применением StringBuilder: " + sb_time);
        System.out.println("ВЫВОД:");
        conclusion(str_time, sb_time);
    }
    public static void conclusion (long str_time, long sb_time) {
        if (str_time > sb_time) System.out.println("Алгоритм с использованием String медленее, чем с Stringbuilder");
        if (str_time < sb_time) System.out.println("Алгоритм с использованием String быстрее, чем с Stringbuilder");
        if (str_time == sb_time) System.out.println("Время выполнения алгоритмов иденично");
    }
}
