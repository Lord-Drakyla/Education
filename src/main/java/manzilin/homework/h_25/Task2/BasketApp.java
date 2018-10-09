package manzilin.homework.h_25.Task2;

public class BasketApp {
    private static String[] testDataProduct= new String[]{
            "Происхождение видов Чарльза Дарвина",
            "Ложки",
            null,
            "Ножи",
            "Яблоки",
            "Минеральная вода"
    };
    private static int[] testDataQunt= new int[]{1,2,3,4,5,6};

    public static void main(String[] args) {
        ShopBasket basketOfAmason = new ShopBasket();
        for (int i = 0; i <testDataQunt.length ; i++) {
            basketOfAmason.addProduct(testDataProduct[i],testDataQunt[i]);
        }
        for (int i = 0; i <testDataQunt.length ; i++) {
            basketOfAmason.addProduct(testDataProduct[i],testDataQunt[i]);
        }

        for (String product :
                basketOfAmason.getProducts()) {
            System.out.println(product);
        }
        System.out.println(basketOfAmason);
        System.out.println(basketOfAmason.getProductQuantity("Ножи"));
        System.out.println(basketOfAmason.getProductQuantity(null));
        basketOfAmason.updateProductQuantity(null, 5);
        System.out.println(basketOfAmason.getProductQuantity(null));
        basketOfAmason.clear();
        System.out.println("****The End****");
        System.out.println(basketOfAmason);

    }
}
