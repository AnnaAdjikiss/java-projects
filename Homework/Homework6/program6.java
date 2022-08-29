package Homework.Homework6;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class program6 {
    public static void main(String[] args) throws IOException {

// 1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts
        Set<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
       
// 2. Добавить в множества по 10 случайных целочисленных ключей.
//    (возьмем промежуток случайных чисел от 1 до 100)

        int [] arrayForHS = randomKeys.createArray(10);
        for (int i = 0; i < 10; i++) {
            hs.add(arrayForHS[i]);
        }

        int [] arrayForLHS = randomKeys.createArray(10);
        for (int i = 0; i < 10; i++) {
            lhs.add(arrayForLHS[i]);
        }

        int [] arrayForTS = randomKeys.createArray(10);
        for (int i = 0; i < 10; i++) {
            ts.add(arrayForTS[i]);
        }

        System.out.println("hs: " + hs);
        System.out.println("lhs: " + lhs);
        System.out.println("ts: " + ts);

// 3. Пройти по множеству hs и, 
// при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs
        for (Integer item : lhs) {
            hs.removeIf(k-> k == item);
        }
        System.out.println("________________________________________________________________________________");
        System.out.println("altered hs: " + hs);

// 4. Пройти по множеству lhs и, 
// при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts
        for (Integer item : lhs) {
            if (ts.contains(item) == false) ts.add(item);
        }
        System.out.println("________________________________________________________________________________");
        System.out.println("altered ts: " + ts);

// 5. Объявить и инициализировать множество TreeSet ts1 
// с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
// Заполнить ts1 15 случайными числами и вывести на печать. 
System.out.println("_______TS comparator____________________________________________________________");  
        Set<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
                public int compare(Integer integer, Integer t1) {
                    if (t1%2 == 0) return -1;
                    if (integer == t1) return 0; else  return 1;  
                }
        });
        int [] arrayForTS1 = randomKeys.createArray(15);

        for (int i = 0; i < 15; i++) {
            ts1.add(arrayForTS1[i]);
        }
        System.out.println("ts1: " + ts1);

// 6. *Объявить и инициализировать множество TreeMap tm 
// с компаратором Integer (-1 при значении  %2==0 ;0 при ==;1 при значении %2!=0).
// Заполнить tm 15 случайными числами и вывести на печать.
System.out.println("_______TM comparator____________________________________________________________");  
        TreeMap <Integer, Integer> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (t1%2 == 0) return -1;
                    if (integer == t1) return 0; else  return 1;  
                }
        });
        int [] arrayForTM = randomKeys.createArray(15);
        for (int i = 0; i < 15; i++) {
            int v = arrayForTM[i];
            tm.put(i, v);
        }
        System.out.println("tm: " + tm);
    }
}
