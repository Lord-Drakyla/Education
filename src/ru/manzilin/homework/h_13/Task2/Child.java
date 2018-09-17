package ru.manzilin.homework.h_13.Task2;

class Child extends Homo{
    final String PROPERTY = "Воспитанный";
    private String[] foodList = {"Burger"};
    Child(String name) {
        super(name);
    }
    public boolean eatUp(String food) {
        for (String local : this.foodList) {
            if (food == local) {
                throw new FoodNegativeException("Еда не подошла ребенку. Подбирайте лучше");
            }
        }
        return true;
    }
    public void kissMother() {
        System.out.printf("%s %s благодарит %s%n",this.PROPERTY,this.name, "свою маму" );
    }
}