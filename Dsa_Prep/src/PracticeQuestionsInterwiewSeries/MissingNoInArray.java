package PracticeQuestionsInterwiewSeries;

import java.util.Arrays;

public class MissingNoInArray {

	public static void main(String[] args) {
		int numberSeq[]= {2,3,4,5,7,8,9,10};
		int sum=0;
		
		for(int i=0;i<numberSeq.length;i++) 
		{
			sum=sum+numberSeq[i];
		}
		//System.out.println(sum);
		
		int sum2=0;
		
		for(int i=numberSeq[0];i<=numberSeq[numberSeq.length-1];i++) 
		{
			sum2=sum2+i;
		}
		//System.out.println(sum2);
		
		int missingNo=sum2-sum;
		
		System.out.println("the missing number in the array :"
		+Arrays.toString(numberSeq)+"  is :"+missingNo);
	}

}
