package manzilin.homework.h_08.Task2;

public class Main {

    public static void main(String[] args) {
        System.out.println(Final.PI);
        System.out.println(Final.PLUSPI(15));
        Final finalClass = new Final();
        System.out.println(finalClass.PI);
        System.out.println(finalClass.PLUSPI(15));

    }
    private static class twoFinal extends Final{
        /**
         * не получается переопределить метод исходного класса
          * @param x - просто число
         * @return сложение с полем PI
         *
         * public static final double PLUSPI(double x){
         *             return x+PI+1;
         *         }
         */


    }
}
