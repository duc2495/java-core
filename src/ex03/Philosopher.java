package ex03;

public class Philosopher extends Thread {
	private int id;

	// Đây là 2 chopstick dùng chung mà mỗi nhà triết gia được phép sử dụng
	private Chopstick left;
	private Chopstick right;

	Philosopher(int id, Chopstick l, Chopstick r) {
		this.id = id;
		left = l;
		right = r;
	}

	// Hai nhà triết gia ngồi cạnh nhau có thứ tự lấy chopstick khác nhau để
	// tránh deadlock do chờ đợi vòng tròn khi tất cả cùng lấy chopstick bên tay
	// phải và đợi chopstick bên trái hoặc ngược lại
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

	// Đặt chopstick xuống sau khi ăn xong
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
