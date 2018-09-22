package ru.manzilin.homework.h_17.books;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class NonFiction extends Book{
    private static final long serialVersionUID = -4311913756530454792L;
    private static final Logger LOG = LoggerFactory.getLogger(NonFiction.class);
    public NonFiction(String title, String author, LocalDate yearPublication) {
        super(title, author, yearPublication);
        LOG.trace("Создан экземпляр типа НЕ Художественная литература -" + this.toPrint());
    }
}
