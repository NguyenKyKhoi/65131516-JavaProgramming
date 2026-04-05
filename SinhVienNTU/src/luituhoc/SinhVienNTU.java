package luituhoc;

public class SinhVienNTU {
	private String hoVaTen;
	private String lop;

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public SinhVienNTU(String hoVaTen, String lop) {
		super();
		this.hoVaTen = hoVaTen;
		this.lop = lop;
	}

	public static String TEN_TRUONG = "ĐẠI HỌC NHA TRANG";

	public static void sayHi() {
		System.out.println("Hi, I'm an NTU Student");
	}

	public void sayHello() {
		System.out.println("Helloooo, I'm an NTU Student: \nTên là : " + hoVaTen + " \nLớp: " + lop);
	}
}
