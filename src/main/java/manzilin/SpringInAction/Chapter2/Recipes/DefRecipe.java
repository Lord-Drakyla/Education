package manzilin.SpringInAction.Chapter2.Recipes;

import manzilin.SpringInAction.Chapter2.CookingException;
import manzilin.SpringInAction.Chapter2.Dishes.DefDish;
import manzilin.SpringInAction.Chapter2.Dishes.Dish;

public class DefRecipe implements Recipe {
    private String dishName;
    private String[] products;

    public DefRecipe(String dishName, String[] products) {
        this.dishName = dishName;
        this.products = products;
    }

    @Override
    public void read() throws CookingException {
        System.out.println("*********RECIPE*********");
        for (String product : products) {
            System.out.println(product);
        }
        System.out.println("************************");
    }

    @Override
    public Dish name() {
        return new DefDish(dishName);
    }
}
