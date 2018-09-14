package ru.manzilin.homework12.Task2;

import ru.manzilin.homework12.Task2.Food.Banane;
import ru.manzilin.homework12.Task2.Food.Burger;
import ru.manzilin.homework12.Task2.Food.Food;

public class EatingRoom {
    static Child child = new Child("Сережа");
    static Mother mother = new Mother("Катя");
    public static void main (String[] args) {

        try{
            Food food = new Banane("Banane");
            //mother.eat(food, child);
            food = new Burger("Burger");
            mother.eat(food, child);

        }catch (FoodNegativeException ex){
            ex.printStackTrace();
        }finally {
            child.kissMother();
        }


    }
}
