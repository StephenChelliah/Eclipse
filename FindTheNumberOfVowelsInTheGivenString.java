package javapractise;

public class FindTheNumberOfVowelsInTheGivenString {
	
	public static void main(String[] args)
	{
		int vowels = 0;
		String strvar="French Open Tennis Tournament";
		String strlow=strvar.toLowerCase();
		//System.out.println(strvar);
		//FindTheNumberOfVowelsInTheGivenString srobj=new FindTheNumberOfVowelsInTheGivenString();
		
		//srobj.Replacewithspecialcharacter(strvar);
		
	
		for(int i=0;i<strvar.length();i++)
		{
			if((strlow.charAt(i)=='a')||(strlow.charAt(i)=='e')||(strlow.charAt(i)=='i')||(strlow.charAt(i)=='o')||(strlow.charAt(i)=='u'))
			{
				vowels++;
			}
		}
		System.out.println(vowels);
	
	}
	
	
	public void Replacewithspecialcharacter(String strvar)
	{
		
		String output=strvar.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(output);
		
		
	}
	


}