package ex03;

public class Chopstick {
	// Biến used là trạng thái của chopstick
	// - true: trạng thái đang được sử dụng
	// - false: trạng thái rỗi
	private boolean used = false;
	private int id;

	Chopstick(int id) {
		this.setId(id);
	}

	// Nhà triết gia đặt chopstick xuống bàn
	synchronized void put() {
		used = false;
		notify();
	}

	// Nếu chopstick đang được sử dụng Nhà triết gia phải đợi wait() đến khi
	// chopstick được giải phóng, mới có thể lấy
	synchronized void get() {
		while (used) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		used = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
