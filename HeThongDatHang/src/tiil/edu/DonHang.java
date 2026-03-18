package tiil.edu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DonHang {
	private String maDH;
	private String tenKH;
	private List<String> danhSachSanPham;
	private double tongTien;
	private Date ngayDat;

	public DonHang() {
		this.danhSachSanPham = new ArrayList<>();
	}

	public DonHang(String maDH, String tenKH, double tongTien, Date ngayDat) {
		this.maDH = maDH;
		this.tenKH = tenKH;
		this.tongTien = tongTien;
		this.ngayDat = ngayDat;
		this.danhSachSanPham = new ArrayList<>();
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

	public Date getNgayDat() {
		return ngayDat;
	}

	public String toString() {
		return "Đơn hàng " + maDH + " có tên " + tenKH + " với danh sách sản phẩm " + danhSachSanPham + " với tổng tiền"
				+ tongTien + " với " + ngayDat;
	}
}
