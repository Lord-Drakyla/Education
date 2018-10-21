package manzilin.homework.h_04.task1;

import java.util.Scanner;

public class Task1 {
    static int firstMember = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите числа, разделяя их пробелами: ");
        System.out.println();
        String[] str = enterData(console).split(" ");
        int indexOfMin = 0;
        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.decode(str[i]);
            if (numbers[i] < numbers[indexOfMin]) {
                indexOfMin = i;
            }
        }

        System.out.println("Минимальное число из введенных = " + numbers[indexOfMin]);

    }


    static String enterData(Scanner console) {
        String local = console.nextLine();
        return (local != null && local.length()>0)? local :"0";
       }

}



