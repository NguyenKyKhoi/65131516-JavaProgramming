package khoi.tuhoc;

import java.time.LocalDate;

public abstract class Xe {
	private String dongXe;
	private int soChoNgoi;
	private int namSanXuat;
	static double giaSan = 300;

	public String getDongXe() {
		return dongXe;
	}

	public void setDongXe(String dongXe) {
		this.dongXe = dongXe;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public Xe() {
	}

	public Xe(String dongXe, int soChoNgoi, int namSanXuat) {
		super();
		this.dongXe = dongXe;
		this.soChoNgoi = soChoNgoi;
		this.namSanXuat = namSanXuat;
	}

	public double GiaBan() {
		int namHienTai = LocalDate.now().getYear();
		if (getNamSanXuat() == namHienTai) {
			return giaSan * 1.3;
		} else {
			return giaSan;
		}
	}

	public abstract double GiaLanBanh();

	@Override
	public String toString() {
		return "Xe [dongXe=" + dongXe + ", soChoNgoi=" + soChoNgoi + ", namSanXuat=" + namSanXuat + ", GiaBan()="
				+ GiaBan() + ", GiaLanBanh()=" + GiaLanBanh() + "]";
	}

}
