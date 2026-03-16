package tiil.edu;

public class MainQuanLySinhVien {

	public static void main(String[] args) {
		System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n");

		QuanLySinhVien qlsv = new QuanLySinhVien();

		// thêm sinh viên
		qlsv.themSinhVien(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
		qlsv.themSinhVien(new SinhVien("SV002", "Trần Thị B", 7.2));
		qlsv.themSinhVien(new SinhVien("SV003", "Lê Văn C", 6.8));
		qlsv.themSinhVien(new SinhVien("SV004", "Phạm Thị D", 9.1));
		qlsv.themSinhVien(new SinhVien("SV005", "Hoàng Văn E", 5.5));

		// hiển thị danh sách
		qlsv.hienThiDanhSach();

		// Tìm sinh viên
		System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
		SinhVien sv = qlsv.timTheoMa("SV003");
		System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));

	}

}
