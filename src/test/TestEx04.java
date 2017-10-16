package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ex04.Bai04;

public class TestEx04 {
	@Test
	public void testFindString() {
		assertEquals("a", Bai04.findString("a"));
		assertEquals("ab", Bai04.findString("ab"));
		assertEquals("abcdef", Bai04.findString("abcdef"));
		assertEquals("b", Bai04.findString("aaaab"));
		assertEquals("abc", Bai04.findString("abcdd"));
		assertEquals("cde", Bai04.findString("aaaabbbbbcde"));
		assertEquals("cde", Bai04.findString("aaaabbcdeffffgg"));
		assertEquals("", Bai04.findString("aabbfffgg"));
		assertTrue(Bai04.findString("aabbfffgg").length()==0);
	}
}
