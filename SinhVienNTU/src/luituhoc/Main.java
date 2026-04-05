package luituhoc;

public class Main {

	public static void main(String[] args) {
		// IN tên trường
		System.out.println(SinhVienNTU.TEN_TRUONG);
		SinhVienNTU.sayHi();

		SinhVienNTU sv1 = new SinhVienNTU("Nguyễn Kỳ Khôi", "12a2");
		SinhVienNTU sv2 = new SinhVienNTU("Khôi Lan Lùi", "12a2");

		sv1.sayHello();
		sv2.sayHello();
	}

}
