package manzilin.homework.h_09.Task3;

import java.time.LocalDate;

public class Woman extends Homo {
    int distance;

    public Woman(String name, LocalDate birthDay) {
        super(name, birthDay);
    }

    public Woman(String name) {
        super(name);
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

