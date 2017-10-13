package ex03;

public class Chopstick {
	private boolean used = false;
	private int id;

	Chopstick(int id) {
		this.id=id;
	}

	synchronized void put() {
		used = false;
		notify();
	}

	synchronized void get(){
		while (used) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		used = true;
	}
}
