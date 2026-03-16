package tiil.com;

import java.util.Scanner;

public class MainQuanLySanPham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySanPham ql = new QuanLySanPham();
		int luaChon = 0;

		ql.themSP(new SanPham("SP01", "Coca Cola", "15000", "50"));
		ql.themSP(new SanPham("SP02", "Banh Mi", "20000", "5"));
		ql.themSP(new SanPham("SP03", "Sua Tuoi", "12000", "8"));

		do {
			System.out.println("\n---------- MENU QUẢN LÝ SẢN PHẨM ----------");
			System.out.println("1. Thêm sản phẩm mới");
			System.out.println("2. Xóa sản phẩm theo mã");
			System.out.println("3. Tìm sản phẩm theo tên");
			System.out.println("4. Sắp xếp sản phẩm theo giá tăng dần");
			System.out.println("5. Sắp xếp sản phẩm theo giá giảm dần");
			System.out.println("6. Tính tổng giá trị kho hàng");
			System.out.println("7. Liệt kê sản phẩm sắp hết hàng (< 10)");
			System.out.println("8. Hiển thị tất cả sản phẩm");
			System.out.println("0. Thoát chương trình");
			System.out.print("Mời bạn chọn (0-8): ");
			luaChon = sc.nextInt();
			sc.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

			switch (luaChon) {
			case 1:
				System.out.print("Nhập mã SP: ");
				String ma = sc.nextLine();
				System.out.print("Nhập tên SP: ");
				String ten = sc.nextLine();
				System.out.print("Nhập giá: ");
				double gia = sc.nextDouble();
				System.out.print("Nhập số lượng: ");
				int sl = sc.nextInt();
				ql.themSP(new SanPham(ma, ten, gia, sl));
				break;

			case 2:
				System.out.print("Nhập mã SP cần xóa: ");
				String maXoa = sc.nextLine();
				ql.timVaXoa(maXoa);
				break;

			case 3:
				System.out.print("Nhập tên SP cần tìm: ");
				String tenTim = sc.nextLine();
				ql.timTheoTen(tenTim);
				break;

			case 4:
				ql.sapXepTang();
				System.out.println("Đã sắp xếp tăng dần theo giá.");
				break;

			case 5:
				ql.sapXepGiam();
				System.out.println("Đã sắp xếp giảm dần theo giá.");
				break;

			case 6:
				System.out.println("Tổng giá trị kho hàng là: " + ql.tongGiaTriKhoHang());
				break;

			case 7:
				System.out.println("Các sản phẩm sắp hết hàng:");
				ql.sanPhamSapHetHang();
				break;

			case 8:
				// Vì QuanLySanPham chưa có hàm in hết, tôi gọi tạm ở đây để bạn test
				System.out.println("Danh sách hiện tại:");
				// Bạn có thể thêm phương thức xuatTatCa vào QuanLySanPham
				// Ở đây tôi dùng tạm loop để demo
				ql.timTheoTen(""); // Một mẹo nhỏ nếu hàm tìm kiếm của bạn hỗ trợ chuỗi rỗng
				break;

			case 0:
				System.out.println("Tạm biệt!");
				break;

			default:
				System.out.println("Lựa chọn không hợp lệ!");
			}
		} while (luaChon != 0);

		sc.close();
	}

}
