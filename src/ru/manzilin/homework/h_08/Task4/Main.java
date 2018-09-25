package ru.manzilin.homework.h_08.Task4;

public class Main {
    public static void main(String[] args) {
        Man one = new Man("Василий");
        Man two = new Man("Василий");
        Man three = new Man("Василий");
        Man four = new Man("Василий");
        Man five = new Man("Василий");
        System.out.println(Man.getCount());
        System.out.println(one.getCount());
        System.out.println(two.getCount());
        System.out.println(three.getCount());
        // И даже если поменять имена экземляров счетчик будет одинаков.
    }
}
