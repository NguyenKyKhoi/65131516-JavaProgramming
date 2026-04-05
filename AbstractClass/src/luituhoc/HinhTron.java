package luituhoc;

class HinhTron extends HinhHoc {
	private double banKinh;

	public HinhTron(String mauSac, double banKinh) {
		super(mauSac);
		this.banKinh = banKinh;
	}

	@Override
	public double tinhDienTich() {
		return Math.PI * banKinh * banKinh;
	}

	@Override
	public double tinhChuVi() {
		return 2 * Math.PI * banKinh;
	}

	@Override
	public void phongTo(double type) {
		this.banKinh *= type;
		System.out.println("Phòng to hình tròn lên " + type + " lần");
	}

	public double tinhDuongKinh() {
		return banKinh * 2;
	}
}
