package com.labobedi.discount_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class discountCalculatorTest {

	@Test
	void Addtest() {
		CalculateDiscount junit = new CalculateDiscount();
		double result = junit.calculateEmployeeDiscount(700);
		assertEquals(210,result);
	}

}
