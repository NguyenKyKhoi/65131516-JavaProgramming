package tiil.edu;

public class MainSinhVien {

	public static void main(String[] args) {

		SinhVien sv1 = new SinhVien();
		sv1.setTen("Nguyễn Văn A");
		sv1.setTuoi(20);
		sv1.setMaSV("SV001");
		sv1.setDiemTB(8.5);
		sv1.hienThiThongTin();

		System.out.println("\n---\n");

		SinhVien sv2 = new SinhVien("Trần Thị B", 21, "SV002");
		sv2.setDiemTB(7.2);
		sv2.hienThiThongTin();

		System.out.println("\n---\n");

		SinhVien sv3 = new SinhVien();
		sv3.setTuoi(15);
		sv3.setDiemTB(12.5);
		sv3.setMaSV("ABC123");

		System.out.println("\nTên sv1: " + sv1.getTen());
		System.out.println("Điểm TB sv2: " + sv2.getDiemTB());

	}

}
