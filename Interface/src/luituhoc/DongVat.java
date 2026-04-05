package luituhoc;

abstract class DongVat {
	protected String ten;
	protected int tuoi;

	public DongVat(String ten, int tuoi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public abstract void an();

	public void ngu() {
		System.out.println(ten + " Đang ngủ...");
	}

	@Override
	public String toString() {
		return "DongVat [ten=" + ten + ", tuoi=" + tuoi + "]";
	}

}
