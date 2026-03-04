package edu.tiil;

class XeHoi {
	String hangXe;
	int tocDoHienTai;
	String mauSac;

	void tangToc(int km) {
		tocDoHienTai += km;
		System.out.println(hangXe + " tăng tốc độ " + tocDoHienTai + " km/h");
	}

	void phanh() {
		tocDoHienTai = 0;
		System.out.println(hangXe + " đã dừng lại");
	}

	void hienThiThongTin() {
		System.out.println("Hãng Xe: " + hangXe);
		System.out.println("Màu Sắc: " + mauSac);
		System.out.println("Tốc độ hiện tại: " + tocDoHienTai + " km/h");
	}
}

public class justTest {
	public static void main(String[] args) {
		XeHoi xh1 = new XeHoi();

		xh1.hangXe = "HonDa";
		xh1.mauSac = "Đỏ";
		xh1.tocDoHienTai = 50;

		xh1.hienThiThongTin();
		xh1.tangToc(30);
		xh1.phanh();

	}

}
