package luituhoc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainQuanLyMayTinh {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số lượng máy tính : ");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<GamingLaptop> dsGamingLaptop = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập cpu: ");
			String cpu = sc.nextLine();
			System.out.print("Nhập ram: ");
			int ram = sc.nextInt();
			System.out.print("Nhập dung lượng bộ nhớ: ");
			double dungluongbonho = sc.nextDouble();
			System.out.print("Trạng thái của Laptop: ");
			boolean trangthai = sc.nextBoolean();
			System.out.print("Phần trăm pin: ");
			int phantrampin = sc.nextInt();
			System.out.print("Cân Nặng(g): ");
			double cannang = sc.nextDouble();
			System.out.print("Kích Thước màn hình: ");
			double size = sc.nextDouble();
			sc.nextLine();
			System.out.print("gpu: ");
			String gpu = sc.nextLine();
			GamingLaptop temp = new GamingLaptop(cpu, ram, dungluongbonho, trangthai, phantrampin, cannang, size, gpu);
			dsGamingLaptop.add(temp);
			System.out.println("=================================");
		}

		for (var dt : dsGamingLaptop) {
			System.out.println(dt.toString());
			dt.start();
			dt.batTurboBoost();
			dt.shutDown();
		}

		sc.close();
	}

}
