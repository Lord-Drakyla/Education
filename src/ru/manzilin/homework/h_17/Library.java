package ru.manzilin.homework.h_17;

import ru.manzilin.homework.h_17.books.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class Library implements Serializable {
    private static final long serialVersionUID = -2678311517410866040L;
    private Book[] books =  new Book[1000];
    private static final Logger LOG = LoggerFactory.getLogger(Library.class);
    private int lastPos;


    // TODO восстанавливать содержимое библиотеки после перезапуска.

    public static Library openLib (String name) {
        File file = new File(name);
        if (file.exists()){
        try (
                FileInputStream fis = new FileInputStream(name);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            LOG.info("Открываем файл с библиотекой");
            return (Library) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            LOG.error("Ошибка при открытии файла: " + name , e);

        }}
        return null;
    }


    // TODO добавлять книгу в библиотеку.

    public void addBook(Book book) {
        LOG.info("Добавляется книга: {}", book);
        try{
            if (lastPos>1000) {throw new LibraryEnoughException("При добавлении книги в бибиотеку обнаружили" +
                    ", что места в ней больше нет. Обратитесь к создателю библиотеки");}
        } catch (LibraryEnoughException e) {
            e.getMessage();
            LOG.debug("Библиотека заполнена!!! \n {}", e.getStackTrace().toString(), e);
        }

        books [lastPos] = book;
        lastPos++;
        LOG.info("Библиотека заполнена до значения: {}", lastPos);

    }
    // TODO показывать список книг в библиотеке.



    // TODO показывать соответствующее сообщение в случае ошибок.

}

