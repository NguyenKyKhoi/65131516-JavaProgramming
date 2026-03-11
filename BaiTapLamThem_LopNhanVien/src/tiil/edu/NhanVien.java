package tiil.edu;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	private double heSoLuong;

	public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}

	public String getMaNV() {
		return maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setLuongCoBan(Double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double tinhLuong() {
		return luongCoBan * heSoLuong;
	}

	public void xepLoai() {
		double luong = tinhLuong();

		if (luong >= 20000000) {
			System.out.println("Xuất sắc");
		} else if (luong >= 15000000) {
			System.out.println("Tốt");
		} else {
			System.out.println("Khá");
		}
	}

	public void hienThongTin() {
		System.out.println("Mã Nhân Viên: " + maNV);
		System.out.println("Họ và Tên: " + hoTen);
		System.out.printf("Lương Cơ Bản: %,.0f\n", luongCoBan);
		System.out.printf("Hệ Số Lương: %,.0f", heSoLuong);
	}
}
