package manzilin.homework.h_02.task1;

public class Task1 {


    public static void main(String[] args) {
        int numLitr = Integer.decode(args[0]);
        int Result = numLitr*Integer.decode(args[1]);
        System.out.println("Стоимость бензина равна "+Result+" рублей");

    }
}
