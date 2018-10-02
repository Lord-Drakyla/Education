package manzilin.homework.h_14.Task1.drinks;
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
