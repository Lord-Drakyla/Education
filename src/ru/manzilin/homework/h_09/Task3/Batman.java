package ru.manzilin.homework.h_09.Task3;

import ru.manzilin.homework.h_09.Task2.Fly;

import java.time.LocalDate;

public class Batman extends Homo implements Fly {
    int scoreOfCriminals;

    public Batman(String name, LocalDate birthDay, int scoreOfCriminals) {
        super(name, birthDay);
        this.scoreOfCriminals = scoreOfCriminals;
    }

    public int getScoreOfCriminals() {
        return scoreOfCriminals;
    }

    public void setScoreOfCriminals(int scoreOfCriminals) {
        this.scoreOfCriminals = scoreOfCriminals;
    }

    @Override
    public void canRun() {
        System.out.println("На бегу преступников захвачу");
        this.scoreOfCriminals++;

    }

    @Override
    public void canWalk() {
        System.out.println("Когда хожу, больше нахожу");
        this.scoreOfCriminals+=2;
    }

    @Override
    public void canSwim() {
        System.out.println("В воде редко мало злодеев");
        double local = Math.random() ;
        if (local <= 0.12) {
            this.scoreOfCriminals++;
        }
    }


    @Override
    public void canFly() {
        System.out.println("На крыльях ночи");
        this.scoreOfCriminals++;
    }
}
