package khoi.tuhoc;

import java.time.LocalDate;

public class Xe {
	private String dongXe;
	private int soChoNgoi;
	private LocalDate ngaySanXuat;
	static double giaSan = 400;

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

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public Xe() {
		super();

	}

	public Xe(String dongXe, int soChoNgoi, LocalDate ngaySanXuat) {
		super();
		this.dongXe = dongXe;
		this.soChoNgoi = soChoNgoi;
		this.ngaySanXuat = ngaySanXuat;
	}

	public double giaBanXe() {
		int cachNam = LocalDate.now().getYear() - ngaySanXuat.getYear();
		if (cachNam > 2) {
			return giaSan * 1.15;
		} else if (cachNam >= 1) {
			return giaSan * 1.3;
		} else {
			return giaSan * 1.5;
		}
	}

	@Override
	public String toString() {
		return "Xe [dongXe=" + dongXe + ", soChoNgoi=" + soChoNgoi + ", ngaySanXuat=" + ngaySanXuat + ", giaBanXe()="
				+ giaBanXe() + "]";
	}

}
