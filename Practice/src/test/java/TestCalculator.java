package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import main.java.Calculator;

public class TestCalculator {
	
	@Test
	public static void checkValidException() {
		Calculator calculator = new Calculator();
		
		Exception e = assertThrows(IllegalArgumentException.class, () -> calculator.numSquare(-5));
		
		assertEquals("Number can't be negative", e.getMessage());
	}

//	public static void main(String[] args) {
//		checkValidException();
//	}
}
