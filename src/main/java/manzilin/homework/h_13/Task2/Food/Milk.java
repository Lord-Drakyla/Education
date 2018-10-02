package manzilin.homework.h_13.Task2.Food;

public class Milk extends manzilin.homework.h_13.Task2.Food.Food {
    private final String checkChild = "Годен";
    public Milk(String typeFood) {
        super(typeFood);
    }

    @Override
    public String getCheckChild() {
        return checkChild;
    }
}
