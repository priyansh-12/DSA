package dsasheet;

/*
  4.	You are given 2 separate pipe separated strings (let’s call them A & B) and each one contains numeric values separated by pipe | character. 
  Write a method to read all the values in A & B and merge them and then finally present the sorted integer array as output. 
  You may use StringTokenizer class or split API within String class 

Public int[] stringMergeToIntergerArray (String a, String b)
	Example data
		o	Input: (‘1|2|5’, ‘3|6’]), Output: [1, 2, 3, 5, 6]
     	o	Input: (‘10|15|20’, ‘1|50’), Output: [1, 10, 15, 20, 50]

 */


import java.util.Arrays;
import java.util.StringTokenizer;

public class MergetointArray {

	public static int[] stringMergeToIntergerArray(String a, String b)
	{
		  String[] s1 = a.split("_");
		  String[] s2 = b.split("_");
		  int size = s1.length+s2.length;
		  int[] m = new int[size];
		  		  /*for(int i=0;i<s1.length;i++)
		  {
			  m[i] = Integer.parseInt(s1[i]);
		  }
		  for(int i=0;i<s2.length;i++)
		  {
			  m[s1.length+i] = Integer.parseInt(s2[i]);
		  }
		 	 
		  Arrays.sort(m);	*/  

		  
		  int[] ar1 = new int[s1.length];
		  int[] ar2 = new int[s2.length];
		  
		  for(int i=0;i<s1.length;i++)
		  {
			 ar1[i] = Integer.parseInt(s1[i]);
		  }
		  for(int i=0;i<s2.length;i++)
		  {
				 ar2[i] = Integer.parseInt(s2[i]);			  
		  }
          Arrays.sort(ar1);
          Arrays.sort(ar2);

          int k = 0;
		  int i =0 ; 
		  int j=0;
		  while(i<s1.length && j<s2.length)
		  {
			  if(ar1[i]<ar2[j])
			  {
				  m[k] = ar1[i];
				  i++;
				  k++;
			  }
			  else
			  {
				  m[k] = ar2[j];
				  j++;
				  k++;
			  }
		  }
		  while(i<s1.length)
		  {
			  m[k] = ar1[i];
			  i++;
			  k++;
		  }
		  while(j<s2.length)
		  {
			  m[k] = ar2[j];
			  j++;
			  k++;
		  }
		  
		  
		  return m;
	}
	public static void main(String[] args)
	{
		String a ="1_2_5";
		String b="3_6";
		int[] ss =  stringMergeToIntergerArray(a,b);
	   for(int i=0;i<ss.length;i++)
		   System.out.print(ss[i]+" ");
	}
}
