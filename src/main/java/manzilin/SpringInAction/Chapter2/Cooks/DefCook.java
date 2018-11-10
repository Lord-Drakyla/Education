package manzilin.SpringInAction.Chapter2.Cooks;

import manzilin.SpringInAction.Chapter2.Dishes.Dish;
import manzilin.SpringInAction.Chapter2.Instruments.Instrument;
import manzilin.SpringInAction.Chapter2.Recipes.Recipe;

public class DefCook implements Cook {
    private Recipe recipe;
    private Instrument[] instruments;
    private String surname;

    public DefCook(Recipe recipe, Instrument[] instruments, String surname) {
        this.recipe = recipe;
        this.instruments = instruments;
        this.surname = surname;
    }

    @Override
    public Dish Dish() {
        System.out.println("Я повар - " + surname);
        this.recipe.read();
        for (Instrument instrument : this.instruments) {
            instrument.use();
        }
        return this.recipe.name();
    }
}
