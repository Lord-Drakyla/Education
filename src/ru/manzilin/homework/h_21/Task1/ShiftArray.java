package ru.manzilin.homework.h_21.Task1;

import java.util.Arrays;

public class ShiftArray {
    static int[][] array = new int[10][10];

    public static void main(String[] args) {
        createTestArray();
        shiftTestArray();
        System.out.println(Arrays.deepToString(array));
        

    }

    private static void shiftTestArray() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                array[i][j] = array[i][j + 1];
                System.out.printf("%d\t", array[i][j]);
            }
            array[i][array[i].length - 1] = 0;
            System.out.printf("%d\t", array[i][array[i].length - 1]);
            System.out.println();
        }

    }

    private static void createTestArray() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 20 + 1);
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}


