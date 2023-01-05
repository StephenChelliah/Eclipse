package javapractise;

public class Extractnumbersfromastringandaddthem {
	
	public static void main(String[] args)
	{
		String strvar="Extract numbers75  from a string45 and add them";
		int Sum=0,numericalvalue=0;
		
			for(int i=0;i<strvar.length();i++)
			{
			//Character class and Char datatype are both different.
				//Character class has many methods and uses char datatype but whereas char is only a datatype so a variable can be created .
				//But that variable can utilize any methods.
				Character charact=strvar.charAt(i);
				  boolean output=charact.isDigit(charact);
				  //System.out.println(output);
				  if(output)
				  {
					  Sum++;
			}
			}
			System.out.println(Sum);
			}
}
