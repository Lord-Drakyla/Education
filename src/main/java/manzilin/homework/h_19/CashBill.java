package manzilin.homework.h_19;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class CashBill {
    private final StringBuilder CONTENT = new StringBuilder();
    public void run(String name) {
        StringBuilder product = new StringBuilder();
        float amount = 0;
        float price = 0f;
        float cost= 0f;

        try (FileReader fr = new FileReader(name);
             Scanner scanner = new Scanner(fr)
        ) {
            String DEL = "================================================================";
            String EOF = "\r\n";
            CONTENT.append(String.format("%-15s \t %6s \t %6s \t %10s", "Наименование:", "Цена:", "Кол-во:", "Стоимость")).append(EOF);
            CONTENT.append(DEL).append(EOF);
            scanner.useLocale(Locale.ENGLISH);
            while (scanner.hasNext()) {
                if (scanner.hasNextFloat()) {
                    amount = scanner.nextFloat();
                    price = scanner.nextFloat();
                } else {
                    product.append(scanner.next()).append(" ");
                }

                if (amount>0){
                    cost += price*amount;
                    CONTENT.append(String.format("%-15s \t %6.2f  \t x %6.3f \t %10.2f", product, price, amount, price*amount )).append(EOF);
                    product.delete(0,product.length());
                    amount = 0;
                    price = 0f;
                }
            }
            CONTENT.append(DEL).append(EOF);
            CONTENT.append(String.format("%-15s \t %34.2f","Итого", cost)).append(EOF);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void toOut(String name){
        try (FileOutputStream fos = new FileOutputStream(name);
             Writer writer =new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(writer)
        ) {
            bw.write(CONTENT.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


