package manzilin.homework.h_09.Task3;

import java.time.LocalDate;

public class Man extends Homo {
    int distance;

    public Man(String name, LocalDate birthDay) {
        super(name, birthDay);
    }

    @Override
    public void canRun() {
        System.out.println("Хожу");
        distance = distance + 10;
    }

    @Override
    public void canWalk() {
        System.out.println("Бегу");
        distance = distance + 4;
    }

    @Override
    public void canSwim() {
        System.out.println("Плыву, но счетчик километров не измениться - " + distance);

    }
}
