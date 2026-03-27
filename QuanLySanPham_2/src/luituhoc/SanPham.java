package luituhoc;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanPham(String tenSp, double donGia, double giamGia) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public double getThueNhapKhau(double donGia) {
		return donGia * 0.1;
	}

	public void Nhap(Scanner sc) {
		System.out.println("Tên sản phẩm: ");
		tenSp = sc.nextLine();
		System.out.println("Đơn giá: ");
		donGia = sc.nextDouble();
		System.out.println("Giảm giá: ");
		giamGia = sc.nextDouble();
	}

	public void Xuat() {
		System.out.println("Thông tin sản phẩm: ");
		System.out.print("Tên sản phẩm: " + tenSp);
		System.out.print("Đơn giá: " + donGia);
		System.out.print("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau(donGia));

	}

}
