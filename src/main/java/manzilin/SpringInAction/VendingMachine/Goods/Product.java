package manzilin.SpringInAction.VendingMachine.Goods;

import manzilin.SpringInAction.VendingMachine.Exceptions.GoodsException;


/**
 * Класс-обертка "Информация по товару"
 * Добавляет к типу товара дополнительное поле: количество
 */
public class Product implements Good {
    private final Good origin;
    private int quantity;

    public Product(Good goodType, int quantity) {
        this.origin = goodType;
        this.quantity = quantity;
    }

    /**
     * Изъятие напитка из хранилища
     * Меняет количество товара в хранлище
     *
     * @return тип напитка
     * @throws GoodsException DONE: сделать проверку что товар не кончился
     */
    public Good take() throws GoodsException {
        quantity--;
        if (quantity < 0) {
            throw new GoodsException("Товар кончился. Требуется сервисное обслуживание. Извините");
        }
        return origin;
    }

    public String getName() {
        return origin.getName();
    }

    public double getPrice() {
        return origin.getPrice();
    }
}
