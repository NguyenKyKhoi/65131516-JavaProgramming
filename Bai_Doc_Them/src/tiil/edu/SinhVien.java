package tiil.edu;

public class SinhVien {
	private String ten;
	private int tuoi;
	private String maSV;
	private double diemTB;

	public SinhVien() {
		this.ten = "Chưa có tên";
		this.tuoi = 18;
		this.maSV = "SV000";
		this.diemTB = 0.0;
	}

	public SinhVien(String ten, int tuoi, String maSV) {
		this.ten = ten;
		this.setTuoi(tuoi);
		this.maSV = maSV;
		this.diemTB = 0.0;
	}

	public String getTen() {
		return ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getMaSV() {
		return maSV;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setTen(String ten) {
		if (ten != null && !ten.trim().isEmpty()) {
			this.ten = ten;
		} else {
			System.out.println("Tên không hợp lệ!");
		}
	}

	public void setTuoi(int tuoi) {
		if (tuoi >= 18 && tuoi <= 50) {
			this.tuoi = tuoi;
		} else {
			System.out.println("Tuổi phải từ 18 đến 50!");
			this.tuoi = 18;
		}
	}

	public void setMaSV(String maSV) {
		if (maSV != null && maSV.startsWith("SV")) {
			this.maSV = maSV;
		} else {
			System.out.println("Mã SV phải bắt đầu bằng 'SV'!");
		}
	}

	public void setDiemTB(double diemTB) {
		if (diemTB >= 0.0 && diemTB <= 10.0) {
			this.diemTB = diemTB;
		} else {
			System.out.println("Điểm TB phải từ 0.0 đến 10.0!");
		}
	}

	public void hienThiThongTin() {
		System.out.println("=== THÔNG TIN SINH VIÊN ===");
		System.out.println("Tên: " + this.ten);
		System.out.println("Tuổi: " + this.tuoi);
		System.out.println("Mã SV: " + this.maSV);
		System.out.println("Điểm TB: " + this.diemTB);
		System.out.println("Xếp loại: " + this.xepLoai());
	}

	private String xepLoai() {
		if (diemTB >= 8.0)
			return "Giỏi";
		else if (diemTB >= 6.5)
			return "Khá";
		else if (diemTB >= 5.0)
			return "Trung bình";
		else
			return "Yếu";
	}
}
