package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actualResult = calc.add(30, 40);
		int exceptedResult = 70;
		assertEquals(actualResult, exceptedResult);
	}

}
