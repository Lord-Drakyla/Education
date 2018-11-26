package manzilin.SpringInAction.VendingMachine.Exceptions;

public class VenMachineException extends RuntimeException{
    VenMachineException(String message) {
        super(message);
    }
}
