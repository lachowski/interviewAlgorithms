package pl.mobigen.interviewAlgorithms.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.mobigen.interviewAlgorithms.basic.Capitalize;

public class CapitalizeTest {
	
	@Test
	public void shouldCapitalizeString() {
		// given
		String string = "I am the java master";
		String expected = "I Am The Java Master";
		
		// when
		String result = Capitalize.capitalize(string);		
		// then
		assertEquals(expected, result);
	}
	
}