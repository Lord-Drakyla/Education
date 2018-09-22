package ru.manzilin.lesson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  Вывсти рееестр зарплаты
 *  На входе файле
 *  Иванов 156
 *  Петров 76
 *  Сидоров 34
 *  Иванов 40
 *  Иванов 10
 *
 *  Привести на выходе к
 *
 *  Иванов 206
 *  Петров 76
 *  Сидоров 34
 *
 */
public class register {
    public static void main(String[] args) {
        Worker[] workers = new Worker[0];
        try (BufferedReader buffR = new BufferedReader(new FileReader("register.txt")))
        {
            while (buffR.ready()){

        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}

