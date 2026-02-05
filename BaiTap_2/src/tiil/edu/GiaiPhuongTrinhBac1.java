package tiil.edu;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap phuong trinh bac 1 : ax + b = 0 voi ");
		System.out.print("a la : ");
		a = sc.nextInt();
		System.out.print("b la : ");
		b = sc.nextInt();

		if (a != 0) {
			double x = (double) -b / a;
			System.out.println("Phuong trinh co 1 nghiem duy nhat la " + x);
		} else if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		}

		sc.close();
	}
}
