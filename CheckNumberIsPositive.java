package myhomeassignement;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The number is demonstrated as positive or negative by comparing the entered number with the Zero(0).
		//If the number entered by the user is greater than zero, then the number is positive,
		//else if the number is less than zero,
		//then the number is negative and else the number is zero.
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number: ");
		//int inputval = num.nextInt();//
		double inputval = num.nextDouble();
		if(inputval >= 0.0)
		{
			if(inputval == 0.0)
			{
				System.out.println("The given number is a Zero.");
			}
			else
			{
				System.out.println("The given number is a Positive Number.");
			}
		}
		else
		{
			System.out.println("The given number is a Negative Number.");
		}
	}

}
