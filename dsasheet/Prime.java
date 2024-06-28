package dsasheet;

import java.util.*;

public class Prime {
	
	static boolean isPrime(int val)
	{
		for(int i=2;i<val;i++)
		{
			if(val%i==0)
				return false;
		}
		return true;
	}

	static void prime(int n)
	{
		if(n==0 || n==1 )
			System.out.println(" No available ");
		
		for(int i=1;i<n;i++)
		{
			if(isPrime(i))
				System.out.print(" "+i);
				
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 	   System.out.println(isPrime(n));
	}
}
