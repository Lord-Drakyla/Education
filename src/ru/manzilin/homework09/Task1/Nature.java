package ru.manzilin.homework09.Task1;

public class Nature {
    public static void main(String[] args) {
        Animal cat = new Cat("Мурзик");
        Animal duck = new Duck("Дональд");
        Animal lion = new Lion("Кимба");
        Animal worm = new Worm(); //("Рейчел");
        cat.getName();
        duck.getName();
        lion.getName();
        worm.getName();
    }
}
