package manzilin.homework.h_21;

public class Array {

    private int[][] array = new int[10][10];

    public Array() {
        fillRandom(this.array);
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.toPrint("Просто массив рандомных чисел");
        array.toLeft();
        array.toPrint("Задание 1");
        array.reverse();
        array.toPrint("Задание 2");
        array.reverseAnother();
        array.toPrint("Другой способ");
    }

    void toPrint(String phrase) {
        System.out.println("\t" + phrase);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }

    void fillRandom(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 20 + 1);
            }
        }
    }

    /**
     * Задание № 1
     * Сдвиг массива
     */
    void toLeft() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                array[i][j] = array[i][j + 1];
            }
            array[i][array[i].length - 1] = 0;
        }
    }

    /**
     * Задание № 2
     * вариант экзотический
     */
    void reverse() {
        int forward;
        int backwards;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            forward = 0;
            backwards = array[i].length - 1;
            while (forward < array[i].length / 2) {
                temp = array[i][forward];
                array[i][forward] = array[i][backwards];
                array[i][backwards] = temp;
                forward++;
                backwards--;
            }
        }
    }

    /**
     * Задание № 2
     * Предложение Антона.
     */
    void reverseAnother() {
        int key = array.length;
        int deepKey = array[0].length;
        int[][] tempArr = new int[key][deepKey];
        int i = 0;
        int j;
        key = key - 1;
        while (key > -1) {
            j = 0;
            deepKey = array[key].length - 1;
            while (deepKey > -1) {
                tempArr[i][j] = array[key][deepKey];
                deepKey--;
                j++;
            }
            i++;
            key--;
        }
        for (int k = 0; k < array.length; k++) {
            System.arraycopy(tempArr[k], 0, array[k], 0, array[k].length);
        }

    }

}
