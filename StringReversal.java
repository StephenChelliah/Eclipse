/*
package javapractise;

import java.util.ArrayList;
import java.util.List;

public class StringReversal {
	
	/*public static void reverseastring()
	{
		String strvar="London";
		
		//Inorder to reverse a string we need to use a StringBuffer class, within that class,
		//There are methods like append()(To add the string into the String Buffer) 
		//And reverse()(To reverse a string)
		
		StringBuffer strbufobj=new StringBuffer();
		strbufobj.append(strvar);
		
		//We cannot store the reversed output in a string variable.
		//String reversedstring=strbufobj.reverse();
		
		System.out.println(strbufobj.reverse());
		
	}

	*/
	
	/*
	public static void main(String[] args)
	{
		String strvar="paris";
		
//To convert an entire string into individual characters and store them into an array we need to use .toCharArray()
		char[] characterArray=strvar.toCharArray();
		//Variable has to be initialized
		String reversed="";
		for(int i=characterArray.length-1;i>=0;i--)
		{
		 reversed = reversed+characterArray[i];	
			
		}
		
		System.out.println(reversed);
		
	}
	*/
	
	//public static void usingcollection()
	
	/*public static void main(String[] args)
	{
	String strvar="Rome";
	
	//List itself is a kind of an array where you get to store many values
	//And can be accessed by its index location
	//So we have to use a char array to change the string into individual characters and add them inside the List.
	//If you want to insert or get many values in an List then use For loop. 
	
	char[]  characterArray=strvar.toCharArray();
	List<Character> list=new ArrayList<Character>();
	for(int i=characterArray.length-1;i>=0;i--)
	{
	 list.add(characterArray[i]);	
		
	}
	
	for(int i=0;i<=characterArray.length-1;i++)
	{
	System.out.println(list.get(i));
	}
		
		
		
		
	}
	
	
	
	
	
	
	
}

*/

package javapractise;

public class StringReversal {
	
	public static void main(String[] args)
	{
		int x=5,y=10,z;
		System.out.println("Before Swapping x=:"+x);
		System.out.println("Before Swapping y=:"+y);
		
		/*z=x;
		x=y;
		y=z;
		System.out.println("After Swapping x=:"+x);
		System.out.println("After Swapping y=:"+y);
		*/
		
		x=x-y;
		y=y+x;
		x=y-x;
		System.out.println("After Swapping x=:"+x);
		System.out.println("After Swapping y=:"+y);
		
	}
	
	
	

}














