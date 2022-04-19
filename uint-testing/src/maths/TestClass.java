package maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void testSub() {
		Mathematics mathematic = new Mathematics();
		int result = mathematic.sub(20,10);
		assertEquals(10,result);
	}
	@Test
	public void testadd() {
		Mathematics mathematic = new Mathematics();
		int result = mathematic.add(20,10);
		assertEquals(30,result);
	}


}
