package khoi.tuhoc;

public class XeKia extends Xe {
	private boolean laNhapKhau;

	public boolean getLaNhapKhau() {
		return laNhapKhau;
	}

	public void setLaNhapKhau(boolean laNhapKhau) {
		this.laNhapKhau = laNhapKhau;
	}

	public XeKia() {
		super();
	}

	public XeKia(String dongXe, int soChoNgoi, int namSanXuat, boolean laNhapKhau) {
		super(dongXe, soChoNgoi, namSanXuat);
		this.laNhapKhau = laNhapKhau;
	}

	@Override
	public double GiaLanBanh() {
		double thueNhapKhau = 0;
		if (getLaNhapKhau() && getSoChoNgoi() < 5) {
			thueNhapKhau = 0.1 * GiaBan();
		} else if (getLaNhapKhau() && getSoChoNgoi() >= 5) {
			thueNhapKhau = 0.2 * GiaBan();
		}

		return GiaBan() + thueNhapKhau;
	}

	@Override
	public String toString() {
		return super.toString() + "XeKia [laNhapKhau=" + laNhapKhau + "]";
	}

}
