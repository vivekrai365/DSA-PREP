package dataStructure.ArraysConcept;

public class SumOfElements {

	public static void main(String[] args) {
		/*
		 * In this program, we are calculating the sum of all elements
		 * in an integer array using a simple for-loop.
		 */
		
		int []arr= {1,2,3,4,5,6,7,8,9}; // Declaration and initialization of the array
		int sum=0;// Variable to hold the cumulative sum of array elements
		
		/*
		 * Iterate through each element of the array using a for loop.
		 * For every iteration, add the current element (arr[i]) to the sum.
		 * 
		 * For example:
		 * i = 0  => sum = 0 + arr[0] = 1
		 * i = 1  => sum = 1 + arr[1] = 3
		 * ...
		 */
		
		for(int i=0;i<arr.length;i++) 
		{
			 sum=sum+arr[i];
		}
		
		/*
		 * After the loop completes, the variable `sum` contains the total
		 * of all elements in the array. We then print the result.
		 */
		
		System.out.println("The sum of the elements of the Array(arr) is "+sum);
	}

}
