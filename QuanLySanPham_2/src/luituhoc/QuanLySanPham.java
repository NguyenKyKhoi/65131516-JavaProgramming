package luituhoc;

import java.util.Scanner;

public class QuanLySanPham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SanPham sp = new SanPham();

		sp.Nhap(sc);
		sp.Xuat();

	}

}
