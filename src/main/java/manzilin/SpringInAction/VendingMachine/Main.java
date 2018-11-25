package manzilin.SpringInAction.VendingMachine;

import manzilin.SpringInAction.VendingMachine.Exceptions.MoneyEatingException;
import manzilin.SpringInAction.VendingMachine.Exceptions.MoneyNotEnoughException;
import manzilin.SpringInAction.VendingMachine.Exceptions.VenMachineException;
import manzilin.SpringInAction.VendingMachine.Goods.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;


public class Main {
    private static VendingMachine vm;
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LOG.info("Начало работы программы");
        LOG.trace("-- main() > получил кол-во параметров: {}", args.length);
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "Vending.xml");
        vm = (VendingMachine) ctx.getBean("Machine#777");
        System.out.println("Наши напитки: ");
        for (String line : vm.typeOfGood()) {
            System.out.println(line);
        }
        start();
    }

    /**
     * Обработка ввода команд
     */
    private static void start() {
        printHelp();
        while (sc.hasNext()) {
            String command = sc.next();
            switch (command) {
                case "add": {
                    int money = sc.nextInt();
                    processAddMoney(money);
                    break;
                }
                case "get": {
                    int key = sc.nextInt();
                    processGetDrink(key);
                    break;
                }
                case "end": {
                    processEnd();
                    LOG.info("Конец работы программы");
                    return;
                }
                case "help": {
                    printHelp();
                    break;
                }
                default:
                    System.out.println("Команда не определена");
            }
            sc.nextLine();
        }
    }

    /**
     * обработка добавления денег в автомат
     *
     * @param money - сумма
     * @throws MoneyEatingException DONE: добавить обработку исключительной ситуации - замятия
     */
    private static void processAddMoney(int money) throws MoneyEatingException {
        System.out.println("Текущий баланс: " + vm.addCash(money));
        LOG.debug("-- processAddMoney() > получил параметр: {}", money);
        LOG.info("Количество денег - {}", money);

    }

    /**
     * обработка получения напитка
     *
     * @param key - код напитка в автомате
     * @throws MoneyNotEnoughException, GoodsException, MoneyEatingException, VenMachineException
     *                                  DONE: обработать все возможные исключения
     */
    private static void processGetDrink(int key) {
        try {
            Good drinkType = vm.Good(key);
            if (drinkType != null) {
                System.out.println("Ммм! " + drinkType.getName() + "!");
            } else {
                System.out.println("Напиток почему-то не получен...");
                LOG.debug("Напиток почему-то не получен \n -- processGetDrink() > получил параметр: {}", key);
            }

        } catch (MoneyEatingException e) {
            vm.setBalance(vm.balance() - e.getSumEatMoney());
            e.returnMoney();
            LOG.error("Количество замятых денег - {}", e.getSumEatMoney(), e);
            e.getMessage();
        } catch (VenMachineException e) {
            e.getMessage();
            LOG.error("Проблемы с работой автомата", e);
        } finally {
            processEnd();
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
        System.out.println("Введите 'add <количество>' для добавления купюр");
        System.out.println("Введите 'get <код напитка>' для получения напитка");
        System.out.println("Введите 'help' для получения подсказки");
        System.out.println("Введите 'end' для получения сдачи");
    }
}
