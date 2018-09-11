package ru.manzilin.homework09.Task1;



public class Duck extends Animal{
    private String name;

    public Duck() {
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(this.getClass().getSimpleName()+" - "+name+", говорит "+say());
    }
    @Override
    public String say() {
        return "Кря-кря";
    }
}
