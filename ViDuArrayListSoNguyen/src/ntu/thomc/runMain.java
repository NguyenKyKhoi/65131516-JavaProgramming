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

	}

}
