package myhomeassignement;

public class GenerateFibonacciSeries {
	
	//A Fibonacci series is a sequence of numbers in which every third number equals the sum of the preceding two numbers.
	//The fibonacci series' first two integers are 0 and 1. 
	//The Fibonacci Series Looks like this : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
	
	static void fibonacci(int num)
	{
		int fn = 0, sn = 1;
		
		for(int i = 2; i < num; i++)
		{
			System.out.println(fn + " ");
			
			int tn = fn + sn;
			fn = sn;
			sn = tn;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		fibonacci(num);
	}

}
