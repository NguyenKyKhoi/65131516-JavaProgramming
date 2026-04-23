package thigk2.nguyenkykhoi;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaSP;

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public double getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}

	public SanPham(String maSP, String tenSP, String loaiSP, double giaSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaSP = giaSP;
	}

	@Override
	public String toString() {
		return "SanPham maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + ", giaSP=" + giaSP;
	}

}
