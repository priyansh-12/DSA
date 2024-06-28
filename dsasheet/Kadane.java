package dsasheet;

public class Kadane {
   
	static int sum(int arr[])
	{
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for(int i=0;i<size;i++)
		{
			cur = cur + arr[i];
			
			if(max<cur)
				max = cur;
			
			if(cur<0)
				cur=0;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {2, -8, 3, -2, 4, -10};
		System.out.println(sum(arr));
	}
}
