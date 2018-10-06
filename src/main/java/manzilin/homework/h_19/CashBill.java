package manzilin.homework.h_19;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Класс кассового чека
 */
public class CashBill {
    private final StringBuilder CONTENT = new StringBuilder();

    /**
     * @param name - Имя файла источника.
     */
    public void createFrom(String name) {
        StringBuilder product = new StringBuilder();
        float amount = 0;
        float price = 0f;
        float cost = 0f;

        try (FileReader fr = new FileReader(name);
             Scanner scanner = new Scanner(fr)
        ) {
            String DEL = "================================================================";
            String EOF = "\r\n";
            String header = "%-15s \t %6s \t %6s \t %10s";
            String body = "%-15s \t %6.2f  \t x %6.3f \t %10.2f";
            String end = "%-15s \t %34.2f";
            CONTENT.append(String.format(header, "Наименование:", "Цена:", "Кол-во:", "Стоимость")).append(EOF);
            CONTENT.append(DEL).append(EOF);
            scanner.useLocale(Locale.ENGLISH);
            while (scanner.hasNext()) {
                if (scanner.hasNextFloat()) {
                    amount = scanner.nextFloat();
                    price = scanner.nextFloat();
                } else {
                    product.append(scanner.next()).append(" ");
                }

                if (amount > 0) {
                    cost += price * amount;
                    CONTENT.append(String.format(body, product, price, amount, price * amount)).append(EOF);
                    product.delete(0, product.length());
                    amount = 0;
                    price = 0f;
                }
            }
            CONTENT.append(DEL).append(EOF);
            CONTENT.append(String.format(end, "Итого", cost)).append(EOF);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param name - Имя файла, в который выводится информация по чеку.
     */
    public void toOut(String name) {
        try (FileOutputStream fos = new FileOutputStream(name);
             Writer writer = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(writer)
        ) {
            bw.write(CONTENT.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


