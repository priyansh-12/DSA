package dsasheet;

import java.util.*;

/*
 * 7.	In an array of integers, assume that exactly one value is repeated once and you are tasked to find it.
 *  You are expected to print the 2 element index where the duplication is occurring
 */


public class PrintDupIdx {

	static void duplicate(int[] ar)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<ar.length;i++)
		{
			if(!map.containsKey(ar[i]))
			{
				map.put(ar[i],1);
			}
			else
			{
				map.put(ar[i], map.get(ar[i])+1);
			}
		}
		int val = 0;
		for(int key : map.keySet())
		{
			if(map.get(key)>1)
				val = key;
		}
		ArrayList<Integer> li = new ArrayList<>();
		int j =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==val)
			{
                li.add(i);
			}
		}
		for(int i=0;i<li.size();i++)
		System.out.println(li.get(i));
	}
	
	public static void main(String[] args)
	{
	  int[] ar = {1, 3, 5, 7, 4, 3, 6 };
	  duplicate(ar);
	}
}
