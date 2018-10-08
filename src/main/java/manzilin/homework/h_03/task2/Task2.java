package manzilin.homework.h_03.task2;


import java.util.Scanner;

public class Task2 {



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите ставку НДФЛ (в %): ");
        int nalogDFL = console.nextInt();
        System.out.print("Введите Зарплату на бумаге: ");
        int dirtyCash = console.nextInt();
        int Result = (dirtyCash-dirtyCash*nalogDFL/100);
        System.out.println("Ставка НДФЛ = "+ nalogDFL + ". Зарплата на бумаге = " + dirtyCash
                + ". Чистая зарплата равна "+Result+" рублей");
        console.close();
    }
}
