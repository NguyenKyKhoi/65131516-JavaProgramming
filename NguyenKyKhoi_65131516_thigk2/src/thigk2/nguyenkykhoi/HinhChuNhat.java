package thigk2.nguyenkykhoi;

import java.util.Scanner;

public class HinhChuNhat {

	// 1. nhập từ bàn phím thông qua Scanner và dùng công thức tính và xuất ra màn
	// hình
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Nhập thông tin
		System.out.print("Nhập x1 (Góc Trên-Trái): ");
		double x1 = sc.nextDouble();
		System.out.print("Nhập y1 (Góc Trên-Trái): ");
		double y1 = sc.nextDouble();

		System.out.print("Nhập x2 (Góc Dưới-Phải): ");
		double x2 = sc.nextDouble();
		System.out.print("Nhập y2 (Góc Dưới-Phải): ");
		double y2 = sc.nextDouble();

		// Tính Chiều rộng và cao
		double chieuRong = Math.abs(x2 - x1);
		double chieuCao = Math.abs(y2 - y1);

		// Tính chu vi diện tích
		double chuVi = (chieuRong + chieuCao) * 2;
		double dienTich = chieuRong * chieuCao;

		// Xuất kết quả
		System.out.println("\n--- Kết quả ---");
		System.out.println("Chiều rộng: " + chieuRong);
		System.out.println("Chiều cao: " + chieuCao);
		System.out.println("Chu vi hình chữ nhật: " + chuVi);
		System.out.println("Diện tích hình chữ nhật: " + dienTich);

		sc.close();
	}

}
