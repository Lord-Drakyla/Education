package manzilin.lesson.parking;

import manzilin.lesson.parking.DAO.Contracts;
import manzilin.lesson.parking.DAO.Owners;

import java.util.Scanner;

public class ParkingApp {

    public static void main(String[] args) {
        ParkingApp app  = new ParkingApp();
        app.help();
        app.process();
    }
    private Scanner scanner;
    private Owners owner;
    private Contracts contract;
    private void process() {
        scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String action = scanner.next();
            switch (action){
                case "quit": return;
                case "list owners": list();
                break;
            }

        }
    }

    private void list() {
        String table = scanner.next();
        switch (table){
            case "owner":
        }
    }


    private void help() {
        System.out.println("Выберите действия:");
        System.out.println("Список владельцев");
        System.out.println("Список договоров");
        System.out.println("Добавить контракт");
        System.out.println("Добавить владельца");
        System.out.println("Добавить машину");
        System.out.println("Выйти:");
    }


}
