package luituhoc;

abstract class HinhHoc {
	protected String mauSac;

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public HinhHoc(String mauSac) {
		super();
		this.mauSac = mauSac;
	}

	public abstract double tinhDienTich();

	public abstract double tinhChuVi();

	public abstract void phongTo(double type);

	@Override
	public String toString() {
		return "HinhHoc [mauSac=" + mauSac + ", tinhDienTich()=" + tinhDienTich() + ", tinhChuVi()=" + tinhChuVi()
				+ "]";
	}

}
