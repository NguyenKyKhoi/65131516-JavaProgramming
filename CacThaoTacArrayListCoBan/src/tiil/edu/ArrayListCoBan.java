package tiil.edu;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCoBan {

	public static void main(String[] args) {
		System.out.println("=== ARRAYLIST CƠ BẢN - MINH HỌA CÁC PHƯƠNG THỨC ===\n");

		// 1. Khai báo ArrayList với Generics
		List<String> danhSachTen = new ArrayList<>();

		// 2. Thêm phần tử - add()
		System.out.println("--- THÊM PHẦN TỬ ---");
		danhSachTen.add("Nguyễn Văn A");
		danhSachTen.add("Trần Thị B");
		danhSachTen.add("Lê Văn C");

		// Thêm tại vị trí cụ thể - add(index, element)
		danhSachTen.add(1, "Phạm Thị D");

		System.out.println("Danh sách sau khi thêm: ");

		// 3. Lấy kích thước
		System.out.println("\n--- Kích Thước ---");
		System.out.println("Số phần tử : " + danhSachTen.size());

	}

}
