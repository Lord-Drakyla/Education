package manzilin.homework.h_04.task4;

import java.util.Scanner;

public class Task4 {
    static final int firstMember = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество членов прогрессии: ");
        int membersCount = enterData(console);
        System.out.print("Введите разницу между членами: ");
        int membersDiff = enterData(console);
        int[] Result = new int[membersCount];
        Result[0]=firstMember;
        System.out.println("Первый член арифметической прогрессии равен "+Result[0] );
        for (int i = 1; i < Result.length ; i++) {
            Result[i]=Result[i-1]+membersDiff;
            System.out.println("Член арифметической прогрессии № " + (i+1) + " равен "+
                     Result[i] );
        }

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
