package manzilin.SpringInAction.Chapter2.Recipes;

import manzilin.SpringInAction.Chapter2.CookingException;
import manzilin.SpringInAction.Chapter2.Dishes.DefDish;
import manzilin.SpringInAction.Chapter2.Dishes.Dish;

public class FriedEgg implements Recipe {
    private String name = "Яичница с сыром";
    private String[] products = new String[] {
            "Яйца - 3 шт",
            "Сыр твердый - 70-100 г",
            "Специи (по желанию) - по вкусу",
            "Соль - щепотка"
    };

    public FriedEgg() {}

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
        return new DefDish(name);
    }
}
