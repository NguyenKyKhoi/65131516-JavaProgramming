package luituhoc;

public class GamingLaptop extends LapTop {
	private String gpu;

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public GamingLaptop(String cpu, int ram, double dungLuongBoNho, boolean batTat, int phanTramPin, double canNang,
			double kichThuocManHinh, String gpu) {
		super(cpu, ram, dungLuongBoNho, batTat, phanTramPin, canNang, kichThuocManHinh);
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return super.toString() + " [gpu=" + gpu + "]";
	}

	@Override
	public void start() {
		super.start();
		System.out.println("Đèn LeD RGB đã sáng đèn...");
	}

	@Override
	public void shutDown() {
		super.shutDown();
		System.out.println("Đèn LeD RGB đã tắt sáng đèn!!!");
	}

	public void batTurboBoost() {
		System.out.println("Đang kích hoạt chế độ Turbo! CPU đang chạy ở xung nhịp tối đa để chơi game.");
	}
}
