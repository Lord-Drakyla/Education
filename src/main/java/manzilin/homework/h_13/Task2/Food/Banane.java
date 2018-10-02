package manzilin.homework.h_13.Task2.Food;



public class Banane extends Food {
    private final String checkChild = "Годен";
    public Banane(String typeFood) {
        super(typeFood);
    }

    @Override
    public String getCheckChild() {
        return checkChild;
    }
}
