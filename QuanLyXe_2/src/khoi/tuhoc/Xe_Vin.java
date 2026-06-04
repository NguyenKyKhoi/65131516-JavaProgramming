package khoi.tuhoc;

public class Xe_Vin extends Xe {
	private String noiDangKy;

	public String getNoiDangKy() {
		return noiDangKy;
	}

	public void setNoiDangKy(String noiDangKy) {
		this.noiDangKy = noiDangKy;
	}

	public Xe_Vin() {
		super();
	}

	public Xe_Vin(String dongXe, int soChoNgoi, int namSanXuat, String noiDangKy) {
		super(dongXe, soChoNgoi, namSanXuat);
		this.noiDangKy = noiDangKy;
	}

	@Override
	public double GiaLanBanh() {
		double phiDangKy = 0;
		if (getNoiDangKy().toUpperCase().equals("HÀ NỘI")) {
			phiDangKy = 0.12 * GiaBan();
		} else {
			phiDangKy = 0.1 * GiaBan();
		}

		return GiaBan() + phiDangKy;
	}

	@Override
	public String toString() {
		return super.toString() + "Xe_Vin [noiDangKy=" + noiDangKy + "]";
	}

}
