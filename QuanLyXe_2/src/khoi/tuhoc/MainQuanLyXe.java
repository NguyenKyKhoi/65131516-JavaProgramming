package khoi.tuhoc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainQuanLyXe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập số lượng Xe n : ");
			n = sc.nextInt();
		} while (!(0 < n && n < 20));

		ArrayList<Xe> dsXe = new ArrayList<Xe>(n);

		for (int i = 0; i < n; i++) {
			System.out.print("Xe thứ " + (i + 1) + "\n");
			System.out.print("Chọn loại Xe (1)XeKia (0)Xe_Vin : ");
			int chon = sc.nextInt();
			sc.nextLine();
			if (chon == 1) {
				System.out.print("Nhập Dòng Xe (Sedan, Hatchback, SUV,..): ");
				String dongXe = sc.nextLine();
				System.out.print("Nhập Số Chỗ Ngồi : ");
				int soChoNgoi = sc.nextInt();
				System.out.print("Nhập Năm Sản Xuất : ");
				sc.nextLine();
				int namSanXuat = sc.nextInt();
				sc.nextLine();
				System.out.print("Xe Có Nhập Khẩu Không (True/False): ");
				boolean laNhapKhau = sc.nextBoolean();
				sc.nextLine();
				XeKia temp = new XeKia(dongXe, soChoNgoi, namSanXuat, laNhapKhau);
				dsXe.add(temp);
			} else if (chon == 0) {
				System.out.print("Nhập Dòng Xe (Sedan, Hatchback, SUV,..): ");
				String dongXe = sc.nextLine();
				System.out.print("Nhập Số Chỗ Ngồi : ");
				int soChoNgoi = sc.nextInt();
				sc.nextLine();
				System.out.print("Nhập Năm Sản Xuất : ");
				int namSanXuat = sc.nextInt();
				sc.nextLine();
				System.out.print("Nơi Đăng Ký : ");
				String noiDangKy = sc.nextLine();
				Xe_Vin temp = new Xe_Vin(dongXe, soChoNgoi, namSanXuat, noiDangKy);
				dsXe.add(temp);
			} else {
				System.out.println("Không có option đó friend");
				i--;
			}
		}

		System.out.println("Xuất Thông Tin Sau Khi Sắp Xếp Chiều Tăng Dần Của Năm Sản Xuất------------------");
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (dsXe.get(i).getNamSanXuat() > dsXe.get(j).getNamSanXuat()) {
					var temp = dsXe.get(i);
					dsXe.set(i, dsXe.get(j));
					dsXe.set(j, temp);
				}
			}
		}

		for (var temp : dsXe) {
			System.out.println(temp.toString());
		}

		System.out.println("Tính và in ra giá lăn bánh trung bình của các xe VINFAST có số chỗ ngồi là x");
		System.out.print("Nhập số chỗ ngồi muốn tính : ");
		int x = sc.nextInt();
		double sum = 0;
		int dem = 0;
		for (var temp : dsXe) {
			if (temp instanceof Xe_Vin a && a.getSoChoNgoi() == x) {
				sum += a.GiaLanBanh();
				dem++;
			}
		}

		System.out.print("Giá Lăn Bánh Trung Bình Của Xe VINFAST : " + (sum / dem));

		System.out.println("Đếm và In ra số lượng xe Kia nhập khẩu trong năm nay");
		int count = 0;
		for (var temp : dsXe) {
			if (temp instanceof XeKia a && a.getLaNhapKhau() && a.getNamSanXuat() == LocalDate.now().getYear()) {
				count++;
			}
		}

		System.out.println("Số Lượng Xe Kia Nhập Khẩu Trong Năm Nay : " + count);
	}

}
