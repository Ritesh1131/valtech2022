package com.valtech.training.valtech.junit5;

import com.valtech.training.valtech.junit5.Arithmetic;

public class ArithmeticImpl implements Arithmetic {

	public int add(int a, int b) {
		
		return a+b;
	}

	public int sub(int a, int b) {
		return a-b;
	}

	public int mul(int a, int b) {
		return a*b;
	}

	public int div(int a, int b) {
		return a/b;
	}
	

}