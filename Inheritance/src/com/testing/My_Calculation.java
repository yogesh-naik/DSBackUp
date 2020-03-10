package com.testing;

import java.io.IOException;

import com.inherit.calculation;

public class My_Calculation extends calculation {

	public void addition(double d, double e){
			double total=d+e;
	      System.out.println("The sum of the given numbers:"+total);
	      	      
	   }

	public void timepass(){
		   System.out.println("This from second class");
	   }
	
	public void display(String S) throws IOException{
		   System.out.println(" DISPLAY");
	   }
	
//	public static void main(String[] args){
//		My_Calculation fd = new My_Calculation();
//		fd.hero("fdf");
//	}
}
