package myhomeassignement;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] num = {3,4,8,6,2,7,1}; // declaration and initialization of array values
		
		System.out.print("Numbers in the array before sorting: ");
		
		// this for loop is to print the unsorted integer array 
		for(int j=0; j<num.length; j++)
		{
			System.out.print(num[j]);
		}
		
		Arrays.sort(num); //sorting the integer array with sort method
		
		System.out.println("\n");
		
		System.out.print("Numbers in the array after sorting: ");
		
		//this for loop is to print the sorted integer array
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i]);
		}
		
		System.out.println("\n");
		
		
		// it is an other way used to print the values in the array
		/*System.out.print("Numbers in array: ");
		
		for(int i:num)
			System.out.print(i);*/
		
		// fetching the return value of the static method
		System.out.println("The missing integer value is: " + fetchMissingNumber(num));	
	}
	
	//a static function with integer datatype and return getting the array of integer as argument
	static Integer fetchMissingNumber(int[] num) 
	{	
	Integer missingNumber = null;
	for (int i = 0; i < num.length; i++) {
        int index = i + 1;
        if (num[i] != index) {
            missingNumber = index;
            break;
        }
        
	}
	return missingNumber;	
	}	
	
}
