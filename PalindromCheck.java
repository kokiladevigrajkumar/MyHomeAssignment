package myhomeassignement;

import java.util.Scanner;

public class PalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A palindrome number is a number that is same after reverse.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to check if it is a Palindrome: ");
		int num = input.nextInt();
		
		int reverse = 0;
		
		
		for(int temp = num; temp != 0; temp /= 10)
		{
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
		}
		
		if(num == reverse)
		{
			System.out.println("The given number " + num + " is palindrome.");
		}
		else
		{
			System.out.println("The given number " + num + " is not a palindrom.");
		}
	}

}
