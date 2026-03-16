package tiil.com;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
	private List<SanPham> danhSachSP;

	public QuanLySanPham() {
		danhSachSP = new ArrayList<>();
	}

	// thêm sản phẩm nè - add()
	public void themSP(SanPham sp) {
		danhSachSP.add(sp);
		System.out.println("Sản Phẩm đã thêm : " + sp.getTenSP());
	}

	// xóa sản phẩm theo mã (tìm sản phẩm rồi thực hiện xóa)
	public boolean timVaXoa(String maSP) {
		for (int i = 0; i < danhSachSP.size(); i++) {
			if (danhSachSP.get(i).getMaSP().equals(maSP)) {
				SanPham spBiXoa = danhSachSP.remove(i);
				System.out.println("Sản phẩm đã xóa : " + spBiXoa.getTenSP());
				return true;
			}
		}
		System.out.println("Không tìm thấy sản phẩm với mã : " + maSP);
		return false;
	}

	// tìm sản phẩm theo tên
	public void timTheoTen(String tenCanTim) {
		for (SanPham sp : danhSachSP) {
			if (sp.getTenSP().equalsIgnoreCase(tenCanTim)) {
				System.out.println("Kết quả tìm kiếm : " + sp.toString());
				return;
			}
		}
		System.out.println("Rất tiếc, không tìm thấy sản phẩm: " + tenCanTim);
	}

	// sắp xếp sản phẩm theo giá (giảm dần)
	public void sapXepGiam() {
		for (int i = 0; i < danhSachSP.size() - 1; i++) {
			for (int j = 0; j < danhSachSP.size() - 1 - i; j++) {
				if (danhSachSP.get(j).getGia() < danhSachSP.get(j + 1).getGia()) {
					SanPham temp = danhSachSP.get(j);
					danhSachSP.set(j, danhSachSP.get(j + 1));
					danhSachSP.set(j + 1, temp);
				}
			}
		}
	}

	// sắp xếp sản phẩm theo (tăng dần)
	public void sapXepTang() {
		for (int i = 0; i < danhSachSP.size() - 1; i++) {
			for (int j = 0; j < danhSachSP.size() - 1 - i; j++) {
				if (danhSachSP.get(j).getGia() > danhSachSP.get(j + 1).getGia()) {
					SanPham temp = danhSachSP.get(j);
					danhSachSP.set(j, danhSachSP.get(j + 1));
					danhSachSP.set(j + 1, temp);
				}
			}
		}
	}

	// Tính tổng giá trị kho hàng
	public double tongGiaTriKhoHang() {
		double sum = 0;
		for (SanPham sp : danhSachSP) {
			sum += sp.getGia() * sp.getSoLuong();
		}
		return sum;
	}

	// Liệt kê sản phẩm sắp hết hàng (số lượng < 10)
	public void sanPhamSapHetHang() {
		for (SanPham x : danhSachSP) {
			if (x.getSoLuong() < 10) {
				System.out.println(x.getTenSP());
			}
		}
	}
}
