package manzilin.homework.h_07.Classes.Enums;

public enum Juice {
    ORANGE("Апельсиновый сок", 100), LEMON("Лимонный сок", 200);

    public String title;
    public int price;

    Juice(String title, int price) {
        this.title = title;
        this.price = price;
    }
}