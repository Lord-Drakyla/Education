package manzilin.homework.h_04.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[][] tableMulti = new int[10][10];
        for (int i = 0; i <tableMulti.length; i++) {
            System.out.println();
            System.out.println("_________________________________________");
            for (int j = 0; j < tableMulti[i].length; j++) {
                tableMulti[i][j] = (i+1)*(j+1);
                System.out.print(tableMulti[i][j]+"\t");
            }

        }

    }

    }

