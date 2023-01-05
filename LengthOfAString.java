package javapractise;

public class LengthOfAString {
         public static void main(String[] args)
         {
        	
        	 String givenname="Stephen";
        	 
        	 //With length() Function
        	 //int Strlength=givenname.length();
        	 //System.out.println(Strlength);
        	 
        	 int length=0;
        	 char[] charname=givenname.toCharArray();
        	 for(char charvar:charname)
        	 {
        		 length++;
        	 }
        	 System.out.println(length);
        	 
         }
	
	
}
