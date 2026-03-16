package ntu.thomc;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();

		Scanner banPhim = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("a[" + i + "] = ");
			Integer temp = banPhim.nextInt();
			dsSoNguyen.add(temp);
		}

		System.out.println("In các phần tử trong mảng : ");
		for (int i = 0; i < dsSoNguyen.size(); i++) {
			Integer temp = dsSoNguyen.get(i);
			System.out.print(temp + " ");
		}

		System.out.println("\n");
		for (Integer x : dsSoNguyen) {
			System.out.print(x + " ");
		}

		Integer sum = 0;
		for (Integer x : dsSoNguyen) {
			if (x % 2 == 0) {
				sum++;
			}
		}
		System.out.println("Số phần tử chia hết cho 2 là : " + sum);

	}

}
