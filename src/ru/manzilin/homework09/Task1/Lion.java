package ru.manzilin.homework09.Task1;


import ru.manzilin.homework09.Task2.*;

public class Lion extends Animal implements Run {


    public Lion() {
    }

    public Lion(String name) {
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println(this.getClass().getSimpleName()+" - "+name+", говорит "+say());
    }
    @Override
    public String say() {
        return "Мяу-Мяу??";
    }

    @Override
    public void canRun() {
        System.out.println("Хватит, чтобы догнать тебя");
    }

    @Override
    public void canWalk() {
        System.out.println(Run.PLACE+" - это мое царство");
    }
}
