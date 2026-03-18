package tiil.edu;

import java.util.ArrayList;
import java.util.List;

public class DonHang {
	private String maDH;
	private String tenKH;
	private List<String> danhSachSanPham;
	private double tongTien;

	public DonHang() {
		this.danhSachSanPham = new ArrayList<>();
	}

	public DonHang(String maDH, String tenKH, List<String> danhSachSanPham, double tongTien) {
		this.maDH = maDH;
		this.tenKH = tenKH;
		this.danhSachSanPham = danhSachSanPham;
		this.tongTien = tongTien;
	}

	public String getMaDH() {
		return maDH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public double getTongTien() {
		return tongTien;
	}

	public List<String> getDanhSachSanPham() {
		return danhSachSanPham;
	}

	public String ToString() {
		return "Đơn hàng " + maDH + " có tên " + tenKH + " với danh sách sản phẩm " + danhSachSanPham + " với tổng tiền"
				+ tongTien;
	}
}
