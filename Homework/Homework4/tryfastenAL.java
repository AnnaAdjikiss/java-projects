package Homework.Homework4;

import java.util.ArrayList;
import java.util.List;

public class tryfastenAL {
    public static void arrayList() {

        var start_new = System.currentTimeMillis();

//п1. и п.2 объединены для ускорения       
        List<Integer> arrayL = new ArrayList<>();
        List<Integer> positive_arrayL = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            Integer temp = (int) (Math.random() * 2049 - 1024);
            arrayL.add(temp);    
            if (temp > 0) positive_arrayL.add(temp);
        }
//п.3 не изменен, т.к. его выполнение почти не отнимает время
        Integer firstA = positive_arrayL.remove(0);
        Integer secondA = positive_arrayL.remove(0);
        positive_arrayL.add(0, firstA + secondA);
//п.4 т.к. в итоге мы должны получить сумму всех положительных эл-тов, то и делаем это!
        Integer sum = 0;
        for (Integer item : positive_arrayL) { 
            sum += item; 
        }
// и сразу записываем в новый массив из одного эл-та:        
        List<Integer> new_arrayL = new ArrayList<>();
        new_arrayL.add(sum);
        // System.out.println("Результат выполнения пунктов №1-5 для ArrayList: " + new_arrayL);

        var finish_new = System.currentTimeMillis();

        var time_new = finish_new- start_new; 
        System.out.println("время выполнения новой версии алгоритма ArrayList: " + time_new);
    }
}
