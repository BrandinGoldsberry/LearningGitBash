package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.test.Calculator;

public class CalculatorTest {
	
	@Test
	public void AddTest() {
		int a = 10;
		int b = 11;
		
		int result = Calculator.Add(a, b);
		
		assertEquals(a + b, result);
	}
	
	@Test
	public void SubtractTest() {
		int a = 10;
		int b = 11;
		
		int result = Calculator.Subtract(a, b);
		
		assertEquals(a - b, result);
	}
	
	@Test
	public void MultiplyTest() {
		int a = 10;
		int b = 11;
		
		int result = Calculator.Multiply(a, b);
		
		assertEquals(a * b, result);
	}
	
	@Test
	public void DivideTest() {
		int a = 10;
		int b = 11;
		
		int result = Calculator.Divide(a, b);
		
		assertEquals(a / b, result);
	}
}
