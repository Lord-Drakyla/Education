package manzilin.homework.h_23;

//todo переделать в тест
public class BasketApp {
    public static void main(String[] args) {
        ShopBasket basketOfAmason = new ShopBasket();
        basketOfAmason.addProduct("Происхождение видов Чарльза Дарвина", 1);
        basketOfAmason.addProduct("Ложки", 2);
        basketOfAmason.addProduct("Вилки", 3);
        basketOfAmason.addProduct("Ножи", 4);
        basketOfAmason.addProduct("Происхождение видов Чарльза Дарвина", 1);
        basketOfAmason.addProduct("Ложки", 2);
        basketOfAmason.addProduct("Вилки", 3);
        basketOfAmason.addProduct("Ножи", 4);
        basketOfAmason.addProduct("Происхождение видов Чарльза Дарвина", 1);
        basketOfAmason.addProduct("Ложки", 2);
        basketOfAmason.addProduct("Вилки", 3);
        basketOfAmason.addProduct("Ножи", 4);
        basketOfAmason.addProduct("Происхождение видов Чарльза Дарвина", 1);
        basketOfAmason.addProduct("Ложки", 2);
        basketOfAmason.addProduct("Вилки", 3);
        basketOfAmason.addProduct("Ножи", 4);

        for (String product :
                basketOfAmason.getProducts()) {
            System.out.println(product);
        }
        System.out.println(basketOfAmason.toString());
        System.out.println(basketOfAmason.getProductQuantity("Ножи"));
        basketOfAmason.updateProductQuantity("Ножи", 5);
        System.out.println(basketOfAmason.getProductQuantity("Ножи"));

    }
}
