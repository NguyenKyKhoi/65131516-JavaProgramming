package khoi.tuhoc;

import java.time.LocalDate;

public class Xe_vinfast extends Xe implements Phi {
	private String noiDangKy;
	private double phiTruocBa;

	public String getNoiDangKy() {
		return noiDangKy;
	}

	public void setNoiDangKy(String noiDangKy) {
		this.noiDangKy = noiDangKy;
	}

	public double getPhiTruocBa() {
		return phiTruocBa;
	}

	public void setPhiTruocBa(double phiTruocBa) {
		this.phiTruocBa = phiTruocBa;
	}

	public Xe_vinfast() {
		super();
	}

	public Xe_vinfast(String dongXe, int soChoNgoi, LocalDate ngaySanXuat, String noiDangKy, double phiTruocBa) {
		super(dongXe, soChoNgoi, ngaySanXuat);
		this.noiDangKy = noiDangKy;
		this.phiTruocBa = phiTruocBa;
	}

	@Override
	public double TinhPhiTruocBa() {
		return phiTruocBa * giaBanXe();
	}

	public double TinhGiaLanBanh() {
		double phiDangKy = 0;
		if (noiDangKy.toUpperCase().equals("HÀ NỘI")) {
			phiDangKy = 0.12 * giaBanXe();
		} else {
			phiDangKy = 0.1 * giaBanXe();
		}

		return giaBanXe() + TinhPhiTruocBa() + phiDangKy;
	}

	@Override
	public String toString() {
		return super.toString() + "Xe_vinfast [noiDangKy=" + noiDangKy + ", phiTruocBa=" + phiTruocBa
				+ ", TinhPhiTruocBa()=" + TinhPhiTruocBa() + ", TinhGiaLanBanh()=" + TinhGiaLanBanh() + "]";
	}

}
