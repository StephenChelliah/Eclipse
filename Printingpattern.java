package javapractise;

public class Printingpattern {
	static int i,j,k;
	
	
	
	
	public static void PrintFiveStars()
	{
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	public  void PrintincrementStars()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void PrintdecrementStars()
	{
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void PrintStarsWithSpaces()
	{
		for(i=1;i<=5;i++)
		{
			
			for(j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}	
	}
	
	
	public static void PrintStarsWithSpacesafterstars()
	{
		for(i=5;i>=1;i--)
		{
			
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			
			for(j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			
			
			System.out.println();
		}	
	}
	
	
	public static void main(String[] args)
	{
		Printingpattern prtobj=new Printingpattern();
		prtobj.PrintincrementStars();
		PrintStarsWithSpaces();
		PrintStarsWithSpacesafterstars();
		PrintFiveStars();
		
	}
	
	
}
