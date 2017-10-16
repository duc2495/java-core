package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Horse> listHorses = new ArrayList<Horse>();
		for (int i = 1; i <= 10; i++) {
			listHorses.add(new Horse("Horse-" + i));
		}
		for (Horse horse : listHorses) {
			executor.submit(horse);
		}
	}
}
