package ru.manzilin.homework.h_17.books;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Detective extends Fiction {
    private static final long serialVersionUID = -3497007269762621359L;
    private static final Logger LOG = LoggerFactory.getLogger(Detective.class);

    public Detective(String title, String author, LocalDate yearPublication) {
        super(title, author, yearPublication);
        LOG.trace("Создан экземпляр типа Детективы -" + this.toPrint());
    }
}
