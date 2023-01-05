package javapractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowToFindTheSmallestNumberInAnArray {
	
	Integer GivenArray[]= {45,2,9,7,4};
	
	public void findsmallnumber()
	{
		int smallestvalue=6;
		//int i;
		//System.out.println(GivenArray.length);
		
		for(int i=0;i<2;i++)
		{
			if(smallestvalue>GivenArray[i])
			{
				
				smallestvalue=GivenArray[i];
			}
		}
				System.out.println(smallestvalue);
			
			
		}
		
	
	
	public void usingArrays()
	{
		Arrays.sort(GivenArray);
		System.out.println(GivenArray[0]);
	}
		
	public void usingcollections()
	{
		List<Integer> listref=Arrays.asList(GivenArray);
		Collections.sort(listref);
		System.out.println(listref.get(0));
		
	}
	
	
	public static void main(String[] args)
	{
		HowToFindTheSmallestNumberInAnArray obj=new HowToFindTheSmallestNumberInAnArray();
		obj.findsmallnumber();
	}
	
	}
		


