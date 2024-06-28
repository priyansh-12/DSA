package dsasheet;

/*
 * 10.	Write a program to find the frequency of occurrence of a word in an article. Here you will be provided with 2 inputs
 *  – an array of strings representing the doc and a word that needs to be searched for occurrences. 
 *  You need to return number of times that word occurred in document
 * 
 */


import java.util.*;

public class Occurence {

	static int findOccurence(String[] ar , String val)
	{
		HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<ar.length;i++)
        {
        	if(!map.containsKey(ar[i]))
        		map.put(ar[i],1);
        	
        	else
        		map.put(ar[i],map.get(ar[i])+1);
        }
        for(String key : map.keySet())
        {
        	if(key==val)
        		return map.get(key);
        }
        return 0;
	}
	
	public static void main(String[] args)
	{
		String[] doc = {"a1", "a2", "a1", "a2", "a3", "a1", "a3", "a4"};
		String val = "a3";
		System.out.println(findOccurence(doc,val));
	}
}
