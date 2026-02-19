package tiil.edu;

public class MainHinh {

	public static void main(String[] args) {
		HinhChuNhat hinh1 = new HinhChuNhat();
		hinh1.chieuDai = 5.0;
		hinh1.chieuRong = 4.0;

		HinhChuNhat hinh2 = new HinhChuNhat();
		hinh2.chieuDai = 5.0;
		hinh2.chieuRong = 5.0;

		System.out.println("-----Thong tin hinh 1-----");
		hinh1.hienThiThongTin();

		System.out.println("-----Thong tin hinh 2-----");
		hinh2.hienThiThongTin();

	}

}
