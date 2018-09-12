package ru.manzilin.homework09.Task1;


import ru.manzilin.homework09.Task2.*;
public class Worm extends Animal implements Run{


    public Worm() {
    }

    public Worm(String name) {
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println(this.getClass().getSimpleName()+" - "+name+", говорит "+say());
    }
    @Override
    public String say() {
        return "Хрум-хрум?";
    }

    @Override
    public void canRun() {
        System.out.println("Стараюсь, хотя скорость не намного выше");
    }

    @Override
    public void canWalk() {
        System.out.println("Как хорошо под "+Run.PLACE);
    }
}
