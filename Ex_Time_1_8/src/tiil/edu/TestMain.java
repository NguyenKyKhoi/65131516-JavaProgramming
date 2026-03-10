package tiil.edu;

public class TestMain {

	public static void main(String[] args) {
		Time t1 = new Time(1, 2, 3);
		System.out.println(t1);
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println(t1);
		System.out.println("Giờ: " + t1.getHour());
		System.out.println("Phút: " + t1.getMinute());
		System.out.println("Giây: " + t1.getSecond());
		t1.setTime(23, 59, 58);
		System.out.println(t1);
		System.out.println(t1.nextSecond());
		System.out.println(t1.nextSecond().nextSecond());
		System.out.println(t1.previousSecond());
		System.out.println(t1.previousSecond().previousSecond());
	}

}
