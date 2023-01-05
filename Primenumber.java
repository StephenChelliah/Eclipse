package javapractise;

public class Primenumber {

	public static void main(String[] args)
	{
		boolean prime=true;
		int number=17;
		for(int i=2;i<number;i++)
		{
	//We don't really need a break(without exiting the loop also the code will be executed.
			//Just the condition will be executed many times).
         //Because only when (number%i==0) the below statement will be executed.
			//It is again executed also then no problem.
	//That means the number is divisible by other numbers.
			
			if(number%i==0)
			{
	          prime=false;
		   // break;
		    }
			}
			if(prime==true)
			{
				System.out.println("It is a PrimeNumber");
			}
			else
			{
				System.out.println("It is not a PrimeNumber");
			}
	}
}
