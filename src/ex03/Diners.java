package ex03;

public class Diners {

	Thread[] phil = new Thread[5];
	Chopstick[] chopstick = new Chopstick[5];

	Thread makePhilosopher(int id, Chopstick left, Chopstick right) {
		return new Philosopher(id, left, right);
	}

	public void start() {
		for (int i = 0; i < 5; ++i)
			chopstick[i] = new Chopstick(i);
		for (int i = 0; i < 5; ++i) {
			phil[i] = makePhilosopher(i, chopstick[(i+4)%5], chopstick[i]);
			phil[i].start();
		}
	}
}
