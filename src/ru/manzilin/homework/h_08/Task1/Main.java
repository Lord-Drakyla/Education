package ru.manzilin.homework.h_08.Task1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.manzilin.homework.h_08.Task1.drinks.DrinkType;
import ru.manzilin.homework.h_13.Task1.Exceptions.GoodsExceprion;

import java.util.Scanner;

public class Main {
    private static VendingMachine vm = new VendingMachine();
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws GoodsExceprion {
        log.info("Сообщение 1");
        System.out.println("Наши напитки: ");
        for (String line : vm.getDrinkTypes()) {
            System.out.println(line);
        }

        Scanner scan = new Scanner(System.in);
        printHelp();
        while (scan.hasNext()) {
            String command = scan.next();
            switch (command) {
                case "add": {
                    int money = scan.nextInt();
                    processAddMoney(money);
                    break;
                }
                case "get": {
                    int key = scan.nextInt();
                    processGetDrink(key);
                    break;
                }
                case "end": {
                    processEnd();
                    return;
                }
                default:
                    System.out.println("Команда не определена");
            }
            scan.nextLine();
        }
    }

    /**
     * обработка добавления денег в автомат
     * @param money - сумма
     * @Exception DONE: добавить обработку исключительной ситуации - замятия
     *              В h_13.Task1
     */
    private static void processAddMoney(int money) {

        System.out.println("Текущий баланс: " + vm.addMoney(money));
    }

    /**
     * обработка получения напитка
     * @param key - код напитка в автомате
     * @Exception DONE: обработать все возможные исключения
     *      *              В h_13.Task1
     */
    private static void processGetDrink(int key) throws GoodsExceprion {
        DrinkType drinkType = vm.giveMeADrink(key);
        if (drinkType != null) {
            System.out.println("Ммм! " + drinkType.getName() + "!");
        } else {
            System.out.println("Напиток почему-то не получен...");
        }
    }

    /**
     * обработка получения сдачи
     */
    private static void processEnd() {
        System.out.println("Ваша сдача: " + vm.getChange());
    }

    /**
     * выводит подсказку по доступным командам
     */
    private static void printHelp() {
        System.out.println( "Введите 'add <количество>' для добавления купюр" );
        System.out.println( "Введите 'get <код напитка>' для получения напитка" );
        System.out.println( "Введите 'end' для получения сдачи" );
    }
}
