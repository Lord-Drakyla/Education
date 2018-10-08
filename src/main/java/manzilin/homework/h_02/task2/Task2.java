package manzilin.homework.h_02.task2;

public class Task2 {


    public static void main(String[] args) {
        int dirtyCash = Integer.decode(args[0]);
        float Result =dirtyCash-dirtyCash*Float.parseFloat(args[1]);
        System.out.println("Чистая зарплата равна "+Result+" рублей");
    }
}
