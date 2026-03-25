package luituhoc;

import java.util.Scanner;

public class XeDien extends XeMay {
	private double congSuatDongCo;

	public double getCongSuatDongCo() {
		return congSuatDongCo;
	}

	public void setCongSuatDongCo(double congSuatDongCo) {
		this.congSuatDongCo = congSuatDongCo;
	}

	public XeDien(String bienSo, int namSanXuat, double giaBan, double congSuatDongCo) {
		super(bienSo, namSanXuat, giaBan);
		this.congSuatDongCo = congSuatDongCo;
	}

	@Override
	public void Nhap(Scanner sc) {
		super.Nhap(sc);
		System.out.println("Công Suất Động Cơ : ");
		congSuatDongCo = sc.nextDouble();
	}

	@Override
	public String toString() {
		super.toString();
		String s = "Công Suất Động Cơ : " + congSuatDongCo;
		return s;
	}
}
