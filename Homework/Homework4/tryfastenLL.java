package Homework.Homework4;

import java.util.LinkedList;
import java.util.List;

public class tryfastenLL {
    public static void linkedList() {

// для чистоты эксперимента применен полностью аналогичный подход в оптимизации
        var startLL_new = System.currentTimeMillis();
        List<Integer> linkedL = new LinkedList<>();
        List<Integer> positive_linkedL = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            Integer temp = (int) (Math.random() * 2049 - 1024);
            linkedL.add(temp);
            if (temp > 0) positive_linkedL.add(temp);
        }
        Integer firstA = positive_linkedL.remove(0);
        Integer secondA = positive_linkedL.remove(0);
        positive_linkedL.add(0, firstA + secondA);
        Integer sum = 0;
        for (Integer item : positive_linkedL) { 
            sum += item; 
        }
        List<Integer> new_linkedL = new LinkedList<>();
        new_linkedL.add(sum);
        // System.out.println("Результат выполнения пунктов №1-5 для LinkedList: " + new_linkedL);
        var finishLL_new = System.currentTimeMillis();
        var timeLL_new = finishLL_new - startLL_new;
        System.out.println("время выполнения новой версии алгоритма LinkedList: " + timeLL_new);
    }
}
