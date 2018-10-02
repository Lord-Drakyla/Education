package manzilin.homework.h_19;

public class CashOffice {
    public static void main(String[] args) {
        CashBill cashBill = new CashBill();
        cashBill.run("C:\\Users\\Tairn\\Downloads\\products.txt");
        cashBill.toOut("C:\\Users\\Tairn\\Downloads\\out.txt");
    }
}
