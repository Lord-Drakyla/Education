package manzilin.homework.h_25.Task2;

import manzilin.homework.h_23.Basket;

import java.util.*;

/**
 *
 */
public class ShopBasket implements Basket {
    private final Map<String, Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    /**
     * Замена количества товара
     *
     * @param product  - товар
     * @param quantity - его количество
     */
    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.replace(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(basket.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return basket.get(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry: basket.entrySet()){
            sb.append("\n   product: ").append(entry.getKey());
            sb.append("\t   quantity: ").append(entry.getValue());
        }
        return sb.toString();

    }
}
