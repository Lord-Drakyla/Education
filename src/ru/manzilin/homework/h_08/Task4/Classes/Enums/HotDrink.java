package ru.manzilin.homework.h_08.Task4.Classes.Enums;

public enum HotDrink {
    COFFEE("Кофе", 50), TEA("Чай", 20);

    public String title;
    public int price;

    HotDrink(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
