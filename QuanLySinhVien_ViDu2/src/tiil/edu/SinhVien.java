package tiil.edu;

public class SinhVien {
	private String MaSV;
	private String hoTen;
	private double diemTB;

	public SinhVien(String MaSV, String hoTen, double diemTB) {
		this.MaSV = MaSV;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public String getMaSV() {
		return MaSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public String toString() {
		return String.format("Mã SV: %s | Họ tên: %s | Điểm TB: %.2f", MaSV, hoTen, diemTB);
	}
}
