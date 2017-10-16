package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ex05.Dictionary;

public class TestEx05 {

	@Test
	public void testDictionary() {
		Dictionary<Integer, Integer, String> dict = new Dictionary<Integer, Integer, String>();
		dict.put(1, 1, "Ba");
		dict.put(1, 1, "Hai");
		dict.put(1, 2, "Ba");
		dict.put(2, 3, "Nam");
		
		assertEquals("Hai", dict.get(1, 1));
		assertEquals("Ba", dict.get(1, 2));
		assertEquals("Nam", dict.get(2, 3));
		assertTrue(dict.containsKey(1, 1));
		assertTrue(dict.containsKey(1, 2));
		assertTrue(dict.containsKey(2, 3));
		assertFalse(dict.containsKey(2, 2));
		
	}

}
