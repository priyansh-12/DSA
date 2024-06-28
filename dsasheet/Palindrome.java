package dsasheet;

  /*
   5.	Write code to check a String is palindrome or not? Assume that a string will be send as argument and you are expected to return True or False 
   based on whether input string is palindrome (Palindrome are those String whose reverse is equal to original e.g. SaaS)
   */


public class Palindrome {

	static boolean checkPalindrome(String s)
	{
		int size = s.length();
		int start = 0;
		int end = s.length()-1;
		while(start<=end)
		{
		 if(s.charAt(start)!=s.charAt(end))
			 return false;
			
		 start++;
		 end--;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String s = "Amazon";
		System.out.println(checkPalindrome(s));
	}
}
