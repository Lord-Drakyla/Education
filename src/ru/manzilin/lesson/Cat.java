package ru.manzilin.lesson;

public class Cat extends Animal {
    @Override
    public void doSome() {
        System.out.println("Ловит мышей");

    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }
}
