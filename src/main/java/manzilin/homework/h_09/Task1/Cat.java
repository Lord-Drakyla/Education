package manzilin.homework.h_09.Task1;


import manzilin.homework.h_09.Task2.*;

public class Cat extends Animal implements Fly, Run, Swim{


    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println(this.getClass().getSimpleName()+" - "+name+", говорит "+say());
    }
    @Override
    public String say() {
        return "Мяу-Мяу";
    }

    @Override
    public void canFly() {
        System.out.println("На самом деле неправда");
    }

    @Override
    public void canRun() {
        System.out.println("люблю бегать за мышами");
    }

    @Override
    public void canWalk() {
        System.out.println("люблю ходить около хозяйки");
    }

    @Override
    public void canSwim() {
        System.out.println("Не люблю купаться!!!");
    }
}
