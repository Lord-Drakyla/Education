package ru.manzilin.lesson.Old;

public class Dog extends Animal{
    @Override
    public void doSome() {
        System.out.println("Охраняет что-нибудь");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}