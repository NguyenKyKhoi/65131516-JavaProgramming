package luituhoc;

interface CoTheBoi {
	void boi();

	default void lapLai() {
		System.out.println("Lặp lại động tác bơi...");
	}
}
