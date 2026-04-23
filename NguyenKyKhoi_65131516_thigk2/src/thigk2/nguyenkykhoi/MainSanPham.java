package thigk2.nguyenkykhoi;

import java.util.ArrayList;
import java.util.Scanner;

//1. tạo danh sách ArrayList dùng foreach kết hợp to String để xuất
//2. thêm mới nhập từ bàn phím rồi dùng add thêm vào ds sản phẩm
//3. Tìm kiếm loại sản phẩm là thực phẩm chức năng và xuất ra

public class MainSanPham {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Tạo danh sách 3 sản phẩm
		ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();

		dsSanPham.add(new SanPham("SP001", "Laptop Gaming G15", "Điện tử", 22500000));
		dsSanPham.add(new SanPham("SP002", "Thuốc bổ máu", "Thực phẩm chức năng", 350000));
		dsSanPham.add(new SanPham("SP003", "Bàn phím cơ K87", "Phụ kiện", 1200000));

		for (var temp : dsSanPham) {
			System.out.println(temp.toString());
		}

		// thêm mới vào ds, thông tin nhập từ bàn phím
		System.out.println("Thêm mới 1 sản phẩm : ");
		System.out.print("Nhập mã sản phẩm : ");
		String masp = sc.nextLine();
		System.out.print("Nhập tên sản phẩm : ");
		String tensp = sc.nextLine();
		System.out.print("Nhập loại sản phẩm : ");
		String loaisp = sc.nextLine();
		System.out.print("Nhập giá sản phẩm : ");
		double giasp = sc.nextDouble();

		SanPham temp = new SanPham(masp, tensp, loaisp, giasp);
		dsSanPham.add(temp);

		// in thông tin
		for (var x : dsSanPham) {
			System.out.println(x.toString());
		}

		// in lại ra màn hình với loại là thực phẩm chức năng
		System.out.println("Loại sản phẩm là thực phẩm chức năng : ");
		for (var y : dsSanPham) {
			if (y.getLoaiSP() == "Thực phẩm chức năng") {
				System.out.print(y.toString());
			}
		}

		sc.close();
	}

}
