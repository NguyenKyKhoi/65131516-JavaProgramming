package till.edu;

public class run {

	public static void main(String[] args) {

		ChuNhat cn1 = new ChuNhat();
		ChuNhat cn2 = new ChuNhat(20, 15);
		ChuNhat hv = new ChuNhat(20, 20);

		double cn1_dai = cn1.getDai();
		double cn1_rong = cn1.getRong();

		// in chieu dai, rong
		System.out.println("Hình chữ nhật có chiều dài là : " + cn1_dai);
		System.out.println("Hình chữ nhật có chiều rộng là : " + cn1_rong);

		// thay doi dai, rong
		cn1.setDai(50);
		System.out.println("Chiều dài sau khi thay đổi");
		cn1_dai = cn1.getDai();
		cn1_rong = cn1.getRong();
		System.out.println("Hình chữ nhật có chiều dài là : " + cn1_dai);
		System.out.println("Hình chữ nhật có chiều rộng là : " + cn1_rong);

		// sử dụng phương thức toString
		System.out.println(cn1.toString());

	}

}
