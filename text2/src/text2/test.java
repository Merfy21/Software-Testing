package text2;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	private static text2 t = new text2();
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println(t.equ(4, 4, 4)); 
		
		assertEquals(2,t.equ(4, 4, 4));
		System.out.println("等边三角形"); 
		
		assertEquals(-1,t.equ(0, 3, 4));
		System.out.println("不成立三角形"); 
		
		assertEquals(1,t.equ(4, 3, 3));
		System.out.println("等腰三角形"); 
		
		assertEquals(-1,t.equ(1, 3, 4));
		System.out.println("不成立三角形"); 
		
		assertEquals(0,t.equ(3, 4, 5));
		System.out.println("斜三角形"); 
		
		
		
	}

}
