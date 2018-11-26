package manzilin.SpringInAction.VendingMachine;


import manzilin.SpringInAction.VendingMachine.Exceptions.GoodsException;
import manzilin.SpringInAction.VendingMachine.Exceptions.MoneyEatingException;
import manzilin.SpringInAction.VendingMachine.Exceptions.MoneyNotEnoughException;
import manzilin.SpringInAction.VendingMachine.Goods.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Торговый автомат
 */
public class VendingMachine implements Machine {
    private static final Logger LOG = LoggerFactory.getLogger(VendingMachine.class);
    private double money = 0;
    private Product[] drinks;

    public VendingMachine(Product[] drinks) {
        this.drinks = drinks;
    }

    /**
     * Добавление купюр в автомат
     *
     * @param money - сумма внесенных купюр
     * @return текущий остаток
     * DONE: имитировать замятие купюры
     * DONE: сумму замятых купюр сохранить в исключении
     * DONE: ошибка должна обрабатываться на уровне пользователя (в классе ProblemApp)
     * DONE: Добавлено логгирование
     */
    public double addCash(double money) throws MoneyEatingException {
        LOG.debug("-- addCash() > получил параметр: {}", money);
        double situation = Math.random();
        double amount = Math.random() * money;
        LOG.debug(">> addCash() Количество замятых купюр {}, вероятность на данный момент{}", amount, situation);
        if (situation < 0.1) {
            throw new MoneyEatingException("При вводе купюр случилось замятие. Необходимо получить обратно." +
                    "\n Попробуйте ещё раз.", amount);
        }
        this.money += money;
        return this.money;
    }

    /**
     * Получает из автомата выбранный напиток
     * <p>
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
    public Good Good(int key) {
        LOG.trace(">> Good()");
        Product selected;
        Good drink = null;
        try {
            if (isKeyValid(key)) {
                selected = drinks[key];
                drink = selected.take();
            } else {
                throw new GoodsException(key + " - товар с таким кодом отсутствует. Невозможно выдать товар." +
                        "\n Попробуйте еще раз");
            }

            if (isMoneyEnough(selected)) {
                money -= drink.getPrice();
            } else {
                drink = null;
                throw new MoneyNotEnoughException(this.money + " - такой суммы недостаточно. Внесите больше денег" +
                        "\n Попробуйте ещё раз");
            }
        } catch (GoodsException e) {
            e.getMessage();
            LOG.error("Проблемы с товаром", e);

        } catch (MoneyNotEnoughException e) {
            e.getMessage();
            LOG.error("Проблемы с деньгами", e);
        }
        return drink;
    }

    /**
     * Формирует список товаров
     *
     * @return строки с информацией о товаре
     */
    public String[] typeOfGood() {
        LOG.trace(">> typeOfGood()");
        String[] result = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            result[i] = String.format("%d - %12s: %6.2f руб", i, drinks[i].getName(), drinks[i].getPrice());
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
        return key >= 0 && key < drinks.length;
    }

    /**
     * Выдать сдачу.
     * Количество введеных купюр обнуляется
     *
     * @return остаток
     */
    public double getChange() {
        LOG.trace(">> getChange()");
        double money = this.money;
        this.money = 0;
        return money;
    }

    public double balance() {
        return money;
    }

    public void setBalance(double money) {
        this.money = money;
    }
}
