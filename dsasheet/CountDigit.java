package dsasheet;

public class CountDigit {
	static int count(int a) {
		int count = 0;
		int sum = 0;
		while (a != 0) {
			int t  = a%10;
			sum = sum + t;
			a = a / 10;
			count++;
		}
		return sum;
	}
     static int get(int n , int val)
     {
    	 int count = 0;
    	 while(n!=0)
    	 {
    		 int t = n%10;
    		 if(t==val)
    			 count++;
    		 
    		 n= n/10;
    	 }
    	 return count;
     }
     static int power(int n , int p)
     {
    	 if(p==0)
    		 return 1;
    	 
    	 else
    		 return n*power(n,p-1);
     }
	
	public static void main(String[] args) {
        int a = 980;
      //  System.out.println(count(a));
       // System.out.println(get(7662,6));
        
        int n = 8;
        int p = 3;
        System.out.println(power(n,p));
	}
}
