package ru.manzilin.homework09.Task1;



public class Lion extends Animal{
    private String name;

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
}
