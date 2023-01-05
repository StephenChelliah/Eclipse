package javapractise;

public class HowToReverseWordsInASentences {
	
	//Reversing an entire sentences
	//We are not Reversing Each Word
	
	
	public static void main(String[] args)
	{
		//Input :London is beautiful
		//Output:beautiful is London
		String given="London is beautiful";
		String reversed="";
		String[] temp=given.split(" ");
		//System.out.println(temp.length);
		System.out.print(temp[0]+" ");
		System.out.print(temp[1]+" ");
		System.out.print(temp[2]+" ");
		System.out.println();
		
		for(int i=2;i>=0;i--)
		{
			System.out.print(temp[i]+" ");
		}
			
	}

}
