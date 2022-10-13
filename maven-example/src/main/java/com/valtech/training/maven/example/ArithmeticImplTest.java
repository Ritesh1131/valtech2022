package com.valtech.training.maven.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;




public class ArithmeticImplTest {

	@Test
	public void testadd() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(5, a.add(2, 3));
		assertEquals(5, a.add(3, 2));
		assertEquals(3, a.add(0, 3));
		assertEquals(3, a.add(3, 0));
	}
	@Test
	public void testSub() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(2, a.sub(5, 3));
		assertEquals(1, a.sub(3, 2));
		assertEquals(-3, a.sub(0, 3));
		assertEquals(3, a.sub(3, 0));
		assertEquals(-9, a.sub(-2, 7));
		assertEquals(9, a.sub(7, -2));
		assertEquals(0, a.sub(0,0));
	}
	@Test
	public void testMul() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(6, a.mul(2, 3));
		assertEquals(6, a.mul(3, 2));
		assertEquals(0, a.mul(0, 3));
		assertEquals(0, a.mul(3, 0));
		assertEquals(-14, a.mul(-2, 7));
		assertEquals(-14, a.mul(7, -2));
		assertEquals(0, a.mul(0,0));
	}
	@Test
	public void testDiv() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(9, a.div(27, 3));
		assertEquals(1, a.div(3, 3));
		assertEquals(0, a.div(0, 3));
		assertEquals(2, a.div(12, 6));
		assertEquals(-11, a.div(-22, 2));
		assertEquals(-7, a.div(14, -2));
		assertEquals(10, a.div(20,2));
		try {
			a.div(3, 0);
			fail("ArithmeticException was expected with '/ by zero'");
		}catch(ArithmeticException ae) {
		
		}
	}

}
