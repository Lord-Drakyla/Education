package manzilin.homework.h_14.Task1.Exceptions;

public class MoneyEatingException extends VenMachineException {
    private final double sumEatMoney;

    public MoneyEatingException(String message, double sumEatMoney) {
        super(message);
        this.sumEatMoney = sumEatMoney;
    }

    public double getSumEatMoney() {
        return this.sumEatMoney;
    }
    public void returnMoney(){
        System.out.println("Возвращаем замятые купюры: " + this.getSumEatMoney());
    }

}
