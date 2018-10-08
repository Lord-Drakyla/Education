package manzilin.homework.h_07.Classes.Enums;

public enum Candy {
    ALPENGOLD("Альпийский молочный", 10), ROTFRONT("Красный Октябрь", 20);

    public String title;
    public int price;

    Candy(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
