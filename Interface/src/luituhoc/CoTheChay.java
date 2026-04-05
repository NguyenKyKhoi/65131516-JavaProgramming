package luituhoc;

interface CoTheChay {
	void chay();

	void chay(double tocDo);

	default void nghiNgoi() {
		System.out.println("Nghỉ ngơi sau khi chạy");
	}
}
