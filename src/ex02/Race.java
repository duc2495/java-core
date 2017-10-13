package ex02;

import java.util.ArrayList;
import java.util.List;

public class Race {
	public static void main(String[] args) {
		List<Horse> listHorses = new ArrayList<Horse>();
		for (int i = 1; i <= 10; i++) {
			listHorses.add(new Horse("Horse-" + i));
		}
		for (Horse horse : listHorses) {
			horse.start();
		}
	}
}
