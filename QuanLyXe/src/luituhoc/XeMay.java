package luituhoc;

import java.util.Scanner;

public class XeMay {
	private String bienSo;
	private int namSanXuat;
	private double giaBan;
	final int thoiGian = 10;

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public XeMay() {
	}

	public XeMay(String bienSo, int namSanXuat, double giaBan) {
		this.bienSo = bienSo;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
	}

	public void Nhap(Scanner sc) {
		System.out.println("--- Nhập Thông Tin Xe ---");
		System.out.print("Biển Số : ");
		bienSo = sc.toString();
		System.out.println("Năm Sản Xuất : ");
		namSanXuat = sc.nextInt();
		System.out.println("Giá Bán : ");
		giaBan = sc.nextDouble();
	}

	public String toString() {
		String s = "Biển Số : " + bienSo + " Năm sản xuất : " + namSanXuat + " Giá Bán : " + giaBan + " ";
		return s;
	}

	public double thoiGianSuDung(int namSanXuat) {
		return thoiGian - (2026 - namSanXuat);
	}

}
