package manzilin.homework.h_13.Task1.Exceptions;

public class MoneyEatingException extends VenMachineExceprion {
    private  double sumEatMoney;

    public MoneyEatingException(String message, double sumEatMoney) {
        super(message);
        this.sumEatMoney = sumEatMoney;
    }

    public double getSumEatMoney() {
        return this.sumEatMoney;
    }
}
