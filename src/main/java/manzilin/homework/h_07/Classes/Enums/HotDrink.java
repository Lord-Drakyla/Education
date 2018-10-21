package manzilin.homework.h_07.Classes.Enums;

public enum HotDrink {
    COFFEE("Кофе", 50), TEA("Чай", 20);

    public final String title;
    public final int price;

    HotDrink(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
