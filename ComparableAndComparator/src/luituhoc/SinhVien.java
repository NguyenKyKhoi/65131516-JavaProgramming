package luituhoc;

class SinhVien implements Comparable<SinhVien> {
	private String maSV;
	private String hoTen;
	private double diemTB;

	public SinhVien(String maSV, String hoTen, double diemTB) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public int compareTo(SinhVien other) {
		return Double.compare(other.diemTB, this.diemTB);
	}

	@Override
	public String toString() {
		return maSV + " - " + hoTen + " - " + diemTB;
	}

	public String getMaSV() {
		return maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getDiemTB() {
		return diemTB;
	}

}
