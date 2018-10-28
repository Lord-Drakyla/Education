package manzilin.homework.h_23;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShopBasketTest {
    private final String expectedP = "Минеральная вода";
    private final String[] expectedArray = new String[]{expectedP};
    private final int expectedQ = 6;
    private final String expectedOut = "\n   product: Минеральная вода\t   quantity: 6";
    private final Basket basket = new ShopBasket();

    @BeforeEach
    void init() {
        basket.addProduct(expectedP, expectedQ);
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
        basket.removeProduct(expectedP);
        assertEquals("[]", Arrays.toString(basket.getProducts().toArray()));
    }

    @Test
    void IsNotProductRemoved() {
        assertNotEquals("[]", Arrays.toString(basket.getProducts().toArray()));
    }

    @Test
    void newQuantity() {
        int newQuantity = 8;
        basket.updateProductQuantity(expectedP, newQuantity);
        assertEquals(newQuantity, basket.getProductQuantity(expectedP));
    }

    @Test
    void EmptyBasket() {
        basket.clear();
        assertEquals("[]", Arrays.toString(basket.getProducts().toArray()));
    }

    @Test
    void isNotEmptyBasket() {
        assertNotEquals("[]", Arrays.toString(basket.getProducts().toArray()));
    }

    /**
     * TODO: Проверитть как-нибудь
     * <p>
     * assertArrayEquals(UNexpectedArray, basket.getProducts().toArray());
     */

    @Test
    void ListOfProducts() {
        assertArrayEquals(expectedArray, basket.getProducts().toArray());
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