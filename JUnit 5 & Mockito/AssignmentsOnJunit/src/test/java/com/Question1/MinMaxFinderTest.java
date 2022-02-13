package com.Question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class MinMaxFinderTest {
	static MinMaxFinder minMaxFinder;

	@BeforeAll
	static void setup() {
		minMaxFinder = new MinMaxFinder();
	}

	@Test
	@DisplayName("Test case 1")
	void testMinMax1() {
		assertArrayEquals(new int[] { 3, 56 }, minMaxFinder.findMinMax(new int[] { 56, 34, 7, 3, 54, 3, 34, 34, 53 })); // This
																														// will
																														// work
	}

	@Test
	@DisplayName("Test case 2")
	void testMinMax2() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> minMaxFinder.findMinMax(new int[] {}));
	}
	
	@Test
	@DisplayName("Test case 3")
	void testMinMax3() {
		assertArrayEquals(new int[] { 3, 3 }, minMaxFinder.findMinMax(new int[] { 3,3 }));
	}
}
