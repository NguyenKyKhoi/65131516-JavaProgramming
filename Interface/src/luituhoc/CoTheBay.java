package luituhoc;

interface CoTheBay {
	int SO_CANH = 2;

	void bay();

	default void haCanh() {
		System.out.println("Đang hạ cánh ...");
	}

	static void thongTinVeBay() {
		System.out.println("Bay là di chuyển trong không trung");
	}
}
