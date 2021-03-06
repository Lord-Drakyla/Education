package manzilin.homework.h_23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ShopBasket implements Basket, Validateable {
    private final List<String> products = new ArrayList<>();
    private final List<Integer> quantities = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        ValideData(product,quantity);
        products.add(product);
        quantities.add(quantity);
    }

    @Override
    public void removeProduct(String product) {
        int index = products.indexOf(product);
        products.remove(index);
        quantities.remove(index);
    }

    /**
     * Поменяет только у первого найденного
     * @param product - товара
     * @param quantity - его количество
     */
    @Override
    public void updateProductQuantity(String product, int quantity) {
        ValideData(product,quantity);
        int index = products.indexOf(product);
        quantities.set(index, quantity);
    }

    @Override
    public void clear() {
        products.clear();
        quantities.clear();
    }

    @Override
    public List<String> getProducts() {
        return this.products;
    }

    @Override
    public int getProductQuantity(String product) {
        int index = products.indexOf(product);
        return quantities.get(index);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            sb.append("\n   product: ").append(products.get(i));
            sb.append("\t   quantity: ").append(quantities.get(i));
        }
        return sb.toString();

    }
}
