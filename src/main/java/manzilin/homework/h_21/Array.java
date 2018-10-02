package manzilin.homework.h_21;




public class Array {

    private static int[][] array = new int[10][10];

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        fillTestArray();
        toPrint();
        System.out.println("\t");
        Task1.toLeft();
        toPrint();
        System.out.println("\t");
        Task2.reversTestArray();
        toPrint();

    }
    private static void toPrint() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }
    private static void fillTestArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 20 + 1);
            }
        }
    }

    static class Task1 {
        static void toLeft() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                array[i][j] = array[i][j + 1];
            }
            array[i][array[i].length - 1] = 0;
        }

    }
    }


    static class Task2 {
        static void reversTestArray() {
        int forward = 0;
        int backwards = array.length - 1;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            while (forward< array.length / 2) {
                temp = array[i][forward];
                array[i][forward] = array[i][backwards];
                array[i][backwards] = temp;
                forward++;
                backwards--;
            }
            forward = 0;
            backwards = array.length - 1;
        }
    }
    }
}
