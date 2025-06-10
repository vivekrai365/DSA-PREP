package dataStructure.ArraysConcept;

import java.util.Arrays;

public class Object_Inside_Array {

	public static void main(String[] args) {
	
	Student objArray[]=new Student[3];
	
	objArray[0]= new Student ("Vivek Kumar",01,"test1");
	objArray[1]= new Student ("Gautam",02,"test2");
	objArray[2]= new Student ("vishal",03,"test3");
	
	System.out.println(Arrays.toString(objArray));
	

	}

	/*
	 * In this class, we are creating an array of Student objects.
	 * 
	 * When we declare: Student objArray[] = new Student[3];
	 * - It creates an array that can hold references to 3 Student objects,
	 *   but does not initialize the objects themselves.
	 * 
	 * We then create and assign individual Student objects to each index:
	 * - objArray[0] = new Student(...);
	 * - objArray[1] = new Student(...);
	 * - objArray[2] = new Student(...);
	 * 
	 * Each of these objects is stored in the heap, and the array holds
	 * the references (addresses) to those objects.
	 * 
	 * To print the actual values of each Student object (rather than their
	 * memory addresses), we override the toString() method in the Student class.
	 * 
	 * When we use Arrays.toString(objArray), it internally calls the toString()
	 * method of each object in the array, allowing us to view the content
	 * of the Student objects in a human-readable format.
	 */
	
}
