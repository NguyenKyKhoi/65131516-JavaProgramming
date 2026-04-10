package luituhoc;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyXe {

	public static void main(String[] args) {
		System.out.print("Nhập số lượng xe : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<XeDien> dsXeDien = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin xe " + (i + 1));
			XeDien temp = new XeDien();
			temp.Nhap(sc);
			dsXeDien.add(temp);
		}

		for (var xe : dsXeDien) {
			System.out.println(xe.toString());
			System.out.println("Thời hạn sử dụng : " + xe.thoiGianSuDung());

		}

	}

}
