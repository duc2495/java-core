package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import ex01.Bai01;

public class TestEx01 {

	@Test
	public void testNull() {
		HashMap<String, Integer> hm = Bai01.addHashMap(null);
		assertNull(hm);
	}

	@Test
	public void testEmpty() {
		HashMap<String, Integer> hm = Bai01.addHashMap("");
		assertTrue(hm.isEmpty());
	}

	@Test
	public void testAddHashMap() {
		HashMap<String, Integer> hm = Bai01.addHashMap("Ha noi oi ha noi oi");
		assertTrue(hm.get("Ha") == 1);
		assertTrue(hm.get("noi") == 2);
		assertTrue(hm.get("oi") == 2);
		assertTrue(hm.get("ha") == 1);
	}

}
