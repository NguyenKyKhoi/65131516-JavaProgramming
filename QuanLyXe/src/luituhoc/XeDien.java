package luituhoc;

import java.util.Scanner;

public class XeDien extends XeMay {
	private double congSuatDongCo;
	final int thoiGian = 10;

	public double getCongSuatDongCo() {
		return congSuatDongCo;
	}

	public void setCongSuatDongCo(double congSuatDongCo) {
		this.congSuatDongCo = congSuatDongCo;
	}

	public XeDien() {

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
		sc.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "Công Suất Động Cơ : " + congSuatDongCo;
	}

	@Override
	public double thoiGianSuDung() {
		int namHienTai = 2026;
		int conlai = thoiGian - (namHienTai - getNamSanXuat());

		return conlai > 0 ? conlai : 0;
	}
}
