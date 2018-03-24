package text2;

import org.junit.Before;

public class text2 {
	public text2()
	{
		
	}
    @Before
	public int equ(int a,int b,int c) {
    	 System.out.println("@Before"); 
    	 boolean b1 = a + b > c;
    	 boolean b2 = a + c > b;
    	 boolean b3 = b + c > a;
    	 if(b1 && b2 && b3 && a > 0 && b > 0 && c > 0  )
    	 {
    		 if(a == b && b == c )
    		 {
    			 return 2; //等边
    		 }
    		 else if( a == b || b==c || a==c)
    		 {
    			 return 1; //等腰
    		 }
    		 else
    		 {
    			 return 0; //正常
    		 }
    	 }
    	 else
    	 {
    		 return -1; //非三角形
    	 }
    }
	/*public static void main (String [] args)
	{
		text2 t = new text2();
		System.out.print(t.equ(3,4,5));
	}*/
}
