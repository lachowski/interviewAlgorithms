package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.Steps;

public class StepsTest {
	
	@Test
	public void shouldGenerateOneLevelStep() {

		// when
		String[] result = Steps.steps(1);
		
		// then
		assertEquals(1, result.length);
		assertEquals(1, result[0].length());
		assertEquals("#", result[0]);
	}
	
	@Test
	public void shouldGenerateFourLevelSteps() {

		// when
		String[] result = Steps.steps(4);
		
		// then
		assertEquals(4, result.length);
		assertEquals(4, result[0].length());
		assertEquals("#   ", result[0]);
		assertEquals("####", result[3]);
	}
		
}
