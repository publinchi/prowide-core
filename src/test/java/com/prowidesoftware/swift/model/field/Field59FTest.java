/*
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.prowidesoftware.swift.model.field;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test for Field59F and similar fields.
 *
 * @author www.prowidesoftware.com
 * @since 7.8.9
 */
public class Field59FTest extends AbstractFieldTest {

	@Override
	@Test
	public void testSerialization() {
		testSerializationImpl("59F",
				"/MT27SBMT59999999026977001\n" +
						"1/FOO LTD\n" +
						"2/99 FOO RD\n" +
						"2/GZIRA\n" +
						"3/MT/MALTA",
				"/CR79015202220005614288\n" +
						"1/Name 1\n" +
						"2/Address 1\n" +
						"2/Address 2\n" +
						"3/DZ/1000"
			);
	}
	
	@Test
	public void testGetValue() {
		final Field59F f = new Field59F(
				"/MT27SBMT59999999026977001\n" +
				"1/FOO LTD\n" +
				"2/99 FOO RD\n" +
				"2/GZIRA\n" +
				"3/MT/MALTA");
		assertEquals("MT27SBMT59999999026977001", f.getComponent1());
		assertEquals("1", f.getComponent2());
		assertEquals("FOO LTD", f.getComponent3());
		assertEquals("2", f.getComponent4());
		assertEquals("99 FOO RD", f.getComponent5());
		assertEquals("2", f.getComponent6());
		assertEquals("GZIRA", f.getComponent7());
		assertEquals("3", f.getComponent8());
		assertEquals("MT/MALTA", f.getComponent9());
	}
	
	@Test
	public void testGetValue2() {
		final Field59F f = new Field59F(
			"/CR79015202220005614288\n" +
			"1/Name 1\n" +
			"2/Address 1\n" +
			"2/Address 2\n" +
			"3/DZ/1000");
			assertEquals("CR79015202220005614288", f.getComponent1());
			assertEquals("1", f.getComponent2());
			assertEquals("Name 1", f.getComponent3());
			assertEquals("2", f.getComponent4());
			assertEquals("Address 1", f.getComponent5());
			assertEquals("2", f.getComponent6());
			assertEquals("Address 2", f.getComponent7());
			assertEquals("3", f.getComponent8());
			assertEquals("DZ/1000", f.getComponent9());
	}

}