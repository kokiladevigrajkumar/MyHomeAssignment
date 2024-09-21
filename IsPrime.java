package myhomeassignement;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A prime number is a natural number greater than 1 which is divisible by only 1 and itself. 
		//For example 2, 3, 5, 7, 11… are prime numbers 
		//because they can neither be divided nor is a result of the multiplication.
		
	Scanner putin = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int inputval = putin.nextInt();
	
	if(isPrime(inputval))
	{
		System.out.println(inputval + " is a Prime Number.");
	}
	else
	{
		System.out.println(inputval + " is not a Prime Number.");
	}
	
	}
	public static boolean isPrime(int inputval)
	{
		if(inputval<2)
		{
			return false;
		}
		
		for(int i = 2; i < inputval; i++)
		{
			if(inputval % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
