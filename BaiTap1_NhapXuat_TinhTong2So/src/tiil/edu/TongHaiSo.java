package tiil.edu;

import java.util.Scanner;

public class TongHaiSo {

	public static void main(String[] args) {
		// Khai báo
		double num1, num2, sum;

		// Khai báo đối tượng Scanner
		Scanner banPhim = new Scanner(System.in);

		// In ra thông tin, mời User nhập số thứ nhất
		System.out.print("Mời nhập số thứ nhất: ");
		num1 = banPhim.nextDouble();

		System.out.print("Mời nhập số thứ hai: ");
		num2 = banPhim.nextDouble();

		// Tính toán
		sum = num1 + num2;

		// Xuất ra print không hiểu kiểu num1, num2, sum 1 lần luôn nên ta dùng printf
		// như C
		System.out.print("Tổng của " + num1 + " và " + num2 + " là " + sum);

		// cách 2 hay dùng
		System.out.printf("\nTong cua %.2f và %.2f là %.2f", num1, num2, sum);

	}

}
