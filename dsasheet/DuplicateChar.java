package dsasheet;

/*
 * 13.	Write code to remove the duplicate characters from an input string and return the cleansed string
 * o	Input: cutcopypaste, Output: uoyse
 */


import java.util.*;

public class DuplicateChar {

	 static String removeDuplicate(String input)
	{
        HashSet<Character> hs = new HashSet<>();
          String ans = "";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<input.length();i++)
		{
			if(!map.containsKey(input.charAt(i)))
			{
				map.put(input.charAt(i), 1);
			}
			else
			{
				map.put(input.charAt(i),map.get(input.charAt(i))+1);
             hs.add(input.charAt(i));
			}	
		}
		for(int i=0;i<input.length();i++)
		{	 
			if(hs.contains(input.charAt(i)))
			{}
			else
			{
				ans = ans + input.charAt(i);
			}
		}
		return ans;
	}
	 public static void main(String[] args) {
		String ar = removeDuplicate("cutcopypaste");
		System.out.println(ar);
	}
	 
}
