package manzilin.homework.h_09.Task3;

import java.time.LocalDate;

public class BankClerk extends Homo {


    public BankClerk(String name, LocalDate birthDay) {
        super(name, birthDay);
    }

    @Override
    public void canRun() {
        System.out.println("Опаздываю в банк");

    }

    @Override
    public void canWalk() {
        System.out.println("Не беспокоюсь, успеваю на работу");
    }

    @Override
    public void canSwim() {
        System.out.println("Купаюсь в деньгах");
    }
}
