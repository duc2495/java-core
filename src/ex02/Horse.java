package ex02;

public class Horse extends Thread {
	private Thread t;
	private String horseName;
	private int destination;
	private int pace;
	
	Horse(String name) {
		horseName  = name;
		System.out.println("Con ngựa " + horseName + " đã vào đường đua");
	}
	
	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public int getPace() {
		return pace;
	}

	public void setPace(int pace) {
		this.pace = pace;
	}

	public String getHorseName() {
		return horseName;
	}

	public void run() {
		try {
			do {
				// Tăng giá trị chạy được với 1 giá trị random trong khoảng từ 1 đến 10
				setDestination(getDestination() + RandomInt.rand(1,10));
				// System.out.println(getDestination());
				// Tăng số bước chạy lên 1
				setPace(getPace() + 1);
				// Ngủ 0.5s
				Thread.sleep(500);
			} while ((getDestination() % 100 != 0));  // Nếu giá trị chạy được chia hết cho 100 thì con ngựa về đích
		} catch (InterruptedException e) {
			System.out.println("Thông báo: " + getHorseName()  + " bị tai nạn giữa đường. Đã bỏ cuộc!");
		}
		System.out.println("Thông báo: " + getHorseName()  + " đã về đích với " + getPace() + " bước chạy");
	}
	
	public void start() {
		System.out.println(getHorseName() + " bắt đầu chạy");
		if (t == null) {
			t = new Thread(this, getHorseName());
			t.start();
		}
	}
}
