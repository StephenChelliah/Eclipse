package javapractise;

public class HowToFindAnElementPresentInAnArray {

	public static void main(String[] args)
	{
		boolean found=false;
		int  array[]= {1,2,3,4,5};
		for(int localvar:array)
		{
			if(localvar==3)
				found=true;
				}
		
		if(found==true)
		{
			System.out.println("Number 3 is present in the array");
		}
		else
		{
			System.out.println("Number 3 is not present in the array");
		}
	}

}
