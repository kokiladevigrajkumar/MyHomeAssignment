package myhomeassignement;

public class FindIntersection {

	public static void main(String[] args) {
		
		//declaration and initialization of 2 arrays of same data type
		int[] a1 = {3,2,11,4,6,7};
		
		int[] a2 = {1,2,8,4,9,7};
		
		System.out.print("The values present in the Array1 are: ");
		
		//array1 for loop
		for(int i:a1)
			
			System.out.print(i);
		
		/*for(int i=0; i<a1.length; i++)
		{
			System.out.print(a1[i]);
		}*/
		
		System.out.println("\n");
		
		System.out.print("The values present in the Array2 are: ");
		
		//array2 for loop
		for(int j:a2)
			
			System.out.print(j);
		
		/*for(int j=0; j<a2.length; j++)
		{
			System.out.print(a2[j]);
		}*/
		
		System.out.println("\n");
		
		System.out.print("Intersection of the two arrays: ");
	     
		//for loop to find the similar integers
	      for(int i = 0; i<a1.length; i++ ) 
	      {
	         for(int j = 0; j<a2.length; j++) 
	         {
	            if(a1[i]==a2[j]) 
	            {
	               System.out.print(a2[j]);
	            }
	         }
	      }
	}
}
