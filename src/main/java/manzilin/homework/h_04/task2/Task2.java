package manzilin.homework.h_04.task2;


import java.util.Scanner;

public class Task2 {
    static String valChet; // свойство четности
    static String valCell; // свойство положительности
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        int needNumber = enterData(console);
        if (needNumber > 0 ) {
            valCell = "Положительным";
        }
        else if (needNumber < 0) {
            valCell = "Отрицательным";
        }
        else {
            valCell = "Нулевым";
        }
        valChet = (needNumber % 2 == 0) ? "Четным" : "Нечетным";
        System.out.println("Число, введеное вами является - "+ valCell+", "+valChet);

        console.close();



    }
    static int enterData(Scanner console){
        int local =0;
        while(true) {
            if (console.hasNextInt()) {
                local = console.nextInt();
                break;
            } else {
                System.out.println("Не то");
                console.next();
            }
        }
        return local;


    }
}
