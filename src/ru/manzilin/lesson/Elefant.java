package ru.manzilin.lesson;

public class Elefant extends Animal {
    @Override
    public void doSome() {
        System.out.println("Играет с детьми");

    }

    @Override
    public String toString() {
        return "Elefant{} " + super.toString();
    }
}
