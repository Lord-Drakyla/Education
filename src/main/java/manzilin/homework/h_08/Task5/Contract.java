package manzilin.homework.h_08.Task5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Contract {

    private int number;
    private String[] listOfGoods;
    private LocalDate date;

    public Contract() {
    }

    public Contract(int number, String[] listOfGoods, LocalDate date) {
        this.number = (number != 0) ? number : 1;
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
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("number: ").append(this.number);
        sb.append("\n").append("List: ").append(Arrays.toString(this.listOfGoods));
        sb.append("\n").append("date: ").append(this.date);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else if (!(obj instanceof Contract)) {
            result = false;
        } else {
            Contract contract = (Contract) obj;
            result = number == contract.number &&
                    Arrays.equals(listOfGoods, contract.listOfGoods) &&
                    Objects.equals(date, contract.date);
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(number, date);
        result = 31 * result + Arrays.hashCode(listOfGoods);
        return result;
    }
}

