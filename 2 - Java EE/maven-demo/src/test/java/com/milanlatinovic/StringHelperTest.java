package com.milanlatinovic;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testStringWith2CharsIsReversed() {
		StringHelper helper = new StringHelper();	
		assertEquals("BA",helper.swapLast2Chars("AB"));
	}
	
	@Test
	public void testStringWith4CharsIsReversed() {
		StringHelper helper = new StringHelper();
		assertEquals("ABDC",helper.swapLast2Chars("ABCD"));
	}

}
