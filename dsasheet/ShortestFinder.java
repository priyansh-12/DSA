package dsasheet;

public class ShortestFinder {

	public static int shortestFinder(String[] doc , String a , String b)
	{
		int Aidx = -1;
		int Bidx = -1;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<doc.length;i++)
		{
			if(doc[i]== a)
			{
				Aidx = i;
			}
			if(doc[i] == b)
			{
				Bidx = i;
			}
			         
             if(Aidx!= -1 && Bidx != -1)
            	 min = Math.min(Math.abs(Aidx-Bidx),min);
 
		}
		return min;
	}
	
	public static void main(String[] args)
	{
		String[] doc = {"x", "y", "z", "d", "1", "2", "3", "x", "2", "y"};
		String a = "x";
		String b = "1";
		System.out.print(shortestFinder(doc,a,b));
	}
}
