package manzilin.SpringInAction.VendingMachine.Goods;

public class defGood implements Good {
    private final String name;
    private final double price;

    public defGood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
