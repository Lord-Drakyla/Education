package ru.manzilin.homework.h_18.Task1;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class Copy {
    private static File file1=new File("Task1_source.txt");
    private static File file2=new File("Task1_target.txt");


    public static void main(String[] args) {
        new WriteClass(
                new ReadClass(StandardCharsets.US_ASCII)
                        .doReadFile(file1),
                StandardCharsets.UTF_8
        ).doWriteFile(file2);

    }


}
