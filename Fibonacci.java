package javapractise;

public class Fibonacci {

	
	public static void main(String[] args)
	{
	//Fibonacci is nothing but literally taking two variables with 0 & 1 and adding them
	//to produce the value for the third variable.
	//Now Forbid the First variable's value and consider the second variable value as First
	//And third variable value as second to produce a new value which would be assigned to the third variable.
		
		int f=0;
		int s=1;
		int t=0;
		System.out.println("0");
		System.out.println("1");
		for(int i=3;i<=8;i++)
		{
			t=f+s;
			f=s;
			s=t;
			System.out.println(t);	
		}
		
		//System.out.println(t);
	}
}
