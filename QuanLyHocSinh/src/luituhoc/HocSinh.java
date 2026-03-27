package luituhoc;

public class HocSinh {

	private String tenHS;
	private int tuoiHS;
	private String lopHS;

	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public int getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(int tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return lopHS;
	}

	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}

	public HocSinh() {
		super();
	}

	public HocSinh(String tenHS, int tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}

	@Override
	public String toString() {
		String chuoiXuat;
		chuoiXuat = "Họ và tên" + tenHS;
		chuoiXuat = chuoiXuat + " Tuổi HS: " + tuoiHS;
		chuoiXuat = chuoiXuat + " Lớp HS: " + lopHS;
		return chuoiXuat;
		// return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS
		// + "]";
	}

}
