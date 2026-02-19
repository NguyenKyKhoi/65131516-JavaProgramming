package tiil.edu;

public class MainXeHoi {

	public static void main(String[] args) {
		XeHoi xe1 = new XeHoi();
		xe1.hangXe = "Toyota";
		xe1.mauSac = "Đỏ";
		xe1.tocDoHienTai = 50;

		XeHoi xe2 = new XeHoi();
		xe2.hangXe = "Honda";
		xe2.mauSac = "Trắng";
		xe2.tocDoHienTai = 0;

		System.out.println("=== THÔNG TIN XE 1 ===");
		xe1.hienThiThongTin();
		xe1.tangToc(30);

		System.out.println("\n=== THÔNG TIN XE 2 ===");
		xe2.hienThiThongTin();
		xe2.tangToc(60);
		xe2.phanh();

	}

}
