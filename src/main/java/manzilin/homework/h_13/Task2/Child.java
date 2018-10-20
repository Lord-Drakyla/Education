package manzilin.homework.h_13.Task2;

import manzilin.homework.h_13.Task2.Food.*;

class Child  {
    final String PROPERTY = "Воспитанный";
    private String[] foodList = {"Burger"};
    private String name;

    Child(String name) {
        this.name= name;
    }
    public boolean eatUp(Food food) {
        if (food.getCheckChild() != "Годен") {
                throw new FoodNegativeException("Еда не подошла ребенку. Подбирайте лучше");
            }
        return true;
    }
    public void kissMother() {
        System.out.printf("%s %s благодарит %s%n",this.PROPERTY,this.name, "свою маму" );
    }
}