package tiil.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CacVongLap {

	public static void main(String[] args) {

		// vong lap for
		// In các số từ 1 đến 10
		System.out.print("Các số từ 1 đến 10: ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Đếm ngược từ 10 đến 1
		System.out.print("Đếm ngược: ");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Tăng bước nhảy
		System.out.print("Số chẵn từ 2 đến 20: ");
		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
		}

		int tong = 0;
		System.out.println("Tinh tong 1 den 10");
		for (int i = 1; i <= 10; i++) {
			tong += i;
		}
		System.out.println(tong + " la tong cua 1 den 10");

		// vong lap while
		int i = 1;
		System.out.print("Các số từ 1 đến 10: ");
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		// vong lap do while
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n=== MENU CHƯƠNG TRÌNH ===");
			System.out.println("1. Tính tổng hai số");
			System.out.println("2. Tính tích hai số");
			System.out.println("3. Thoát chương trình");
			System.out.print("Chọn chức năng (1-3): ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Nhập số thứ nhất: ");
				double a = sc.nextDouble();
				System.out.print("Nhập số thứ hai: ");
				double b = sc.nextDouble();
				System.out.println("Tổng: " + (a + b));
				break;

			case 2:
				System.out.print("Nhập số thứ nhất: ");
				double x = sc.nextDouble();
				System.out.print("Nhập số thứ hai: ");
				double y = sc.nextDouble();
				System.out.println("Tích: " + (x * y));
				break;

			case 3:
				System.out.println("Cảm ơn bạn đã sử dụng!");
				break;

			default:
				System.out.println("Lựa chọn không hợp lệ!");
			}

		} while (choice != 3);

		// Enhanced For Loop
		int[] numbers = { 1, 2, 3, 4, 5 };

		System.out.print("Các số trong mảng: ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n");

		// duyet collection
		List<String> fruits = new ArrayList<>();
		fruits.add("Táo");
		fruits.add("Chuối");
		fruits.add("Cam");
		fruits.add("Xoài");

		System.out.println("Danh sách trái cây:");
		for (String fruit : fruits) {
			System.out.println("- " + fruit);
		}

		// For-each với var
		var colors = new String[] { "Đỏ", "Xanh", "Vàng" };
		for (var color : colors) {
			System.out.println("Màu: " + color);
		}

		// Stream API và forEach
		List<String> names = List.of("An", "Bình", "Châu", "Dũng");

		System.out.println("1. For truyền thống:");
		for (int y = 0; y < names.size(); y++) {
			System.out.println("- " + names.get(y));
		}

		System.out.println("\n2. Enhanced for loop:");
		for (String name : names) {
			System.out.println("- " + name);
		}

		System.out.println("\n3. Stream API với forEach:");
		names.stream().forEach(name -> System.out.println("- " + name));

		System.out.println("\n4. Method reference:");
		names.forEach(System.out::println);

		// Các Lệnh Điều Khiển Vòng Lặp
		// break : thoat vong lap
		// continue : tien toi vong lap tiep theo

		Random r = new Random();
		int sorandom = r.nextInt(100) + 1;
		System.out.println("SO RANDOM MAY CHON LA " + sorandom);
		int y;
		int count = 0;
		int luachon;
		do {
			System.out.println("Moi ban nhap sao cho so cua ban lon hon random");
			for (int o = 1; o <= 10; o++) {
				y = sc.nextInt();
				if (y > sorandom) {
					System.out.println("LON HON");
					count++;
				} else {
					System.out.println("NHO HON");
				}
			}
			System.out.println("Diem cua ban la : " + count);
			System.out.println("Ban muon choi lai khong 1 : 0");
			luachon = sc.nextInt();
		} while (luachon != 0);

		sc.close();
	}
}
