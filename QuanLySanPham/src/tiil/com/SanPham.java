package tiil.com;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double gia;
	private int soLuong;

	public SanPham(String maSP, String tenSP, double gia, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
	}

	public String getMaSP() {
		return maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public double getGia() {
		return gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public String toString() {
		String s = "Mã sản phẩm là : " + maSP + ", Tên sản phẩm là : " + tenSP + ", Giá sản phẩm : " + gia
				+ ", Số lượng là : " + soLuong;
		return s;
	}
}
