package manzilin.lesson.parking;

import manzilin.lesson.parking.DAO.Database;
import manzilin.lesson.parking.entities.Owner;
import manzilin.lesson.parking.impl.DatabaseImpl;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class ParkingApp {
    public static void main(String[] args) {
        ParkingApp app = new ParkingApp();
        app.showHelp();
        app.processCommands();
    }

    private Scanner scanner;
    private Database database;

    private void processCommands() {
        database = new DatabaseImpl();
        scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String action = scanner.next();
            switch (action) {
                case "quit": return;
                case "list": processList();
                             break;
                case "add":  processAdd();
                             break;
                case "sign": doSign();

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

                    SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
                    java.util.Date date = sdf.parse(dateStr);

                    Owner owner = new Owner();
                    owner.setName(name);
                    owner.setBirthDate(new java.sql.Date(date.getTime()));
                    int newId = database.getOwnerDAO().insert(owner);
                    System.out.println("Создана запись с id=" + newId);
                }
            }
        } catch (SQLException e) {
            System.out.println("Не удалось сохранить элементы: " + e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void processList() {
        String table = scanner.next();
        try {
            switch (table) {
                case "owner":
                    doPrintList(database.getOwnerDAO().getList());
            }
        } catch (SQLException e) {
            System.out.println("Не удалось получить элементы: " + e.getMessage());
        }
    }

    private void doPrintList(List list) {
        for (Object owner : list) {
            System.out.println(owner);
        }
        System.out.println("---done---");
    }

    private void showHelp() {
        System.out.println("Выберите действие:");
        System.out.println("list owner");
        System.out.println("list contract");
        System.out.println("add owner <имя> <дата рождния>");
        System.out.println("add contract <№ владельца>");
        System.out.println("add car <№ контракта> <№ дома> <№ места> <№ авто>");
        System.out.println("sign <№ контракта>");
        System.out.println("quit");
    }


}
