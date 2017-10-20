package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ex05.Dictionary;

public class TestEx05 {
	
	Dictionary<Integer, Integer, String> dict; 


	@Test
	public void testNull() {
		Dictionary<Integer, Integer, String> dict= new Dictionary<Integer, Integer, String>();
		dict.put(null, null, null);
		dict.put(1, 1, null);
		
		assertNull(dict.put(null, null, "NULL"));
		assertNull(dict.put(1, 1, null));
		
		assertEquals("NULL", dict.get(null, null));
		assertNull(dict.get(1, 1));
		
		assertTrue(dict.containsKey(null, null));
		assertTrue(dict.containsKey(1, 1));
	}

	@Test
	public void testEmpty() {
		Dictionary<String, String, String> dict= new Dictionary<String, String, String>();
		dict.put("", "", "");
		
		assertTrue(dict.put("", "", "").isEmpty());
		
		assertTrue(dict.get("", "").isEmpty());
		
		assertTrue(dict.containsKey("", ""));
	}
	
	@Test
	public void testDictionary() {
		Dictionary<Integer, Integer, String> dict= new Dictionary<Integer, Integer, String>();
		
		assertNull(dict.put(1, 1, "Hai"));
		assertNull(dict.put(1, 2, "Ba"));
		assertEquals("Ba", dict.put(1, 2, "Ba"));
		
		assertEquals("Hai", dict.get(1, 1));
		assertEquals("Ba", dict.get(1, 2));
		
		assertTrue(dict.containsKey(1, 1));
		assertFalse(dict.containsKey(2, 2));
	}
}
