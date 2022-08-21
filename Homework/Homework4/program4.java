package Homework.Homework4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class program4 {
    public static void main(String[] args) {
// 1. Объявить и инициализировать связанный список в 10000 элементов случайным числом от -1024 до 1024
        System.out.println("--------------------------------------------------------------");
        var startLL_T1_5 = System.currentTimeMillis();
        List<Integer> linkedL = new LinkedList<>();
        int size = 100_000; //   беру 100_000 вместо 10_000 для большей наглядности
        for (int i = 0; i < size; i++) {
            linkedL.add((int) (Math.random() * 2049 - 1024));
        }
        
// 2. Пройти по списку и удалить все отрицательные элементы
        var startLL_T2 = System.currentTimeMillis();
        linkedL.removeIf(x -> x < 0);    //Нашла в гугле :)
        var finishLL_T2 = System.currentTimeMillis();

// 3. Скопировать в переменные и удалить из списка первый и второй элементы, 
// сложить переменные, результат сохранить в начало списка.
        var startLL_T3 = System.currentTimeMillis(); 
        Integer first = linkedL.remove(0);
        Integer second = linkedL.remove(0);
        linkedL.add(0, first + second);
        var finishLL_T3 = System.currentTimeMillis();

// 4. Реализовать пункт №3 для всего списка.
        while (linkedL.size() > 1) {
            Integer ifirst = linkedL.remove(0);
            Integer isecond = linkedL.remove(0);
            linkedL.add(0, ifirst + isecond);
        }
        // System.out.println("Результат выполнения пунктов №1-5 для LinkedList: " + linkedL);
// 5. Измерить время исполнения пунктов №2 и №3. 
        var timeLL_T2 = finishLL_T2 - startLL_T2; 
        System.out.println("время выполнения пункта №2 для LinkedList:" + timeLL_T2);
        var timeLL_T3 = finishLL_T3 - startLL_T3; 
        System.out.println("время выполнения пункта №3 для LinkedList:" + (double)timeLL_T3);
        var finishLL_T1_5 = System.currentTimeMillis();
        System.out.println("--------------------------------------------------------------");
// 6. *Реализовать пункты с первого по пятый но с ArrayList. Сравнить время исполнения.
        var startAL_T1_5 = System.currentTimeMillis();
        List<Integer> arrayL = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayL.add((int) (Math.random() * 2049 - 1024));    
        }
        var startAL_T2 = System.currentTimeMillis();
        arrayL.removeIf(x -> x < 0); 
        var finishAL_T2 = System.currentTimeMillis();

        var startAL_T3 = System.currentTimeMillis(); 
        Integer firstA = arrayL.remove(0);
        Integer secondA = arrayL.remove(0);
        arrayL.add(0, firstA + secondA);
        var finishAL_T3 = System.currentTimeMillis();

        while (arrayL.size() > 1) {
            Integer ifirstA = arrayL.remove(0);
            Integer isecondA = arrayL.remove(0);
            arrayL.add(0, ifirstA + isecondA);
        }
        var timeAL_T2 = finishAL_T2 - startAL_T2; 
        System.out.println("время выполнения пункта №2 для ArrayList:" + timeAL_T2);
        var timeAL_T3 = finishAL_T3 - startAL_T3; 
        System.out.println("время выполнения пункта №3 для ArrayList:" + (double)timeAL_T3);
        //System.out.println("Результат выполнения пунктов №1-5 для ArrayList: " + arrayL);
        var finishAL_T1_5 = System.currentTimeMillis();

        System.out.println("--------------------------------------------------------------");
        var timeLL_T1_5 = finishLL_T1_5 - startLL_T1_5; 
        System.out.println("время выполнения пунктов №1-5 для LinkedList: " + timeLL_T1_5);

        var timeAL_T1_5 = finishAL_T1_5 - startAL_T1_5; 
        System.out.println("время выполнения пунктов №1-5 для ArrayList: " + timeAL_T1_5);

        conclusion(timeLL_T1_5, timeAL_T1_5);

// 7. **Оптимизировать реализацию заданий так, чтобы время выполнения LinkedList и ArrayList были наименьшим.
     
// При оптимизации я ориентировалась на получение искомого результата, а не непосредственное повторение действий.
        System.out.println("--------------------------------------------------------------");
        tryfastenAL.arrayList();
        System.out.println("--------------------------------------------------------------");
        tryfastenLL.linkedList();
        System.out.println("--------------------------------------------------------------");
    }
    public static void conclusion (long timeLL, long timeAL) {
        if (timeLL > timeAL) System.out.println("алгоритм с использованием LinkedList медленее, чем с ArrayList");
        if (timeLL < timeAL) System.out.println("алгоритм с использованием LinkedList быстрее, чем с ArrayList");
        if (timeLL == timeAL) System.out.println("время выполнения алгоритмов идентично");
    }
}
