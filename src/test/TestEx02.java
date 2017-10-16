package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

import ex02.Horse;

public class TestEx02 {
	
	@Test
	public void testHorse() throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Horse> listHorses = new ArrayList<Horse>();
		for (int i = 1; i <= 10; i++) {
			listHorses.add(new Horse("Horse-" + i));
		}
		for (Horse horse : listHorses) {
		    Future<Integer> future = executor.submit(horse);
		    assertTrue(future.get()%100 == 0);
		    assertEquals(true, future.isDone());
		}
	}

}
