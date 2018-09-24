package ru.manzilin.homework.h_08.Task4.drinks;
/**
 * Общий интерфейс для всех типов напитков
 */
public interface DrinkType {

    /**
     * Получение название напитка
     * @return название
     */
    String getName();

    /**
     * Получение цены товара
     * @return цена
     */
    double getPrice();
}