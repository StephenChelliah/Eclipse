package javapractise;

public class SwapTwoNumbers {
	
	public static void SwapTwoNumber()
	{
		int x=5,y=10,z;
		System.out.println("Before Swapping x=:"+x);
		System.out.println("Before Swapping y=:"+y);
		
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping x=:"+x);
		System.out.println("After Swapping y=:"+y);
		
		
	}
	
	public static void SwappingwithoutThirdvariable()
	{	
	
	int x=5,y=10,z;
	System.out.println("Before Swapping x=:"+x);
	System.out.println("Before Swapping y=:"+y);
	
	
	x=x-y;
	y=y+x;
	x=y-x;
	System.out.println("After Swapping x=:"+x);
	System.out.println("After Swapping y=:"+y);

}
}