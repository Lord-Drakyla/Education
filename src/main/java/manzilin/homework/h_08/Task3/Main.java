package manzilin.homework.h_08.Task3;

public class Main {
    public static void main(String[] args) {
        int localIntResult;
        System.out.println("Результат в целых числах");
        System.out.println((int) Calculator.addition(100, 50));
        System.out.println((int) Calculator.subtraction(100, 50));
        System.out.println((int) Calculator.division(100, 50));
        System.out.println((int) Calculator.multiplication(100, 50));
        System.out.println((int) Calculator.percentOfNum(100, 50));
        System.out.println("*************************");
        System.out.println("Результат в дробных числах");
        System.out.println(Calculator.addition(100, 50));
        System.out.println(Calculator.subtraction(100, 50));
        System.out.println(Calculator.division(100, 50));
        System.out.println(Calculator.multiplication(100, 50));
        System.out.println(Calculator.percentOfNum(100, 50));
        
    }
    private static void getResult() {


    }
	
	
}