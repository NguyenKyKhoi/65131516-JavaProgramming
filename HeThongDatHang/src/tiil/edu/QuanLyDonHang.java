package tiil.edu;

import java.util.ArrayList;

public class QuanLyDonHang {
	private ArrayList<DonHang> ds = new ArrayList<>();

	// 1 thêm đơn hàng
	public void them(DonHang dh) {
		ds.add(dh);
	}

	// 2 tìm đơn hàng có giá trị cao nhất
	public void timDonHangCaoNhat() {
		if (ds.isEmpty())
			return;

		DonHang max = ds.get(0);
		for (DonHang dh1 : ds) {
			if (dh1.getTongTien() > max.getTongTien()) {
				max = dh1;
			}
		}
		System.out.println("Đơn hàng cao nhất : " + max);
	}

	// 3. thống kê số lượng đơn theo khách
	public void thongKeKhachHang() {
		System.out.println("--- Thống kế khách hàng ---");
		ArrayList<String> daIn = new ArrayList<>();

		for (DonHang dh1 : ds) {
			String ten = dh1.getTenKH();

			if (!daIn.contains(ten)) {
				int dem = 0;

				for (DonHang dh2 : ds) {
					if (dh2.getTenKH().equals(ten)) {
						dem++;
					}
				}
				System.out.println(ten + " có" + dem + " đơn hàng");
				daIn.add(ten);
			}
		}
	}

	// 4. Tính tổng doanh thu
	public void tinhTongDoanhThu() {
		double sum = 0;
		for (DonHang dh2 : ds) {
			sum += dh2.getTongTien();
		}
		System.out.println("Tổng doanh thu : " + sum);
	}

	// 5. Sắp xếp đơn hàng theo ngày (giả sử thêm thuộc tính ngayDat)
	public void sapXepTheoNgay() {
		ds.sort((d1, d2) -> d1.getNgayDat().compareTo(d2.getNgayDat()));
		System.out.println("Đã sắp xếp xong!");
	}

	// 6 xuất danh sách
	public void xuatDanhSach() {
		System.out.println("---DANH SÁCH ĐƠN HÀNG---");
		if (ds.isEmpty())
			return;

		for (DonHang dh1 : ds) {
			System.out.println(dh1);
		}
		System.out.println("----------------------------------------");
	}

}