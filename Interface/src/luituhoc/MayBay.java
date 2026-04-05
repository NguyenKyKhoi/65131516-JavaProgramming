package luituhoc;

class MayBay implements CoTheBay {
	private String ten;
	private String hangSanXuat;

	public MayBay(String ten, String hangSanXuat) {
		super();
		this.ten = ten;
		this.hangSanXuat = hangSanXuat;
	}

	@Override
	public void bay() {
		System.out.println(ten + " Đang bay trên bầu trời");
	}

	// có thể override phương thức mặc định
	@Override
	public void haCanh() {
		System.out.println(ten + " đang hạ cánh tại sân bay...");
	}

	@Override
	public String toString() {
		return "MayBay [ten=" + ten + ", hangSanXuat=" + hangSanXuat + ", soCanh= " + CoTheBay.SO_CANH + "]";
	}

}
