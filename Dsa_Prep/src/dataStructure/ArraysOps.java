package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOps {

	public static void main(String[] args) {
		// arrays are the homogeneous collection of data ;
		
		int arr[]= {1,2,43,55,77,98};
		System.out.println(arr);
		
		/* to Print elements inside a array we can traverse it or use 
		built in functions present in Arrays class  */
		
		System.out.println(Arrays.toString(arr));
		
		// by traversal using for 
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
		// using enhanced for loop or for Each loop 
		
		System.out.println("this is using for each loop ");
		for(int a:arr) 
		{
			System.out.print(a);
		}
		
		
		/*
		 * to sort arrays in increasing order ether we can perform algos or we can use
		 * built in functions in Arrays class in util Package ;
		 */
		
		Arrays.sort(arr);
		System.out.println("");
		System.out.println("sorted array is : "+Arrays.toString(arr));
		
		// hera sort method uses quick sort internaly Tc:Bo(log n) 
		
		
		// to take input in an array and print it in reverse 
		
		System.out.println("enter the elements of an array");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int[] array= new int[n];
		
		for (int i=0;i<array.length;i++) 
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(array) +"  original Array");
		
		// now to print the original array in reverse order 
		System.out.println("this is reverse order");
		for(int i=array.length-1;i>=0;i--) 
		{
			System.out.print(array[i]);
		}
	}

}
