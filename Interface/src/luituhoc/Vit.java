package luituhoc;

class Vit extends DongVat implements CoTheBay, CoTheChay, CoTheBoi {
	public Vit(String ten, int tuoi) {
		super(ten, tuoi);
	}

	@Override
	public void an() {
		System.out.println("Đang mổ thóc...");
	}

	@Override
	public void bay() {
		System.out.println(ten + " Đang bay thấp...");
	}

	@Override
	public void boi() {
		System.out.println(ten + " Đang bơi trên mặt nước...");
	}

	@Override
	public void chay() {
		System.out.println(ten + " Đang chạy lạch bạch...");
	}

	@Override
	public void chay(double tocDo) {
		System.out.println(ten + " Đang chạy với tốc độ " + tocDo + " km/h");
	}

	// Có thể sử dụng phương thức mặc định từ interface
	public void hienThiTatCaKhNang() {
		System.out.println("\n" + ten + " có thể:");
		bay();
		boi();
		chay();
		haCanh(); // Từ CoTheBay interface
		nghiNgoi(); // Từ CoTheChay interface
	}
}
