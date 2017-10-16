package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ex05.Dictionary;

public class TestEx05 {
	
	Dictionary<Integer, Integer, String> dict; 
	
	@Before
	public void setUp() {
		dict= new Dictionary<Integer, Integer, String>();
		dict.put(1, 1, "Ba");
		dict.put(1, 1, "Hai");
		dict.put(1, 2, "Ba");
		dict.put(2, 3, "Nam");
	}

	@Test
	public void testPut() {
		assertNull(dict.put(3, 3, "Sau"));
		assertEquals("Ba", dict.put(1, 2, "Bon"));
		assertEquals("Bon", dict.put(1, 2, "Nam"));
	}
	
	@Test
	public void testGet() {
		assertEquals("Hai", dict.get(1, 1));
		assertEquals("Ba", dict.get(1, 2));
		assertEquals("Nam", dict.get(2, 3));

	}
	
	@Test
	public void testContainsKey() {
		assertTrue(dict.containsKey(1, 1));
		assertTrue(dict.containsKey(1, 2));
		assertTrue(dict.containsKey(2, 3));
		assertFalse(dict.containsKey(2, 2));

	}

}
