package ru.manzilin.homework08.Task3;

public class Calculator {
	private static double oneNumber;
	private static double twoNumber;
	private static double Result;
	Calculator(){
	
	}
	
	Calculator(double oneNumber, double twoNumber){
	this.oneNumber = oneNumber;
	this.twoNumber = twoNumber;
	}
	public void setNumber (double oneNumber, double twoNumber){
	this.oneNumber = oneNumber;
	this.twoNumber = twoNumber;
	}
	public int getIntResult (){
	    
	return (int) Result;
	}
	public double getDoubleResult (){
	return Result;
	}
	public static void addition (){
	Result = oneNumber + twoNumber;
	}
	
	public static void subtraction (){
	Result = oneNumber - twoNumber;
	}
	
	public static void multiplication (){
	Result = oneNumber * twoNumber;
	}
	
	public static void division (){
	Result = oneNumber / twoNumber;
	}
	
    public static void percentOfNum (){
	Result = oneNumber * twoNumber / 100;
	}
	
	
	
    }
