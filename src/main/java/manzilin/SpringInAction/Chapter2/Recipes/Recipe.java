package manzilin.SpringInAction.Chapter2.Recipes;

import manzilin.SpringInAction.Chapter2.CookingException;
import manzilin.SpringInAction.Chapter2.Dishes.Dish;

public interface Recipe {
    void read() throws CookingException;
    Dish name();
}
