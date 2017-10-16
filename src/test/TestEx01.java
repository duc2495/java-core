package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import ex01.Bai01;

public class TestEx01 {

	@Test
	public void testAddHashMap() {
		HashMap<String, Integer> hm = Bai01.addHashMap("Ha noi  oi    ha noi oi   ");
		assertNotNull(hm);
		assertTrue(hm.containsKey("Ha"));
		assertTrue(hm.containsKey("noi"));
		assertTrue(hm.containsKey("oi"));
		assertTrue(hm.containsKey("ha"));
		assertFalse(hm.containsKey(" "));
		
		assertTrue(hm.get("Ha")==1);
		assertTrue(hm.get("noi")==2);
		assertTrue(hm.get("oi")==2);
		assertTrue(hm.get("ha")==1);
	}

}
