package manzilin.homework.h_13.Task2;


import manzilin.homework.h_09.Task3.Woman;
import manzilin.homework.h_13.Task2.Food.Food;

public class Mother extends Woman {


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
