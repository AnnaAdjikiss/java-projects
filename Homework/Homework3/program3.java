package Homework.Homework3;

import java.util.ArrayList;
import java.util.Collections;

public class program3 {
    public static void main(String[] args) {
// 1. Напишите программу, чтобы создать новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран:");
        String[] colors = { "black", "white", "gray", "lightgrey", "darkgrey" };
        ArrayList<String> listofColors = new ArrayList<>();
        for (int index = 0; index < colors.length; index++) {
            listofColors.add(colors[index]); 
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Создана коллекция: " + listofColors);
        System.out.println();
// 2. Напишите программу для итерации всех элементов списка цветов и добавления к каждому символа '!':");
        System.out.println("Добавлен '!' к каждому цвету: ");
        for (String item : listofColors) { 
            System.out.println(item + "!"); 
        }
        System.out.println();
// 3 . Напишите программу для вставки элемента в список массивов в первой позиции:");
        String newcolor = "orange";
        listofColors.add(1, newcolor);
        System.out.println("Добавлен элемент " + newcolor + ": " + listofColors);
        System.out.println();
// 4. Напишите программу для извлечения элемента (по указанному индексу) из заданного списка. 
        String extractedElem = listofColors.get(1);
        System.out.println("Элемент с индексом 1: " + extractedElem);
        System.out.println();
// 5. Напишите программу для обновления определенного элемента массива по заданному элементу. 
        String elemToChange = "black";
        int pos = listofColors.indexOf(elemToChange);
        String newElem = "beige";
        listofColors.set (pos, newElem); 
        System.out.println(elemToChange + " заменен на " + newElem);
        System.out.println("Обновленная коллекция: " + listofColors);
        System.out.println();
// 6. Напишите программу для удаления третьего элемента из списка массивов. 
        listofColors.remove(3);
        System.out.println("Коллекция без 3го элемента: " + listofColors);
        System.out.println();
// 7. Напишите программу для поиска элемента в списке массивов. 
        String elemtoSearch1 = "pink";
        String elemtoSearch2 = "white";
        searchForelem(elemtoSearch1, listofColors);
        searchForelem(elemtoSearch2, listofColors);
        System.out.println();
// 8. Напишите программу для сортировки заданного списка массивов. 
        Collections.sort(listofColors);
        System.out.println("Коллекция, отсортированная по алфавиту: " + listofColors);
        System.out.println();
// 9. Напишите программу для копирования одного списка массивов в другой. 
        ArrayList<String> newList = new ArrayList<>(listofColors);
        System.out.println("Копия: " + newList);
    }
    public static void searchForelem(String elem, ArrayList<String>list) {
        if (list.contains(elem) == true) {
        System.out.println(elem + " присутствует на позиции: " + list.indexOf(elem));
        }
        else System.out.println(elem + " отсутствует в коллекции");
    }   
}
