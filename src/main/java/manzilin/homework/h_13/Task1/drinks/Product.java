package manzilin.homework.h_13.Task1.drinks;

import manzilin.homework.h_13.Task1.Exceptions.GoodsExceprion;


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
     * @Exception  DONE: сделать проверку что товар не кончился
     */
    public DrinkType take() throws GoodsExceprion {
        quantity--;
        if (quantity<0) {
            throw new GoodsExceprion("Товар кончился. Требуется сервисное обслуживание. Извините");
        }
        return drinkType;
    }

    public String getName() {
        return drinkType.getName();
    }
    public double getPrice() {
        return drinkType.getPrice();
    }
}
