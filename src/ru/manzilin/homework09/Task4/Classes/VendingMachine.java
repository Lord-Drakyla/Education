package ru.manzilin.homework09.Task4.Classes;

import ru.manzilin.homework09.Task4.Classes.Enums.*;

public class VendingMachine {
    private double money = 0;
    private Candy candy;
    private HotDrink hotDrink;
    private Juice juice;

    public VendingMachine() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void giveMeADrink(HotDrink hotDrink){
        if (this.money > 0) {

            if (hotDrink != null) {
                if (hotDrink.price <= this.money) {
                    System.out.println("Возьмите ваш товар: " + hotDrink.title);
                    money -= hotDrink.price;
                } else {
                    System.out.println("Недостаточно средств!");
                }
            } else {
                System.out.println("Товара нет!");
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }
    public void giveMeADrink(Candy candy){
        if (this.money > 0) {

            if (candy != null) {
                if (candy.price <= this.money) {
                    System.out.println("Возьмите ваш товар: " + candy.title);
                    money -= candy.price;
                } else {
                    System.out.println("Недостаточно средств!");
                }
            } else {
                System.out.println("Товара нет!");
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }
    public void giveMeADrink(Juice juice){
        if (this.money > 0) {

            if (juice != null) {
                if (juice.price <= this.money) {
                    System.out.println("Возьмите ваш товар: " + juice.title);
                    money -= juice.price;
                } else {
                    System.out.println("Недостаточно средств!");
                }
            } else {
                System.out.println("Товара нет!");
            }
        } else {
            System.out.println("Бесплатно не работаем!");
        }
    }


}

