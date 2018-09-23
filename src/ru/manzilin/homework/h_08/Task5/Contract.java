package ru.manzilin.homework.h_08.Task5

public class Contract {

  private int number;
	private String[] listOfGoods;
	private LocalDate date;
	
  Contract(){
  
	}
  Contract(int number, String[] listOfGoods, LocalDate date){
  this.number = number;
  this.listOfGoods=listOfGoods;
  this.date=date;
	}
	
	
}
