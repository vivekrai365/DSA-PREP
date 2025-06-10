package dataStructure.ArraysConcept;

import java.util.Arrays;

public class ReverseOfElements {

	public static void main(String[] args) {
		/*
		 * i this code block a Array is reversed and stored in a a diffternt Array and
		 * then printed
		 */
		
		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int reverseArr[]=new int[arr.length];
		
		for (int i=0;i<arr.length-1;i++) 
		{
			reverseArr[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(reverseArr));
	}

}
