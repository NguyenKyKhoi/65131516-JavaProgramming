package tiil.edu;

public class HelloWorld {
	public static void main(String[] args) {

		// Bai 1 thay doi thong diep
		System.out.println("Ho va ten : Nguyen Ky Khoi");
		System.out.println("MSSV : 65131516");

		// Bai 2 In hinh don gian
		System.out.println("   *   ");
		System.out.println("  ***  ");
		System.out.println(" ***** ");
		System.out.println("*******");

		// Bai 3 Tinh toan don gian
		System.out.println("5 + 5 = " + (5 + 5));
		System.out.println("5 - 5 = " + (5 - 5));
		System.out.println("5 * 5 = " + (5 * 5));
		System.out.println("5 / 5 = " + (5 / 5));
		System.out.println("5 % 5 = " + (5 % 5));

		// Bai 4 Code va chay cac vi du hello word
		String greeting = """
				====================
				HELLO, MODERN JAVA!
				====================
				by Mai Cường Thọ NTU
				""";
		System.out.println(greeting);

		var message = "Hello, World with var!";
		var number = 42;
		var list = java.util.List.of("Java", "Modern", "Features");

		System.out.println(message);
		System.out.println("Number: " + number);
		System.out.println("List: " + list);
	}
}
