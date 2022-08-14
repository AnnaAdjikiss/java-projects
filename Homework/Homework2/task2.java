package Homework.Homework2;
public class task2 {
    public static void main(String[] args) {
        
        String str1 = "12345";
        String str2 = "54321";
        System.out.println("строки для проверки: " + str1 + " и " + str2);
        System.out.println(checkRotation(str1, str2));

        String str3 = "Таганрог";
        String str4 = "Горнатаг";
        System.out.println("строки для проверки: " + str3 + " и " + str4);
        System.out.println(checkRotation(str3, str4));

    }
    public static String checkRotation (String str1, String str2) {
        String reverse = new StringBuffer(str1).reverse().toString();
        if (reverse.equals(str2) == true) return "являются вращениями";
        else return "не являются вращениями";
    }
}
