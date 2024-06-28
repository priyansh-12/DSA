package dsasheet;

public class Nearest {

	static int findNearest(int a ,int b)
	{
    //     /*if(Math.abs(100-a)<Math.abs(100-b))
        //	 return a;
          if((100-a)<(100-b))
		return a;
          
         else
        	 return b;
	}
	
	public static void main(String[] args)
	{
	  System.out.println(findNearest(70,-5));	
	}
}
