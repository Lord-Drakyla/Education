package ru.manzilin.homework12.Task2;


import ru.manzilin.homework12.Task2.Food.Food;

public class Mother extends Homo {


    public Mother(String name) {
        super(name);
    }

    public void eat (Food food, Child child){
        if (child.eatUp(food.getTypeFood())){
            System.out.println("День прекрасный, ребенок накормленный");
        }
    }



}
