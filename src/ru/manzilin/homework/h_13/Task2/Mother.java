package ru.manzilin.homework.h_13.Task2;


import ru.manzilin.homework.h_13.Task2.Food.Food;

public class Mother extends Homo {


    public Mother(String name) {
        super(name);
    }

    public void eat (Food food, Child child){
        try{
            if (child.eatUp(food)){
            System.out.println("День прекрасный, ребенок накормленный");
        }

        }catch (FoodNegativeException ex){
            ex.printStackTrace();
        }finally {
            child.kissMother();
        }

    }



}
