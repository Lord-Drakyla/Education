package manzilin.homework.h_13.Task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import manzilin.homework.h_13.Task1.Exceptions.*;
import manzilin.homework.h_13.Task1.drinks.*;
import java.util.Scanner;


public class Main {
    private static VendingMachine vm = new VendingMachine();
    private static final Logger log1 = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log1.info("Сообщение от slf4j");
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
     * @Exception   DONE: добавить обработку исключительной ситуации - замятия
     */
    private static void processAddMoney(int money)  {
        double localMoney=0;
        try{
            System.out.println("Текущий баланс: " + vm.addMoney(money));

        }catch (MoneyEatingException e){
            localMoney=  vm.getBalance() -  e.getSumEatMoney();
            e.getMessage();
            log1.error("Количество замятых денег - {}", localMoney, e);
            System.out.println("Возвращаем вам ваши замятые деньги: " + localMoney);

        }
    }

    /**
     * обработка получения напитка
     * @param key - код напитка в автомате
     * @Exception   DONE: обработать все возможные исключения
     */
    private static void processGetDrink(int key) {
        try{
            DrinkType drinkType = vm.giveMeADrink(key);
            if (drinkType != null) {
                System.out.println("Ммм! " + drinkType.getName() + "!");
            } else {
                System.out.println("Напиток почему-то не получен...");
            }
        }catch (MoneyNotEnoughExceprion e){
            e.getMessage();
            log1.error("Проблемы с деньгами", e);
        }catch (GoodsExceprion e){
            e.getMessage();
            log1.error("Проблемы с товаром", e);
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
