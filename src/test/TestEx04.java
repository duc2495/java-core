package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ex04.Bai04;

public class TestEx04 {
	@Test
	public void testNull() {
		assertNull(Bai04.findString(null));
	}
	
	@Test
	public void testEmpty() {
		String str = Bai04.findString("");
		assertTrue(str.isEmpty());
	}
	
	@Test
	public void testFindString() {
		assertEquals("a", Bai04.findString("a"));
		assertEquals("ab", Bai04.findString("ab"));
		assertEquals("abcdef", Bai04.findString("abcdef"));
		assertEquals("b", Bai04.findString("aaaab"));
		assertEquals("abc", Bai04.findString("abcdd"));
		assertEquals("cde", Bai04.findString("aaabbbbcde"));
		assertEquals("cde", Bai04.findString("aabbcdeffgg"));
		assertEquals("", Bai04.findString("aabbfffgg"));
	}
}
