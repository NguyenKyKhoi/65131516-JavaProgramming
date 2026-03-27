package luituhoc;

import java.util.ArrayList;
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

		System.out.print("Nhập số lượng học sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<HocSinh> dsHocSinh = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập học sinh thứ " + (i + 1) + "\n");
			System.out.print("Tên Học Sinh: ");
			String tenhs = sc.nextLine();
			System.out.print("Lớp Học Sinh: ");
			String lophs = sc.nextLine();
			System.out.print("Tuổi Học Sinh: ");
			int tuoihs = sc.nextInt();
			sc.nextLine();

			HocSinh temp = new HocSinh(tenhs, tuoihs, lophs);
			dsHocSinh.add(temp);
		}

		for (var hs : dsHocSinh) {
			System.out.println(hs.toString());
		}

		System.out.println("=================================");

		for (int i = 0; i < dsHocSinh.size(); i++) {
			System.out.println("Học Sinh Thứ " + (i + 1));
			System.out.print("Tên Học Sinh : " + dsHocSinh.get(i).getTenHS() + "\n");
			System.out.println("Lớp Học Sinh: " + dsHocSinh.get(i).getLopHS());
			System.out.print("Tuổi Học Sinh : " + dsHocSinh.get(i).getTuoiHS() + "\n");
			System.out.println("===============================");
		}

		System.out.println("Thêm Học Sinh Mới: ");

		System.out.print("Tên Học Sinh: ");
		String tenhs = sc.nextLine();
		System.out.print("Lớp Học Sinh: ");
		String lophs = sc.nextLine();
		System.out.print("Tuổi Học Sinh: ");
		int tuoihs = sc.nextInt();
		sc.nextLine();

		HocSinh temp = new HocSinh(tenhs, tuoihs, lophs);
		dsHocSinh.add(temp);

		for (var hs : dsHocSinh) {
			System.out.println(hs.toString());
		}

//		for(int i = 0; i < n; i++) {
//			System.out.println(dsHocSinh.get(i).toString());
//		}

		for (int i = 0; i < n; i++) {
			HocSinh hs = dsHocSinh.get(i);
			if (hs.getTenHS() == "Hoa") {
				dsHocSinh.remove(hs);
				break;
			}
		}

		System.out.println("======================");
		System.out.println("Xóa học sinh theo tên : ");
		System.out.print("Nhập tên cần xóa: ");
		String tenCanXoa = sc.nextLine();

//		int flag = 0;
//		for (int i = dsHocSinh.size() - 1; i >= 0; i--) {
//			if (dsHocSinh.get(i).getTenHS().equalsIgnoreCase(tenCanXoa)) {
//				dsHocSinh.remove(i);
//				System.out.println("Đã xóa đối tượng ở vị trí số " + i);
//				flag = 1;
//			}
//		}
//		
//		if(flag == 0) {
//			System.out.println("Không tìm thấy đối tượng như vậy");
//		}

		// xóa theo tên từng ký tự
//		for (int i = dsHocSinh.size() - 1; i >= 0; i--) {
//			if (dsHocSinh.get(i).getTenHS().endsWith(tenCanXoa)) {
//				dsHocSinh.remove(i);
//				System.out.println("Đã xóa đối tượng ở vị trí số " + i);
//			}
//		}
//
//		for (var hs : dsHocSinh) {
//			System.out.println(hs.toString());
//		}

		sc.close();
	}

}
