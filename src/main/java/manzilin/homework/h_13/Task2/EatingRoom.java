package manzilin.homework.h_13.Task2;

import manzilin.homework.h_13.Task2.Food.*;

public class EatingRoom {
    static Child child = new Child("Сережа");
    static Mother mother = new Mother("Катя");
    public static void main (String[] args) {


            Food food = new Banane("Banane");
            //mother.eat(food, child);
            food = new Burger("Burger");
            mother.eat(food, child);



    }
}
