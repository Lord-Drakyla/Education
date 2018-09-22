package ru.manzilin.homework.h_17;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.manzilin.homework.h_17.books.Book;
import ru.manzilin.homework.h_17.books.Fiction;

import java.nio.file.Path;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library AlexadrinaBiblio = Library.openLib("One.LIB");
        AlexadrinaBiblio.addBook(new Fiction("Преступление и наказание", "Ф.М.Достоевский",
                LocalDate.of(2018,9,22)));

    }
}



// TODO потоки обязательно должны закрываться
// TODO отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки