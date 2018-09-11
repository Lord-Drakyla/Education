package ru.manzilin.homework08.Task3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(100,50);
        calculator.addition();
        getResult(calculator);
		calculator.subtraction();
		getResult(calculator);
		calculator.division();
		getResult(calculator);
		calculator.multiplication();
		getResult(calculator);
		calculator.percentOfNum();
		getResult(calculator);
    }
    public static void getResult(Calculator calculator) {
        System.out.println("Результат в целых числах");
        System.out.println(calculator.getIntResult());
        System.out.println("Результат в дробных числах");
		System.out.println(calculator.getDoubleResult());
    }
	
	
}