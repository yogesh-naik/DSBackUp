package com.inherit;

import java.io.IOException;

public class calculation {

	private int total;
	   public void addition(int x, int y){
		   total=x+y;
	      System.out.println("The sum of the given numbers:"+total);
	   }
	   
	   public void Subtraction(int x,int y){
		   total=x-y;
	      System.out.println("The difference between the given numbers:"+total);
	   }
	   
	   public void timepass2(){
		   System.out.println("This calculation TP");
	   }
	   
	   public void display(int p) {
		   System.out.println("This is main class");
	   }
	   
}
