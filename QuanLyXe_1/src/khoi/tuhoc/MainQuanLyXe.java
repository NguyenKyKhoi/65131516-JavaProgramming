package khoi.tuhoc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainQuanLyXe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập Danh Sách n : ");
			n = sc.nextInt();
		} while (!(0 < n && n < 20));
		sc.nextLine();
		ArrayList<Xe_vinfast> dsXeVin = new ArrayList<Xe_vinfast>(n);
		DateTimeFormatter temp = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập xe thứ nhất " + (i + 1));

			System.out.print("Nhập dòng xe : ");
			String dongXe = sc.nextLine();

			System.out.print("Nhập số chỗ ngồi : ");
			int soChoNgoi = sc.nextInt();
			sc.nextLine();

			System.out.print("Ngày Sản Xuất : ");
			String ngaySX = sc.nextLine();
			LocalDate ngaySanXuat = LocalDate.parse(ngaySX, temp);

			System.out.print("Nơi Đăng Ký : ");
			String noiDangKy = sc.nextLine();

			System.out.print("Phí Trước Bạ : ");

			double phiTruocBa = sc.nextDouble();
			sc.nextLine();

			Xe_vinfast temps = new Xe_vinfast(dongXe, soChoNgoi, ngaySanXuat, noiDangKy, phiTruocBa);
			dsXeVin.add(temps);
		}

		System.out.println("Xuất danh sách sau khi nhập =============================");
		for (var x : dsXeVin) {
			System.out.println(x.toString());
		}

		for (int i = 0; i < dsXeVin.size() - 1; i++) {
			for (int j = i + 1; j < dsXeVin.size(); j++) {
				if (dsXeVin.get(i).TinhGiaLanBanh() > dsXeVin.get(j).TinhGiaLanBanh()) {
					var y = dsXeVin.get(i);
					dsXeVin.set(i, dsXeVin.get(j));
					dsXeVin.set(j, y);
				}
			}
		}

		System.out.println("Xuất danh sách sau khi sắp xếp =============================");
		for (var x : dsXeVin) {
			System.out.println(x.toString());
		}

		System.out.println("Thêm 1 đối tượng mới vào danh sách");
		System.out.print("Nhập dòng xe : ");
		String dongXe = sc.nextLine();

		System.out.print("Nhập số chỗ ngồi : ");
		int soChoNgoi = sc.nextInt();
		sc.nextLine();

		System.out.print("Ngày Sản Xuất : ");
		String ngaySX = sc.nextLine();
		LocalDate ngaySanXuat = LocalDate.parse(ngaySX, temp);

		System.out.print("Nơi Đăng Ký : ");
		String noiDangKy = sc.nextLine();

		System.out.print("Phí Trước Bạ : ");

		double phiTruocBa = sc.nextDouble();
		sc.nextLine();

		Xe_vinfast temps = new Xe_vinfast(dongXe, soChoNgoi, ngaySanXuat, noiDangKy, phiTruocBa);
		System.out.print("Thêm vào vị trí  : ");
		int p = sc.nextInt();
		sc.nextLine();
		dsXeVin.add(p, temps);

		System.out.println("Danh sách sau khi thêm 1 đối tượng mới vào vị trí " + p);
		for (var x : dsXeVin) {
			System.out.println(x.toString());
		}

		System.out.println("Xóa Dòng Xe x được nhập từ bàn phím");
		String x = sc.nextLine();
		x = x.toUpperCase();
		for (int i = 0; i < dsXeVin.size(); i++) {
			if (dsXeVin.get(i).getDongXe().toUpperCase().equals(x)) {
				dsXeVin.remove(i);
				i--;
			}
		}

		System.out.println("Danh sách sau khi xóa các dòng xe " + x);
		for (var y : dsXeVin) {
			System.out.println(y.toString());
		}

		sc.close();
	}

}
