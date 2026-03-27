package luituhoc;

import java.util.Scanner;

public class QuanLyHocSinh {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Tạo mới 2 học sinh");
		HocSinh hs1 = new HocSinh();

		hs1.setTenHS("Nguyễn Kỳ Lùi");
		hs1.setTuoiHS(18);
		hs1.setLopHS("12A2");

		System.out.print("Nhập tên học sinh: ");
		String ten = sc.nextLine();
		System.out.print("Nhập lớp học sinh: ");
		String lop = sc.nextLine();
		System.out.print("Nhập tuổi học sinh: ");
		int tuoi = sc.nextInt();

		HocSinh hs2 = new HocSinh(ten, tuoi, lop);

		System.out.println(hs1);
		System.out.println(hs2);

	}

}
