package dataStructure.ArraysConcept;

import java.util.Arrays;

public class ReverseOfElements {

	public static void main(String[] args) {
		/*
		 * In this code, we are reversing the elements of an integer array.
		 * 
		 * The original array `arr` contains elements from 0 to 9.
		 * We create a new array `reverseArr` of the same length to store
		 * the reversed elements of `arr`.
		 */
		
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int reverseArr[]=new int[arr.length];
		
		/*
		 * This loop runs from 0 to arr.length - 1.
		 * For each index i, we assign the value from the end of `arr`
		 * to the corresponding index in `reverseArr`.
		 * 
		 * For example:
		 * i = 0  => reverseArr[0] = arr[9]
		 * i = 1  => reverseArr[1] = arr[8]
		 * ...
		 */
		
		for (int i=0;i<arr.length-1;i++) 
		{
			reverseArr[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(reverseArr));
		
		/*
		 * Arrays.toString() is used to print the array in a readable format.
		 * It calls toString() internally to display each element in order.
		 */
	}

}
