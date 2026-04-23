package thigk2.nguyenkykhoi;

import java.util.ArrayList;
import java.util.Scanner;

//1. tạo danh sách ArrayList dùng foreach kết hợp to String để xuất

public class MainSanPham {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Tạo danh sách 3 sản phẩm
		ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();

		dsSanPham.add(new SanPham("SP001", "Laptop Gaming G15", "Điện tử", 22500000));
		dsSanPham.add(new SanPham("SP002", "Chuột không dây M331", "Phụ kiện", 350000));
		dsSanPham.add(new SanPham("SP003", "Bàn phím cơ K87", "Phụ kiện", 1200000));

		for (var temp : dsSanPham) {
			System.out.println(temp.toString());
		}

	}

}
