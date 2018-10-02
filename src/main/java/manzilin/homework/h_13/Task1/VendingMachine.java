package manzilin.homework.h_13.Task1;


import manzilin.homework.h_13.Task1.Exceptions.GoodsExceprion;
import manzilin.homework.h_13.Task1.Exceptions.MoneyEatingException;
import manzilin.homework.h_13.Task1.Exceptions.MoneyNotEnoughExceprion;
import manzilin.homework.h_13.Task1.drinks.*;

/**
 * Торговый автомат
 */
public class VendingMachine {
    private double money = 0;
    private Product[] drinks = new Product[]{
            new Product(ColdDrinkType.COCA, 10),
            new Product(ColdDrinkType.PEPSI, 10),
            new Product(ColdDrinkType.SPRITE, 1),
            new Product(ColdDrinkType.FANTA, 3),
            new Product(HotDrinkType.GREEN_TEA, 100),
            new Product(HotDrinkType.BLACK_TEA, 100),
            new Product(HotDrinkType.AMERICANO, 100),
            new Product(HotDrinkType.CAPPUCINO, 100)
    };

    /**
     * Добавление купюр в автомат
     *
     * @param money - сумма внесенных купюр
     * @return текущий остаток
     * DONE: имитировать замятие купюры
     * DONE: сумму замятых купюр сохранить в исключении
     * DONE: ошибка должна обрабатываться на уровне пользователя (в классе ProblemApp)
     *
     */
    public double addMoney(double money) throws MoneyEatingException {
        double situation = Math.random();
        double amount = Math.random() * money;
        if (situation < 0.1) {
            throw new MoneyEatingException("При вводе купюр случилось замятие. Необходимо получить обратно." +
                    "\n Попробуйте ещё раз.", amount);
        }
        this.money += money;
        return this.money;
    }

    /**
     * Получает из автомата выбранный напиток
     *
     * В методе есть проверка корректности кода напитка, проверка остатков данного продукта
     * и достаточно ли денег чтобы его купить. В случае ошибок выбрасывать соответствующее исключение
     *
     * @param key код продукта
     * @return напиток;
     * DONE: возвращать соответствующую ошибку
     * Неправильный код товара - товар не возвращается
     * DONE: возвращать соответствующую ошибку
     * Нехватает денег - товар не возвращается
     */
    public DrinkType giveMeADrink(int key) throws GoodsExceprion, MoneyNotEnoughExceprion {

        if (!isKeyValid(key)) {
            throw new GoodsExceprion(key+" - товар с таким кодом отсутствует. Невозможно выдать товар." +
                    "\n Попробуйте еще раз");
        }

        Product selected = drinks[key];
        if (!isMoneyEnough(selected)) {
            throw new MoneyNotEnoughExceprion(this.money+" - такой суммы недостаточно. Внесите больше денег" +
                    "\n Попробуйте ещё раз");
        }

        DrinkType drink = selected.take();
        money -= drink.getPrice();
        return drink;
    }

    /**
     * Формирует список товаров
     *
     * @return строки с информацией о товаре
     */
    public String[] getDrinkTypes() {
        String[] result = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            result[i] = String.format("%d - %12s: %6.2f руб", i, drinks[i].getName(),drinks[i].getPrice());
        }
        return result;
    }

    /**
     * Проверка что хватает денег на выбранный напиток
     *
     * @param selected - выбранный напиток
     * @return true если денег хватает, иначе - false
     */
    private boolean isMoneyEnough(Product selected) {
        return money >= selected.getPrice();
    }

    /**
     * Проверка что выбрали существующий тип напитка
     * Не проверяет остаток, только границы массива
     *
     * @param key номер напитка
     * @return true если есть напиток с таким номером, иначе false
     */
    private boolean isKeyValid(int key) {
        return key >=0 && key < drinks.length;
    }

    /**
     * Выдать сдачу.
     * Количество введеных купюр обнуляется
     *
     * @return остаток
     */
    public double getChange() {
        double money = this.money;
        this.money = 0;
        return money;
    }

    public double getBalance() {
        return money;
    }
}
