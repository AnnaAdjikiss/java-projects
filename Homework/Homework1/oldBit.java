package Homework.Homework1;

public class oldBit {
    static int getOldBit(int number) {
        int b;     
        String temp = "";    
            while(number !=0){  
            b = number%2;  
            temp = b + temp;  
            number = number/2;  
        } 
        System.out.println("i (модуль) в двоичном представлении: " + temp + " (для наглядности подсчета старшего бита)");
        return temp.length();
    }
}
