package tiil.edu;

import java.util.Calendar;
import java.util.Date;

public class MainQuanLyDonHang {
	public static void main(String[] args) {
		QuanLyDonHang ql = new QuanLyDonHang();

		Calendar cal = Calendar.getInstance();

		cal.set(2024, 2, 15);
		Date ngay1 = cal.getTime();

		cal.set(2024, 2, 10);
		Date ngay2 = cal.getTime();

		cal.set(2024, 2, 20);
		Date ngay3 = cal.getTime();

		ql.them(new DonHang("DH01", "Nguyễn Văn An", 500000, ngay1));
		ql.them(new DonHang("DH02", "Trần Thị Bình", 850000, ngay2));
		ql.them(new DonHang("DH03", "Nguyễn Văn An", 200000, ngay3));

		System.out.println("--- DANH SÁCH ĐÃ THÊM XONG ---");

		ql.timDonHangCaoNhat();

		ql.thongKeKhachHang();

		ql.tinhTongDoanhThu();

		System.out.println("\n--- Thực hiện sắp xếp theo ngày ---");
		ql.sapXepTheoNgay();

		// 6 xuất tất cả đơn hàng
		ql.xuatDanhSach();
	}
}