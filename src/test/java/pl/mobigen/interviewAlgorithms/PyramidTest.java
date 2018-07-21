package pl.mobigen.interviewAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PyramidTest {
	
	@Test
	public void shouldGenerateOneLevelPyramid() {

		// when
		String[] result = Pyramid.pyramid(1);
		
		// then
		assertEquals(1, result.length);
		assertEquals(1, result[0].length());
		assertEquals("#", result[0]);
	}
	
	@Test
	public void shouldGenerateThreeLevelPyramid() {

		// when
		String[] result = Pyramid.pyramid(3);
		
		// then
		assertEquals(3, result.length);
		assertEquals(5, result[0].length());
		assertEquals("  #  ", result[0]);
		assertEquals("#####", result[2]);
	}
	
}
