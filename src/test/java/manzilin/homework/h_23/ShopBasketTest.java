package manzilin.homework.h_23;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShopBasketTest {
    String testP = "Минеральная вода";
    int testQ = 6;
    String expectedP = "Минеральная вода";
    int expectedQ = 6;
    String expectedOut = "\n   product: Минеральная вода\t   quantity: 6";
    Basket basket = new ShopBasket();
    @BeforeEach
    void init() {
        basket.addProduct(testP, testQ);
    }

    @AfterEach
    void end() {
        basket.clear();
    }

    @Test
    void IsProductAdded() {
        assertEquals(expectedQ, basket.getProductQuantity(expectedP));
    }

    @Test
    void IsProductRemoved() {
        basket.removeProduct(testP);
        assertEquals("[]", Arrays.toString(basket.getProducts().toArray()));
    }

    @Test
    void newQuantity() {
        basket.updateProductQuantity(testP, 8);
        assertEquals(8, basket.getProductQuantity(expectedP));
    }

    @Test
    void EmptyBasket() {
        basket.clear();
        assertEquals("[]", Arrays.toString(basket.getProducts().toArray()));
    }

    @Test
    void ListOfProducts() {
        assertEquals("[Минеральная вода]", Arrays.toString(basket.getProducts().toArray()));
    }

    @Test
    void QuantityOfOneProduct() {
        assertEquals(expectedQ, basket.getProductQuantity(expectedP));
    }

    @Test
    void ChechOutTosString() {
        assertEquals(expectedOut, basket.toString());
    }
}