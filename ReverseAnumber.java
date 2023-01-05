package javapractise;

import java.util.Scanner;

public class ReverseAnumber {
	/*
	
	public static void main(String[] args)
	{
		static int value=1234;
		//int value;
		static int reversedvalue=0;
		static int modoutput=0;
		static int reversednumber[];
		
		
		//System.out.println("Enter your number:");
		//Scanner scanobj = new Scanner(System.in);
	//value=scanobj.nextInt();
	
	/*while(value!=0)
	{
		reversedvalue=reversedvalue*10;
	    modoutput=value%10;
		reversedvalue=reversedvalue+modoutput;	
		value=value/10;
	}
	
	System.out.println(reversedvalue);
	
	*/
	

public static void main(String[] args)
{
int i=0;
 int value=1234;
//int value;
 int reversedvalue=0;
 int modoutput=0;
 int reversednumber[] =new int[4];

	while(value!=0)
	{
		
		modoutput=value%10;
		reversednumber[i] =reversedvalue+modoutput;	
		//System.out.println("i="+ i );
		System.out.print(reversednumber[i]);
		value=value/10;
	i++;
	}
//System.out.println(reversednumber);
}

}