package tiil.edu;

public class Lop_Va_Doituong {
	public static void main(String[] args) {

		SinhVien sinhVien1 = new SinhVien();
		sinhVien1.ten = "Nguyễn Văn A";
		sinhVien1.tuoi = 20;
		sinhVien1.maSV = "SV001";

		SinhVien sinhVien2 = new SinhVien();
		sinhVien2.ten = "Trần Thị B";
		sinhVien2.tuoi = 21;
		sinhVien2.maSV = "SV002";

		sinhVien1.hocBai("Toán");
		sinhVien2.hocBai("Văn");

	}

}
