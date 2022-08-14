package Homework.Homework2;
public class task4_6 {
    public static void main(String[] args)
    {
        int numberA = 3;
        int numberB = 56;

        //task4
        System.out.println(equation(numberA, numberB, '+'));
        System.out.println(equation(numberA, numberB, '-'));
        System.out.println(equation(numberA, numberB, '*'));

        System.out.println();

        //task5
        del_ins(equation(numberA, numberB, '+'));
        del_ins(equation(numberA, numberB, '-'));
        del_ins(equation(numberA, numberB, '*'));

        System.out.println();

        //task6
        replace(equation(numberA, numberB, '+'));
        replace(equation(numberA, numberB, '-'));
        replace(equation(numberA, numberB, '*'));

    }
    public static String equation(int a, int b, char operator) {
        StringBuilder line = new StringBuilder();
        line.append(a).append(" ").append(operator).append(" ").append(b).append(" = ");
        switch (operator) {
            case '+':
                line.append(a + b);
                break;
            case '-':
                line.append(a - b);
                break;
            case '*':
                line.append(a * b);
                break;
        }
        return line.toString();
    }
    public static void del_ins (String text) {
        StringBuilder sb = new StringBuilder(text);
        int index = sb.indexOf("=");
        sb.deleteCharAt(index);
        sb.insert(index, "равно");
        System.out.println(sb.toString());
    }
    public static void replace (String text) {
        StringBuilder sb = new StringBuilder(text);
        int index = sb.indexOf("=");
        sb.replace(index, index+1, "равно");
        System.out.println(sb.toString());
    }
}