package tiil.edu;

import java.util.Scanner;

public class CacViDu_Bai2 {
	public static void main(String[] args) {

		byte tuoi = 25;
		short soLuong = 1000;
		int danSo = 1000000;
		long tongDanSo = 7800000000L;

		float diemTrungBinh = 8.5f;
		double pi = 3.141592653589793;
		double canBacHai = Math.sqrt(25);

		char kyTu = 'A';
		char kyTuUnicode = '\u0041';
		char kyTuSo = 65;
		char kyTuDacBiet = '\n';

		boolean isJavaFun = true;
		boolean isFishTasty = false;
		boolean isAdult = (tuoi >= 18);

		// String - Chuỗi ký tự
		String hoTen = "Nguyễn Văn A";
		String email = "example@gmail.com";

		// Array - Mảng
		int[] mangSo = { 1, 2, 3, 4, 5 };
		String[] mangTen = { "An", "Bình", "Châu" };

		// Class - Lớp đối tượng
		Scanner scanner = new Scanner(System.in);
		Date ngayHienTai = new Date();

		// Cách 1: Khai báo riêng lẻ
		int age;
		double salary;
		String name;

		// Cách 2: Khai báo và khởi tạo
		int age = 25;
		double salary = 1500.50;
		String name = "John";

		// Cách 3: Khai báo nhiều biến cùng kiểu
		int x = 5, y = 10, z = 15;
		String firstName = "John", lastName = "Doe";

		// Cách 4: Sử dụng var (Java 10+)
		var message = "Hello World"; // String
		var count = 10; // int
		var price = 9.99; // double

		// ĐÚNG:
		int age; // camelCase cho biến
		double annualSalary; // rõ ràng, có nghĩa
		String firstName; // phân biệt từ
		final double PI = 3.14; // UPPER_CASE cho hằng số
		String $currency = "USD"; // $ và _ được phép

		// Sử dụng final để khai báo hằng số
		final double PI = 3.14159;
		final int MAX_USERS = 1000;
		final String COMPANY_NAME = "TechCorp";

		// Hằng số phải được khởi tạo ngay
		final int MIN_AGE = 18;

		// Tự động chuyển kiểu nhỏ → lớn
		int myInt = 9;
		double myDouble = myInt;

		byte myByte = 100;
		int myInt2 = myByte;

		// Thủ công chuyển kiểu lớn → nhỏ
		double myDouble = 9.78;
		int myInt = (int) myDouble; // 9 (mất phần thập phân)

		long bigNumber = 100000L;
		int smallNumber = (int) bigNumber;

		// String -> int
		String strNumber = "123";
		int number = Integer.parseInt(strNumber);

		// int -> String
		int num = 456;
		String str = String.valueOf(num);
		String str2 = Integer.toString(num);

		// char -> int
		char ch = 'A';
		int ascii = (int) ch; // 65

		// boolean -> String
		boolean flag = true;
		String boolStr = Boolean.toString(flag);

		
		System.out.println(a PT b);   // 1: Chia lấy dư   (PT là ký tự phần trăm trên bàn phím)
		
		//Bai Tap 1: Khai bao va tinh toan
		// 1. Khai báo các biến
        int a = 15;
        int b = 4;
        double c = 3.5;
        
        // 2. Tính toán
        int tong = a + b;
        double thuong = a / c;
        int phanDu = a 
        
        // 3. In kết quả
        System.out.println("Tổng: " + tong);
        System.out.println("Thương: " + thuong);
        System.out.println("Phần dư: " + phanDu);
        
        //Bai Tap 2: Chuyen nhiet do
        
        //Chuyển từ Celsius sang Fahrenheit
        // Công thức: F = (C × 9/5) + 32
        
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        
        //3.Tinh chi so BMI
        // BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
        
        double weight = 65.5;    // kg
        double height = 1.70;    // m
        
        double bmi = weight / (height * height);
        
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
        
        // Phân loại BMI
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
        
        //Bai Tap 4 : Tinh Tien Dien
        
        /* Tính tiền điện theo bậc thang:
        - 0-50 kWh: 1,678 đ/kWh
        - 51-100 kWh: 1,734 đ/kWh
        - 101-200 kWh: 2,014 đ/kWh
        - 201-300 kWh: 2,536 đ/kWh
        - Trên 300 kWh: 2,834 đ/kWh
         */
     
        int soDien = 250;  // kWh
        double tienDien = 0;
     
        if (soDien <= 50) {
        	tienDien = soDien * 1678;
        } else if (soDien <= 100) {
        	tienDien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
        	tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
        	tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        } else {
        	tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
        }
     
        System.out.println("Số điện: " + soDien + " kWh");
        System.out.println("Tiền điện: " + tienDien + " đồng");
        System.out.println("Tiền điện (VND): " + String.format("PT,.0f", tienDien) + " đ");
        // CHÚ Ý, sửa thay thế PT = ký hiệu phần trăm trên bàn phím trong String.format("PT,.0f", tienDien) + " đ")
		
	}
}
