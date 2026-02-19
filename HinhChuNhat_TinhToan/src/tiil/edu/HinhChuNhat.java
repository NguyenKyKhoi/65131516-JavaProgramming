package tiil.edu;

public class HinhChuNhat {
	double chieuDai;
	double chieuRong;

	double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}

	boolean laHinhVuong() {
		return chieuDai == chieuRong;
	}

	void hienThiThongTin() {
		System.out.println("Chiều dài: " + chieuDai);
		System.out.println("Chiều rộng: " + chieuRong);
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
		System.out.println("Là hình vuông ? " + (laHinhVuong() ? "Có" : "Không"));
	}
}
