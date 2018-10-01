package ru.manzilin.homework.h_17;

import ru.manzilin.homework.h_17.books.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Класс библиотеки
 * DONE: показывать соответствующее сообщение в случае ошибок.
 */
public class Library implements Serializable {
    private static final long serialVersionUID = -2678311517410866040L;
    private Book[] books = new Book[1000];
    private static final Logger LOG = LoggerFactory.getLogger(Library.class);
    private int lastPos;

    /**
     * DONE: Метод, умеющий восстанавливать содержимое библиотеки после перезапуска
     *
     * @param name - Имя файла, содержащего библиотеку
     * @return - в любом случае выведет обхект библиотеки.
     */
    public Library toOpen(String name) {
        File file = new File(name);
        Library temp = new Library();
        if (file.exists()) {
            try (
                    FileInputStream fis = new FileInputStream(name);
                    ObjectInputStream ois = new ObjectInputStream(fis)
            ) {
                LOG.info("Открываем файл с библиотекой");
                temp = (Library) ois.readObject();

            } catch (IOException | ClassNotFoundException e) {
                LOG.error("Ошибка при открытии файла: " + name, e);
            }
        }
        return temp;
    }

    /**
     * DONE: Умеет добавлять книгу в библиотеку.
     * DONE: потоки обязательно должны закрываться
     * DONE: отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки
     *
     * @param book - любой вид книги может быть добавлен в библиотеку.
     * @Exception - Для контроля размера библиотеки.
     */
    public void addBook(Book book) {
        LOG.info("Добавляется книга: {}", book.getTitle());
        try {
            if (lastPos > 999) {
                throw new LibraryEnoughException("При добавлении книги в бибиотеку обнаружили" +
                        ", что места в ней больше нет. Обратитесь к создателю библиотеки");
            }
        } catch (LibraryEnoughException e) {
            e.getMessage();
            LOG.debug("Библиотека заполнена!!! \n {}", e.getStackTrace().toString(), e);
        }

        books[lastPos] = book;
        lastPos++;
        LOG.info("Библиотека заполнена до значения: {}", lastPos);

    }

    /**
     * DONE: показывать список книг в библиотеке
     */
    public void toPrintList() {
        LOG.info("Вывод списка книг на консоль");
        int number = 1;
        for (Book book : books) {
            if (book != null) System.out.println(String.format("\t%d%s\n", number, book.toPrint()));
            number++;
        }
    }

    public void toClose(String name) {

        try (
                FileOutputStream fos = new FileOutputStream(name);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(this);
            LOG.info("Библиотека сохраняется в файл " + name);
        } catch (IOException e) {
            LOG.error("Ошибка при записи библиотеки", e);
            e.printStackTrace();
        }

    }
}

