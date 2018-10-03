package manzilin.homework.h_19;
//TODO попрообовать сделать более разносторонним.
public class CashOffice {
    public static void main(String[] args) {
        CashBill cashBill = new CashBill();
        cashBill.run("C:\\Users\\Tairn\\Downloads\\products.txt");
        cashBill.toOut("C:\\Users\\Tairn\\Downloads\\out.txt");
    }
}
