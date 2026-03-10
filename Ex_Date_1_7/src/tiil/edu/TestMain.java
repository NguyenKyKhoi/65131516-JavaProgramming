package tiil.edu;

public class TestMain {

	public static void main(String[] args) {
		Date d1 = new Date(1, 2, 2014);
		System.out.println(d1);
		d1.setMonth(12);
		d1.setDay(9);
		d1.setYear(2099);
		System.out.println(d1);
		System.out.println("Tháng: " + d1.getMonth());
		System.out.println("Ngày: " + d1.getDay());
		System.out.println("Năm: " + d1.getYear());
		d1.setDate(3, 4, 2016);
		System.out.println(d1);

	}

}
