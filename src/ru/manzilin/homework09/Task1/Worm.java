package ru.manzilin.homework09.Task1;



public class Worm extends Animal{
    private String name;

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
}
