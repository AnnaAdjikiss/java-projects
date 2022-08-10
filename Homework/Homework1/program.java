package Homework.Homework1;

import java.io.IOException;
import java.util.Arrays;

public class program {
    public static void main(String[] args) throws IOException {
        int i = randomNumber.createRandomNumber();
        System.out.println("случайное число (i): " +i);
        int n = oldBit.getOldBit(Math.abs(i));
        System.out.println("Старший бит (n): " + n);
        createFile.saveFile("java-projects/Homework/Homework1/m1.txt", Arrays.toString(multiples.searchMultiples(i, n)));
        createFile.saveFile("java-projects/Homework/Homework1/m2.txt", Arrays.toString(nonmultiples.searchNonMultiples(i, n)));
        System.out.println("Массивы m1 и m2 записаны в файлы с соответствующими названиями");
    }
}