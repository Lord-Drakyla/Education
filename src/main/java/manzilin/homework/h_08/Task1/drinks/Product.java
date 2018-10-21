package manzilin.homework.h_08.Task1.drinks;

import manzilin.homework.h_13.Task1.Exceptions.GoodsException;

/**
 * Класс-обертка "Информация по товару"
 *
 * Добавляет к типу товара дополнительное поле: количество
 */
public class Product {
    private final DrinkType drinkType;
    private int quantity;

    public Product(DrinkType drinkType, int quantity) {
        this.drinkType = drinkType;
        this.quantity = quantity;
    }

    /**
     * Изъятие напитка из хранилища
     * Меняет количество товара в хранлище
     *
     * @return тип напитка
     *
     * @throws  GoodsException
     * DONE: сделать проверку что товар не кончился
     */
    public DrinkType take() throws GoodsException {
        //
        quantity--;
        if ((quantity < 0)) throw new GoodsException("При взятии товара обнаружилось, что его нет. Нужно пополнить");
        return drinkType;
    }

    public String getName() {
        return drinkType.getName();
    }
    public double getPrice() {
        return drinkType.getPrice();
    }
}
