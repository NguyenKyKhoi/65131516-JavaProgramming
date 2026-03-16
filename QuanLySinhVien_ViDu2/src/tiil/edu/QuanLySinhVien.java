package tiil.edu;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
	private List<SinhVien> danhSachSV;

	public QuanLySinhVien() {
		danhSachSV = new ArrayList<>();
	}

	// thêm sinh viên - add()
	public void themSinhVien(SinhVien sv) {
		danhSachSV.add(sv);
		System.out.println("Sinh viên đã thêm: " + sv.getHoTen());
	}

	// Tìm sinh viên theo mã - sử dụng get() và vòng lặp
	public SinhVien timTheoMa(String maSV) {
		for (SinhVien sv : danhSachSV) {
			if (sv.getMaSV().equals(maSV)) { // cái equals này tìm bằng văn bản
				return sv;
			}
		}
		return null;
	}

	// Tìm sinh viên có điểm cao nhất
	public SinhVien timDiemCaoNhat() {
		if (danhSachSV.isEmpty()) {
			return null;
		}

		SinhVien svCaoNhat = danhSachSV.get(0);
		for (SinhVien sv : danhSachSV) {
			if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
				svCaoNhat = sv;
			}
		}
		return svCaoNhat;
	}

	// Tính điểm trung bình của cả lớp
	public double tinhDiemTrungBinhLop() {
		if (danhSachSV.isEmpty()) {
			return 0;
		}

		double tong = 0;
		for (SinhVien sv : danhSachSV) {
			tong += sv.getDiemTB();
		}
		return tong / danhSachSV.size();
	}

	// Lọc sinh viên có điểm >= điểm cho trước
	public List<SinhVien> locSinhVienTheoDiem(double diemToiThieu) {
		List<SinhVien> ketQua = new ArrayList<>();
		for (SinhVien sv : danhSachSV) {
			if (sv.getDiemTB() >= diemToiThieu) {
				ketQua.add(sv);
			}
		}
		return ketQua;
	}

	// Sắp xếp điểm giảm dần
	public void sapXepTheoDiem() {
		for (int i = 0; i < danhSachSV.size() - 1; i++) {
			for (int j = 0; j < danhSachSV.size() - 1 - i; j++) {
				if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
					SinhVien temp = danhSachSV.get(j);
					danhSachSV.set(j, danhSachSV.get(j + 1));
					danhSachSV.set(j + 1, temp);
				}
			}
		}
	}

	// Hiển thị toàn bộ sinh viên
	public void hienThiDanhSach() {
		if (danhSachSV.isEmpty()) {
			System.out.println("Danh sách sinh viên còn trống!");
			return;
		}

		System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
		System.out.println(String.format("%-5s %-15s %-25s %-10s", "STT", "Mã SV", "Họ tên", "Điểm TB"));
		System.out.println("=".repeat(50));

		for (int i = 0; i < danhSachSV.size(); i++) {
			SinhVien sv = danhSachSV.get(i);
			System.out.println(String.format(i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB()));
		}
	}
}
