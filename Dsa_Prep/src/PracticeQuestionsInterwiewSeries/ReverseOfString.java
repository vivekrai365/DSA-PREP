package PracticeQuestionsInterwiewSeries;

public class ReverseOfString {
	/**
	 * This class demonstrates two different ways to reverse a string in Java:
	 * 1. Using a manual loop to reverse the string.
	 * 2. Using StringBuffer's built-in reverse() method.
	 */

	public static void main(String[] args) {

		// Output strings to store results from both methods
		String outputString="";
		String outputStringFromBuffer="";
		
		 // Input string to be reversed
		String inputString="vivek";
		
		if (inputString!=null) 
		{
			// Reverse using manual method
			outputString=reverseOfString(inputString);
			System.out.println(outputString+" form String method");
			
			// Reverse using StringBuffer's reverse() method
			outputStringFromBuffer=reverseUingBuffer(inputString);
			System.out.println(outputStringFromBuffer+" From String buffer");
		}
		else {
			System.out.println("input string is null");
		}
	}
	
	  /**
     * This method reverses a given string manually using a loop.
     *
     * @param wordToBeReversed The string to reverse
     * @return The reversed string
     */
	public static String reverseOfString(String wordToBeReversed) 
	{
		String reversedString="";
		int lengthOfWord=wordToBeReversed.length();
		
		 // Check if the string is not empty or null
		if(lengthOfWord!=0 && wordToBeReversed!=null) 
		{
			for(int i=lengthOfWord-1;i>=0;i--) 
			{
				reversedString=reversedString+wordToBeReversed.charAt(i);
			}
		}
		else 
		{
			reversedString="No word Found to be reversed !";
		}
		return reversedString;
	}
	
	/**
     * This method reverses a given string using StringBuffer's reverse method.
     *
     * @param wordTobereversed The string to reverse
     * @return The reversed string
     */
	public static String reverseUingBuffer(String wordTobereversed) 
	{
		String outputString	="";
		
		 // Check if the input string is not null and not empty
		if (wordTobereversed!=null && wordTobereversed.length()>0)
		{
			StringBuffer inputString= new StringBuffer(wordTobereversed);
			outputString =(inputString.reverse()).toString();
		}
		else 
		{
			System.out.println("Input string is either NULL or Blank !");
		}
		return outputString;
	}
}
