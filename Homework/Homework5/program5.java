package Homework.Homework5;

import java.util.HashMap;
import java.util.Map;

public class program5 {
    public static void main(String[] args) {
// 1. Объявить и инициализировать словарь hashMap<String, String>
        System.out.println("______________________________________________________________________п.п.1-2");
        Map<String, String> perfumes = new HashMap<>();
// 2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
// (я делаю: производитель духов - название)
        perfumes.put("Killian", "Vodka on the rocks");
        perfumes.put("Carner", "Tennis club");
        perfumes.put("Armani Prive", "Figuier eden");
        perfumes.put("Jo Malone", "Earl Grey & Cucumber");
        perfumes.put("Memo", "Ocean Leather");
        perfumes.put("Nishane", "Ege");
        perfumes.put("L'Artisan", "Batucada");
        perfumes.put("27 87","Wandervogel");
        perfumes.put("Pierre Guillaume","ENTRE CIEL ET MER");
        perfumes.put("Zoologist","Chameleon");
        System.out.println(perfumes);
        System.out.println("_______________________________________________________________________п.3");
// 3. Пройти по словарю и добавить к значениям символ "!"
        perfumes.replaceAll((k,v) -> v = v + "!");
        System.out.println(perfumes);
        System.out.println("_______________________________________________________________________п.4");
// 4. Добавить нового автора и название книги если соответствующего ключа не было.
        perfumes.putIfAbsent("Memo", "Ilha do Mel"); //пример1 (такой ключ есть) 
        perfumes.putIfAbsent("Byredo", "Mixed Emotions"); //пример2 (такого ключа нет) 
        System.out.println(perfumes);
        System.out.println("_______________________________________________________________________п.5");
// 5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключу значения первое слово.
        String newKey1 = "Carner"; //пример1 (такой ключ есть) 
        String newKey2 = "Gucci"; //пример2 (такого ключа нет) 
        perfumes.computeIfPresent(newKey1, (k, v) -> deleteWord(v)); 
        perfumes.computeIfPresent(newKey2, (k, v) -> deleteWord(v)); 
        System.out.println(perfumes);
        System.out.println("_______________________________________________________________________п.6");
// 6. *Пройти по словарю другим, не таким как в пункте 3, методом и вывести пары ключ значение в консоль.
        perfumes.forEach((k,v) -> System.out.println(k + ": " + v));
        System.out.println("_______________________________________________________________________п.7");    
// 7. ** Пройти по словарю другим, не таким как в пункте 3 и 6, методом. 
// Добавить к значениям строку "(просмотрен)" и вывести в консоль.
        for (Map.Entry<String,String> e: perfumes.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue() + "(просмотрен)");   
        }
    }
    public static String deleteWord (String text) { 
        String updatedText;
        if (text.contains(" ") == true) updatedText = text.substring(text.indexOf(" "), text.length());
        else updatedText = "";
        return updatedText;
    }      
}
