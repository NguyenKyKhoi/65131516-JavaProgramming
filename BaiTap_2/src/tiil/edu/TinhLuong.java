package tiil.edu;

import java.util.Scanner;

public class TinhLuong {
	public static void main(String[] args) {
		// Bai 1 Tinh tien luong
		double time, salary;
		Scanner sc = new Scanner(System.in);

		System.out.print("So gio lam : ");
		time = sc.nextDouble();
		System.out.print("Nhap so luong : ");
		salary = sc.nextDouble();

		double tong = 0;
		if (time > 40) {
			double gio_du = time - 40;
			tong = (salary * 40) + (gio_du * salary * 1.5);
		} else {
			tong = time * salary;
		}

		System.out.println("tong luong phai tra la : " + tong);
		sc.close();
	}
}
