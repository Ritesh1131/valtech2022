package com.valtech.training.simpleinterest;

import com.valtech.training.Arithmetic;
import com.valtech.training.ArithmeticImpl;

public class SimpleInterestImpl implements SimpleInterest{
	private Arithmetic arithmetic=new ArithmeticImpl();

	public int computeInterest(int prin, int time, int roi) {
	
		return arithmetic.div(arithmetic.mul(roi,arithmetic.mul(prin, time)),100);
	}

	

}
