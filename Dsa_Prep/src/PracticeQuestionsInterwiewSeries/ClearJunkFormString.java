package PracticeQuestionsInterwiewSeries;

/**
 * This class demonstrates how to clean a string from junk/special characters
 * using regular expressions and the replaceAll() method of the String class.
 */

public class ClearJunkFormString {

	public static void main(String[] args) {
		
		// Input string containing junk characters like '@', '#', '%', '/', etc.
		String stringContainingJunk="@@@@vivek#### is%%%% a.... good//// boy";
		
		// A null string to test the null and blank string condition
		String nullString=null;
		
		/*
         * To clear junk from a string, we can use:
         * - Regular Expressions (Regex)
         * - String's built-in replaceAll() method
         * This method replaces all non-alphanumeric and non-space characters.
         */
		
		
		 /**
	     * This method removes all junk characters (non-alphanumeric and non-space)
	     * from the input string using a regular expression.
	     *
	     * @param inputString The string potentially containing junk characters
	     * @return A cleaned string without junk, or a message if input is null/blank
	     */
		
		String NoJunkString=junkremover(nullString);
		System.out.println(NoJunkString);
		
		
	}
	
	public static String junkremover(String InputString) 
	{
		String claerString="";
		
		  // Check if the input string is not null and not empty
		if (InputString!=null && InputString.length()>0) 
		{
			claerString=InputString.replaceAll("[^ A-Za-z0-9]", "");
		}
		else 
		{
			// Handle null or blank input
			claerString="this is blank or null string ";
		}
		return claerString;
	}

	
	// ignore my spellings :-)
}
