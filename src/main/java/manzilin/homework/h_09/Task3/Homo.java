package manzilin.homework.h_09.Task3;

import manzilin.homework.h_09.Task2.*;

import java.time.LocalDate;

abstract class Homo implements Run, Swim {
    final String propertyMain = "Sapiens";
    String name;
    LocalDate birthDay;

    public Homo(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }
}
