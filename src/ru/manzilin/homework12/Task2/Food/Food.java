package ru.manzilin.homework12.Task2.Food;

public abstract class Food {
    private String typeFood;

    public Food(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getTypeFood() {
        return typeFood;
    }
}
