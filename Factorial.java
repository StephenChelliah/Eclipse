package javapractise;

public class Factorial {
	public static void main(String[] args)
	{
//factorial means we should multiply the number with its previous and that number with its previous until 1.
  //if we want factorial for 5 then 5*4*3*2*1=120.
		
		int Fact=1;
		int Factorialvalue=5;
		
		for(int i=1;i<=Factorialvalue;i++)
		{
			Fact=Fact*i;
		}
		
		System.out.println(Fact);
		
	}

}
