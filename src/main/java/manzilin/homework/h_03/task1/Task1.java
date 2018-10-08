package manzilin.homework.h_03.task1;


import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите цену за литр: ");
        int litrPrice = console.nextInt();
        System.out.print("Введите количество литров: ");
        int litrCount = console.nextInt();
        int Result = litrCount*litrPrice;
        System.out.println("Цена за литр = "+ litrPrice + ". Стоимость " + litrCount
                + " л. бензина составляет " + Result + " рублей.");
        console.close();

    }
}
