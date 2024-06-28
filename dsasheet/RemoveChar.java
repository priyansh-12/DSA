package dsasheet;

/*6.	Write a method which will remove any given character from a String. Assume that a string and a character will be send to your
API and you are expected to return the string after removing the character that is provided
*/
public class RemoveChar {

	static String remove(String s,char ch)
	{
		int size = s.length();
		char ch1 = Character.toLowerCase(ch);
		 ch = Character.toUpperCase(ch);
		 String ans = "";
		for(int i=0;i<size;i++)
		{
			 
			if((ch==s.charAt(i) &&  (ch>='A' || ch<='Z')) || (ch1==s.charAt(i) &&  (ch1>='a' || ch1<='z')) )
			{
				//continue;
			}
			else
			{
				ans = ans+s.charAt(i);
			}
		}
		return ans;
	}
	
	static String remove1(String s ,  char ch)
	{
		char ch1 = Character.toLowerCase(ch);
		 ch = Character.toUpperCase(ch);		
		String s1  = s.replace( Character.toString(ch1) , "");
		s1 =  s1.replace( Character.toString(ch) , "");
		return s1;
	}
	
	static String remove2(String s ,  char ch)
	{
		s = s.toLowerCase();
        s = s.replaceAll(Character.toString(ch), ""); 
        return s;
	}
	
	public static void main(String[] args)
	{
		String s = "Amazing";
		String s1 = "Greetings";
	   	System.out.println(remove1(s1,'e'));
	   //	System.out.println(remove1(s,'a'));
		System.out.println(remove2(s1,'e'));
	}
}
