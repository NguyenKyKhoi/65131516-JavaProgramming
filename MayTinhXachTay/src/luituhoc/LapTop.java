package luituhoc;

public class LapTop extends Computer {

	private int phanTramPin;
	private double canNang;
	private double kichThuocManHinh;

	public int getPhanTramPin() {
		return phanTramPin;
	}

	public void setPhanTramPin(int phanTramPin) {
		this.phanTramPin = phanTramPin;
	}

	public double getCanNang() {
		return canNang;
	}

	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}

	public double getKichThuocManHinh() {
		return kichThuocManHinh;
	}

	public void setKichThuocManHinh(double kichThuocManHinh) {
		this.kichThuocManHinh = kichThuocManHinh;
	}

	public LapTop(String cpu, int ram, double dungLuongBoNho, boolean batTat, int phanTramPin, double canNang,
			double kichThuocManHinh) {
		super(cpu, ram, dungLuongBoNho, batTat);
		this.phanTramPin = phanTramPin;
		this.canNang = canNang;
		this.kichThuocManHinh = kichThuocManHinh;
	}

	@Override
	public void start() {
		super.start();
	}

	@Override
	public void shutDown() {
		super.shutDown();
	}

	@Override
	public String toString() {
		return super.toString() + " [phanTramPin=" + phanTramPin + ", canNang=" + canNang + ", kichThuocManHinh="
				+ kichThuocManHinh + "]";
	}

	public void gapManHinh() {
		System.out.println("Đang gập màn hình");
	}
}
