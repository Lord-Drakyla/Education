package manzilin.homework.h_03.task3;


import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int secondCount = console.nextInt();
        int Result = secondCount /3600;
        System.out.println("Количество секунд = " + secondCount
                + ". Часов из них получается - "+Result);
        console.close();
    }
}
