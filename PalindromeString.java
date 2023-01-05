package javapractise;

public class PalindromeString{
	
	public static void main(String[] args)
	{
		String value="RADAR";
		String reversedvalue="";
		
		//Palidrome means a word should sound the same even if we read it backwards.
		
		int strlen=value.length();
		for(int i=strlen-1;i>=0;i--)
		{
			reversedvalue=reversedvalue+value.charAt(i);	
		}
		
		if(reversedvalue.equals(value))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
		
	}

}
