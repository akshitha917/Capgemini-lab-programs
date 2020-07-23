package com.capg.demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		int fact;
		FactorialFinder f=new FactorialFinder();
		try {
			fact=f.facto(n);
			System.out.println("Factorial = "+fact);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
