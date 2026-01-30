package tiil.edu;

import java.util.Scanner;

public class QuyDoiTienTe {

	public static void main(String[] args) {
		System.out.println("Nhap loai tien ban muon doi ");
		System.out.println("1. USD -> VND");
		System.out.println("2. EUR -> VND");
		System.out.print("Lua chon : ");
		Scanner sc = new Scanner(System.in);
		int luaChon = sc.nextInt();

		System.out.print("Nhap so tien : ");
		double value = sc.nextDouble();

		double thanhTien = 0;
		if (luaChon == 1) {
			thanhTien = value * 23500;
			System.out.println("So tien sau khi doi : " + thanhTien);
		} else if (luaChon == 2) {
			thanhTien = value * 27000;
			System.out.println("So tien sau khi doi : " + thanhTien);
		} else {
			System.out.println("Chung toi khong co lua chon ban vua chon !");
		}

		sc.close();
	}

}
