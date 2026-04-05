package luituhoc;

public class MainAbstractInterface {

	public static void main(String[] args) {
		System.out.println("=== ABSTRACT CLASS VÀ INTERFACE ===\n");

		// Sử dụng abstract class
		System.out.println("=== HÌNH HỌC ===");
		HinhHoc hinh1 = new HinhTron("Đỏ", 5.0);
		HinhHoc hinh2 = new HinhVuong("Xanh", 4.0);

		System.out.println(hinh1.toString());
		hinh1.phongTo(1.5);
		System.out.println("Diện tích mới: " + hinh1.tinhDienTich());

		System.out.println("\n---\n");

		System.out.println(hinh2.toString());
		System.out.println("Đường chéo: " + ((HinhVuong) hinh2).tinhDuongCheo());

	}

}
