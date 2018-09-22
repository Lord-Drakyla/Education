package ru.manzilin.homework.h_13.Task2.Food;



public class Burger extends Food {
    private final String checkChild = "Не годен";
    public Burger(String typeFood) {
        super(typeFood);
    }

    @Override
    public String getCheckChild() {
        return checkChild;
    }
}
