package ru.manzilin.homework.h_17;

import ru.manzilin.homework.h_17.books.Fiction;

import java.time.LocalDate;

public class AppLibrary {
    public static void main(String[] args) {
        Library AlexadrinaBiblio = new Library();
        AlexadrinaBiblio = AlexadrinaBiblio.toOpen("One.LIB");
        AlexadrinaBiblio.addBook(new Fiction("Преступление и наказание", "Ф.М.Достоевский",
                LocalDate.of(2018, 9, 22)));
        AlexadrinaBiblio.toPrintList();
        AlexadrinaBiblio.toClose("One.LIB");


    }
}



