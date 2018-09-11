package ru.manzilin.homework09.Task1;



public class Cat extends Animal{
    private String name;

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
}
