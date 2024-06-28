package dsasheet;

import java.util.*;
//import java.util.HashMap;

public class Snippet {

	public static void main(String[] args) {
		/*String[] doc = { "x", "y", "z", "d", "1", "2", "3", "x", "2", "y" };
		String a = "x";
		String b = "1";
		//System.out.print();
		//shortestFinder(doc, a, b);
		int[] ar = {9, 11, 5, 7, 16, 1, 4, 2 };
		profit(ar); 
		String[] doc = {"a1", "a2", "a1", "a2", "a3", "a1", "a3", "a4"};
		System.out.println(occur(doc , "a3"));*/
		//System.out.println(removeDup("Greetings"));
		//int[] ar = {1, -3, 2, 1, -1 };
		 // System.out.println(LargestSum(ar));
		//System.out.println(equalSum(ar,50));
		System.out.println(near(70,125));
	}
	static int near(int a , int b)
	{
       int diff1 = 100-a;
       int diff2 = 100-b;
       
       if(diff1<diff2)
       {
    	   return a;
       }
       else
    	   return b;
	}
	static int equalSum(int[] ar,int num)
	{
		Arrays.sort(ar);
		int count = 0 ;
		int start = 0 , end = ar.length-1;
		while(start<end)
		{
			int sum = ar[start]+ar[end];
			if(sum==num)
			{
				count++;
				start++;
				end--;
			}
			else if(sum<num)
			{
				start++;
			}
			else
				end--;
		}
		return count;
	}
	static int LargestSum(int[] ar)
	{
		int max = Integer.MIN_VALUE;
		int cur=0;
		for(int a : ar)
		{
			cur = cur + a;
			if(cur>max)
				max = cur;
			
			if(cur<0)
				cur=0;
		}
		return max;
	}
	static String removeDup(String str)
	{
		//str = str.toLowerCase();
		HashMap<Character,Integer> map = new  HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		for(Character ch : map.keySet())
		{
			if(map.get(ch)>1)
			{
				str = str.replace(ch, '@');
			}
		}
		str = str.replaceAll("@","");
		return str;
	}
	static int occur(String[] ar , String  val) 
	{
		HashMap<String , Integer> map = new HashMap();
		for(int i =0 ; i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				map.put(ar[i], map.get(ar[i])+1);
			}
			else
			{
				map.put(ar[i],1);
			}
		}
		
		int value = map.get(val) ;
		return value;
	}
	static void profit(int[] stocks)
	{
		int buy = stocks[0];
		int min = Integer.MIN_VALUE;
		for(int stock :stocks)
		{
			 if(stock< buy)
			 {
				 buy = stock;
			 }
			 else
			 {
				 min = Math.max(Math.abs(buy-stock), min);
			 }
			
		}
		System.out.println(" The Profit is " + min);
	}

	 	 
}
