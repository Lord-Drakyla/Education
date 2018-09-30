package ru.manzilin.homework.h_08.Task5;

import java.time.LocalDate;
import java.util.Arrays;

public class Contract {

    private int number;
    private String[] listOfGoods;
    private LocalDate date;

    public Contract() {    }

    public Contract(int number, String[] listOfGoods, LocalDate date) {
        this.number = (number != 0) ? number : 000001;
        this.listOfGoods = listOfGoods;
        this.date = (date != null) ? date : LocalDate.now();
    }

    public String[] getList() {
        return listOfGoods;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumber() {
        return number;

    }

    public String toPrint() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n   number: " + this.number);
        sb.append("\n   List: " + Arrays.toString(this.listOfGoods));
        sb.append("\n   date: " + this.date);
        return sb.toString();
    }
}

