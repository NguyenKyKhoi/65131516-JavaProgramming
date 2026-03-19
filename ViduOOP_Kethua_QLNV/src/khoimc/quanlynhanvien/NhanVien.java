package khoimc.quanlynhanvien;

public class NhanVien {
	// thuoc tinh
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	// Ham tao
//	public NhanVien() {
//		
//	}

	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}

	public NhanVien() {
		super();
	}

	public double tinhLuong() {
		return luongCoBan;
	}

	@Override
	public String toString() {
		String chuoiXuat = "";
		chuoiXuat = chuoiXuat + "Ma NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHo ten: " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLuong co ban: " + this.luongCoBan;
		return chuoiXuat;
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}

	public void hienThiThongTin() {
		System.out.println("Ma NV: " + maNV);
		System.out.println("Ho va Ten: " + hoTen);
		System.out.println("Luong co ban: " + luongCoBan);
	}

}
