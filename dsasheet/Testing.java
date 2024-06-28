package dsasheet;

import java.util.HashMap;

public class Testing {
 
	static void merge(String a , String b)
	{
		String[] ar1 = a.split("\\|");
		String[] ar2 = b.split("\\|"); 
		
		int[] arr1 = new int[ar1.length];  
		int[] arr2 = new int[ar2.length];
		
		for(int i = 0;i<ar1.length;i++)
		arr1[i] =  Integer.parseInt(ar1[i]);
		
		for(int i = 0;i<ar2.length;i++)
		arr2[i] =  Integer.parseInt(ar2[i]);
		
		int i=0, j=0, k=0;
		int[] a3 = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				a3[k] = arr1[i];
				i++;
				k++;
			}
			else
			{
				a3[k] = arr2[j];
				j++;
				k++;
			}
		}
 
			while(i<arr1.length)
			{
				a3[k] = arr1[i];
				i++;
				k++;
			}
			while(j<arr2.length)
			{
				a3[k] = arr2[j];
				j++;
				k++;
			}
			for(int m = 0 ; m < a3.length;m++)
			{
				System.out.println(a3[m]+" ");
			}
 	}
	
	public static void main(String[] args)
	{
		//merge("1|2|5","3|6");
		//System.out.println(palindrome("SaaS"));
		//System.out.println(Shorten("Amazing",'a'));
		int[] ar = {1, 5, 10, 2, 1, 3 , 10};
		duplicate(ar);
	}
	static boolean palindrome(String a)
	{
		int start = 0 , end = a.length()-1;
		while(start < end)
		{
			if(a.charAt(start) != a.charAt(end))
			{
				 return false;
			}
			start++;
			end--;
		}
		return true;
	}
	static String Shorten(String str , char a)
	{
		str = str.toLowerCase();
		String s = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=a)
			{
				s = s+str.charAt(i);
			}
		}
		return s;
	}
	static void duplicate(int[] ar)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<ar.length;i++)
		{
			if(!map.containsKey(ar[i]))
			{
				map.put( ar[i], 1);
			}
			else
			{
				map.put(ar[i],map.get(ar[i])+1);
			}
		}
		for(int key : map.keySet())
		{
			if(map.get(key)>1)
			{
				System.out.print(key+" ");
				for(int i=0;i<ar.length;i++)
				{
					if(key == ar[i])
						System.out.print(  " "+i);
				}
				System.out.println();
			}
		}
	}
}
