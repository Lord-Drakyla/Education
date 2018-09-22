package ru.manzilin.lesson;

public class Worker {
    private final String name;
    private int salary;

    public Worker(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }
    public int addSalary(int add){
        return this.salary += add;
    }

    public String getName() {
        return name;
    }
}
