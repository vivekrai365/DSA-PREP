package dataStructure.ArraysConcept;

public class Student {
	
	 

	String name;
	 int studentId;
	 String address;
	
	public Student(String name,int studentId,String address) 
	{
		this.name=name;
		this.studentId=studentId;
		this.address=address;
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", address=" + address + "]";
	}

	/*
	 * This is a simple Student class that contains three fields:
	 * - name       : the name of the student
	 * - studentId  : a unique ID representing the student
	 * - address    : the residential address of the student
	 * 
	 * The class provides a **parameterized constructor**:
	 * - This allows us to directly initialize the fields when creating an object
	 *   from another class (like when storing Student objects in an array).
	 * 
	 * For example:
	 *    Student s = new Student("Vivek", 1, "Mumbai");
	 * - This statement creates a new Student object and initializes its fields.
	 * 
	 * The class also overrides the **toString()** method:
	 * - By default, printing an object displays its memory address.
	 * - Overriding toString() provides a clean, readable format to show the
	 *   values of the object when printed.
	 * 
	 * This is especially useful when:
	 * - Student objects are stored inside an array
	 * - We want to print the array using Arrays.toString()
	 * - toString() gets called automatically for each object in the array
	 * 
	 * This class serves as a model to represent individual student records
	 * and is used in object-oriented arrays or collections.
	 */
	
}
 