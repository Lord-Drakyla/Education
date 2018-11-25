package manzilin.SpringInAction.VendingMachine.Exceptions;

public class MoneyNotEnoughException extends VenMachineException {
    public MoneyNotEnoughException(String message) {
        super(message);
    }
}
