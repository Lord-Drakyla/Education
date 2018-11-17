package manzilin.lesson.MyParking;

import manzilin.lesson.MyParking.DAO.Database;
import manzilin.lesson.MyParking.entities.Contract;
import manzilin.lesson.MyParking.entities.Owner;
import manzilin.lesson.MyParking.impl.OwnerDAOImpl;
import manzilin.lesson.MyParking.impl.PostgresDatabaseImpl;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ParkingApp {
    public static void main(String[] args) {
        ParkingApp app = new ParkingApp();
        app.init();
        app.showHelp();
        app.processCommands();
    }

    private Scanner scanner;
    private final Database database = new PostgresDatabaseImpl();

    private void init() {
        ((PostgresDatabaseImpl) database).start();
    }

    private void processCommands() {
        scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String action = scanner.next();
            switch (action) {
                case "quit":
                    return;
                case "list":
                    processList();
                    break;
                case "add":
                    processAdd();
                    break;
                case "sign":
                    doSign();
                    break;
                default:
                    System.out.println("Используйте верную команду");

            }
        }
    }

    private void doSign() {
    }

    private void processAdd() {
        String table = scanner.next();
        try {
            switch (table) {
                case "owner": {
                    String name = scanner.next();
                    String dateStr = scanner.next();
                    Owner owner = new Owner();
                    owner.setName(name);
                    owner.setBirthDay(LocalDate.parse(dateStr));
                    int newId = database.getOwnerDAO().insert(owner);
                    System.out.println("Создана запись с id=" + newId);
                }
                case "contract": {
                    int owner = scanner.nextInt();
                    Contract contract = new Contract();
                    contract.setOwner(database.getOwnerDAO().getById(owner));
                    contract.setSignDate(LocalDate.now());
                    int newId = database.getContractDAO().insert(contract);
                    System.out.println("Создана запись с id=" + newId);
                }
            }
        } catch (SQLException e) {
            System.out.println("Не удалось сохранить элементы: " + e.getMessage());
        }
    }

    private void processList() {
        String table = scanner.next();
        try {
            switch (table) {
                case "owner":
                    PrintList(database.getOwnerDAO().getList());
                case "contract":
                    PrintList(database.getContractDAO().getList());
            }
        } catch (SQLException e) {
            System.out.println("Не удалось получить элементы: " + e.getMessage());
        }
    }

    private void PrintList(List list) {
        for (Object member : list) {
            System.out.println(member);
        }
        System.out.println("---done---");
    }

    private void showHelp() {
        System.out.println("Выберите действие:");
        System.out.println("list owner");
        System.out.println("list contract");
        System.out.println("add owner <имя> <дата рождения>");
        System.out.println("add contract <№ владельца>");
        System.out.println("add car <№ контракта> <№ дома> <№ места> <№ авто>");
        System.out.println("sign <№ контракта>");
        System.out.println("quit");
    }


}
