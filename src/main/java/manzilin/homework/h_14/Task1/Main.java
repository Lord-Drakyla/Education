package manzilin.homework.h_14.Task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import manzilin.homework.h_14.Task1.Exceptions.*;
import manzilin.homework.h_14.Task1.drinks.DrinkType;

import java.util.Scanner;


public class Main {
    private static final VendingMachine vm = new VendingMachine();
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOG.info("Начало работы программы");
        LOG.trace("-- main() > получил кол-во параметров: {}", args.length);
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
            scan.nextLine();
        }
    }

    /**
     * обработка добавления денег в автомат
     * @param money - сумма
     * @throws  MoneyEatingException DONE: добавить обработку исключительной ситуации - замятия
     */
    private static void processAddMoney(int money)  throws MoneyEatingException {
            System.out.println("Текущий баланс: " + vm.addMoney(money));
            LOG.debug("-- processAddMoney() > получил параметр: {}", money);
            LOG.info("Количество денег - {}", money);

        }

    /**
     * обработка получения напитка
     * @param key - код напитка в автомате
     * @throws MoneyNotEnoughException, GoodsException, MoneyEatingException, VenMachineException
     * DONE: обработать все возможные исключения
     */
    private static void processGetDrink(int key) {
        try{
            DrinkType drinkType = vm.giveMeADrink(key);
            if (drinkType != null) {
                System.out.println("Ммм! " + drinkType.getName() + "!");
            } else {
                System.out.println("Напиток почему-то не получен...");
                LOG.debug("Напиток почему-то не получен \n -- processAddMoney() > получил параметр: {}", key);
            }
        }catch (MoneyNotEnoughException e){
            e.getMessage();
            LOG.error("Проблемы с деньгами", e);

        }catch (GoodsException e){
            e.getMessage();
            LOG.error("Проблемы с товаром", e);

        } catch (MoneyEatingException e){
            vm.setBalance(vm.getBalance() -  e.getSumEatMoney());
            e.returnMoney();
            LOG.error("Количество замятых денег - {}",  e.getSumEatMoney(), e);
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
        System.out.println( "Введите 'add <количество>' для добавления купюр" );
        System.out.println( "Введите 'get <код напитка>' для получения напитка" );
        System.out.println( "Введите 'help' для получения подсказки" );
        System.out.println( "Введите 'end' для получения сдачи" );
    }
}
