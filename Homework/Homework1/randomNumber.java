package Homework.Homework1;

public class randomNumber {
    static int createRandomNumber() {
        int number = 0;
        int random = (int) ((Math.random() * (Byte.MAX_VALUE - Byte.MIN_VALUE)) + Byte.MIN_VALUE); //случайное число Byte
        if (random == 0) {
            System.out.println("перезапустите программу, необходимо отличное от нуля значение для продолжения");
        }
        else {
            number = random;
        }
        return number;
    }
}
