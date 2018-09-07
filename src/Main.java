import Classes.Enums.Candy;
import Classes.Enums.HotDrink;
import Classes.Enums.Juice;
import Classes.VendingMachine;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();

        vm1.setMoney(100);
        vm1.giveMeADrink(HotDrink.TEA);

        VendingMachine vm2 = new VendingMachine();
        vm2.setMoney(300);
        vm2.giveMeADrink(Candy.ROTFRONT);

        VendingMachine vm3 = new VendingMachine();
        vm3.setMoney(300);
        vm3.giveMeADrink(Juice.ORANGE);
    }
}
