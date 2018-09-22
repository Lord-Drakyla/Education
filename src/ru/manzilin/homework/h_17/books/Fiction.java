package ru.manzilin.homework.h_17.books;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Fiction extends Book {
    private static final long serialVersionUID = -5054070362703379299L;
    private static final Logger LOG = LoggerFactory.getLogger(Fiction.class);

    public Fiction(String title, String author, LocalDate yearPublication) {
        super(title, author, yearPublication);
        LOG.trace("Создан экземпляр типа Художественная литература -" + this.toPrint());
    }

}
