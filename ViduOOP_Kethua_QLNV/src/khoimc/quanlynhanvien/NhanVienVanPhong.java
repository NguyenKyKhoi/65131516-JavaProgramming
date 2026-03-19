package khoimc.quanlynhanvien;

public class NhanVienVanPhong extends NhanVien {
	private double soGioLamThem;
	private double luongThemMoiGio;

	// ham tao
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}

	@Override
	public double tinhLuong() {
		return super.getLuongCoBan() + soGioLamThem * luongThemMoiGio;
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So gio lam them : " + soGioLamThem);
		System.out.println("Luong cho moi gio lam them : " + luongThemMoiGio);
		System.out.println("Luong duoc nhan : " + tinhLuong());
	}

	@Override
	public String toString() {
		String chuoiXuat = super.toString();
		chuoiXuat = chuoiXuat + "\nSo gio lam them : " + soGioLamThem;
		chuoiXuat = chuoiXuat + "\nLuong cho moi gio lam them : " + luongThemMoiGio;
		chuoiXuat = chuoiXuat + "\nLuong duoc nhan : " + tinhLuong();
		return chuoiXuat;
//		return "NhanVien [maNV="+ maNV +", hoTen=" + hoTen + ", LuongCoBan=" + luongCoBan +
	}

	// cac phuong thuc khac

	// getter setter
}
