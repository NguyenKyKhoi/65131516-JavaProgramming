package tiil.edu;

public class MainNhanVien {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("65131516", "Nguyễn Kỳ Khôi", 10000000d, 2340000d);
		NhanVien nv2 = new NhanVien("00000000", "Nguyễn Kỳ Khoai", 5000000d, 1000000d);

		nv1.hienThongTin();

		System.out.println("\n\nThông tin của nhân viên 2: ");
		nv2.setMaNV("65131516");
		nv2.setHoTen("Nguyễn Kỳ Khôi");
		nv2.setLuongCoBan(10000000d);
		nv2.setHeSoLuong(2340000d);
		nv2.hienThongTin();

		System.out.print("\nXếp loại nhân viên: ");
		nv2.xepLoai();
	}

}
