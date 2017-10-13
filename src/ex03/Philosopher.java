package ex03;

public class Philosopher extends Thread {
	private int id;
	private Chopstick left;
	private Chopstick right;

	Philosopher(int id, Chopstick l, Chopstick r) {
		this.id = id;
		left = l;
		right = r;
	}

	public void getChopstick() {
		if (id % 2 == 0) {
			right.get();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			left.get();
		} else {
			left.get();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			right.get();
		}
	}

	public void Signal() {
		right.put();
		left.put();
	}

	public void run() {
		while (true) {
			thinking();
			getChopstick();
			eating();
			Signal();
		}
	}

	public void eating() {
		System.out.println(Thread.currentThread().getName() + ": Eating.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void thinking() {
		System.out.println(Thread.currentThread().getName() + ": Thinking.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
