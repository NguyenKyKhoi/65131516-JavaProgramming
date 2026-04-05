package luituhoc;

class ChimCanhCut extends DongVat implements CoTheBoi {
	public ChimCanhCut(String ten, int tuoi) {
		super(ten, tuoi);
	}

	@Override
	public void an() {
		System.out.println(ten + " đang ăn cá...");
	}

	@Override
	public void boi() {
		System.out.println(ten + " đang bơi dưới nước rất giỏi!");
	}

	// Override phương thức mặc định
	@Override
	public void lapLai() {
		System.out.println(ten + " lặp lại động tác bơi rất dễ thương!");
	}
}
