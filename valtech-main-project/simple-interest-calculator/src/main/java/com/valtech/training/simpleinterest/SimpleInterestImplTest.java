package com.valtech.training.simpleinterest;

import org.junit.Test;

import junit.framework.TestCase;

public class SimpleInterestImplTest extends TestCase {
		@Test
		public void test() {
			SimpleInterest si = new SimpleInterestImpl();
			assertEquals(12,si.computeInterest(600, 2, 1));
		}
}
