package Homework.Homework2;
public class task3 {
    public static void main(String[] args)
    {
        String str = "ЕИНАЛЕЖ";
        System.out.println("Заданная строка: " + str);
        char[] arrayFromString = str.toCharArray();
        reverse(arrayFromString, 0, arrayFromString.length - 1);
        String str_reversed = new String(arrayFromString);
        System.out.print("Перевернутая строка: " + str_reversed);
    }
    public static void reverse(char[] arrayFromString, int startIndex, int endIndex)
    {
        if (startIndex < endIndex)
        {
            char temp = arrayFromString[startIndex];
            arrayFromString[startIndex] = arrayFromString[endIndex];
            arrayFromString[endIndex] = temp;
            reverse(arrayFromString, startIndex + 1, endIndex - 1);
        }
    }
}
