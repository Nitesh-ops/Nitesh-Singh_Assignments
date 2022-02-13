package com.Question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxObJTest {
	static MinMaxObj oExpected;
	static MinMaxObj oActual;
	static MinMaxObj ex;

	@BeforeAll
	static void setup() {
		oExpected = new MinMaxObj();
		oActual = new MinMaxObj();
		ex = new MinMaxObj();
	}

	@Test
	@DisplayName("Test case 1")
	void minMax1() {
		oActual.setMin(3);
		oActual.setMax(56);
		ex = oExpected.FindMinMax(new int[] { 56, 34, 7, 3, 54, 3, 34, 34, 53 });
		assertEquals(oActual, ex);
	}

	@Test
	@DisplayName("Test case 2")
	void minMax2() {
		oActual.setMin(3);
		oActual.setMax(3);
		ex = oExpected.FindMinMax(new int[] { 3, 3 });
		assertEquals(oActual, ex);
	}
	
	@Test
	@DisplayName("Test case 2")
	void minMax3() {
		assertThrows(ArrayIndexOutOfBoundsException.class,()->oExpected.FindMinMax(new int[] {}));
	}

}
