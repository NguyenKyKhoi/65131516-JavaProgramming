package khoimc.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("001", "Mai Cuong Tho", 2300000);
		// nv1.hienThiThongTin();

		System.out.println(nv1.toString());

		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Tran Thi Tuoi Tha", 2300000, 3, 20000);
		System.out.println(nvVanPhong1.toString());
//		nvVanPhong1.hienThiThongTin();
	}

}
