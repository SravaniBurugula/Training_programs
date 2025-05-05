/**
 * 
 */
package com.ibm.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author SravaniBurugula
 *
 */
class CalculatorTest1 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		int expected =6;
		Calculator calculator = new Calculator();
		int actual =calculator.sum(4,2);
		assertEquals(expected, actual);
	}
	@Test
	void testDivide() {
		int expected=2;
		Calculator calculator = new Calculator();
		int actual = calculator.divide(4, 2);
		assertEquals(expected,actual);
	
		
	}
	@Test
	void testDivideZeroException() {
		System.out.println("Divide");
		Calculator calculator = new Calculator();
		ArithmeticException exception= assertThrows(ArithmeticException.class,
				()->calculator.divide(10,0), "Expected divide() to throw, but it didn't");
		assertEquals("/ by Zero", exception.getMessage());
		
		
	}
	@Test
	void testSlowMethodPerformance() {
		Calculator calculator = new Calculator();
		assertTimeout(Duration.ofMillis(100), ()-> calculator.getConnection());
	}
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10})
	void testIsEvenNumbers(int number) {
		assertTrue(Calculator.isEven(number));
	}
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10})
	void testIsOddNumbers(int number) {
		assertTrue(Calculator.isEven(number));
	}
	

	
	

}
