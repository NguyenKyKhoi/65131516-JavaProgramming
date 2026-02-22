package tiil.edu;

public class CacLoaiReNhanh {

	public static void main(String[] args) {

		// if
		int age = 20;

		if (age >= 18) {
			System.out.println("Bạn đã trưởng thành.");
		}

		// if else
		if (age % 2 == 0) {
			System.out.println(age + " là số chẵn.");
		} else {
			System.out.println(age + " là số lẻ.");
		}

		// if else if else
		int score = 85;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Điểm số: " + score);
		System.out.println("Xếp loại: " + grade);

		// switch
		int dayOfWeek = 3;
		String dayName;

		switch (dayOfWeek) {
		case 1:
			dayName = "Thứ Hai";
			break;
		case 2:
			dayName = "Thứ Ba";
			break;
		case 3:
			dayName = "Thứ Tư";
			break;
		case 4:
			dayName = "Thứ Năm";
			break;
		case 5:
			dayName = "Thứ Sáu";
			break;
		case 6:
			dayName = "Thứ Bảy";
			break;
		case 7:
			dayName = "Chủ Nhật";
			break;
		default:
			dayName = "Ngày không hợp lệ";
		}

		System.out.println("Ngày thứ " + dayOfWeek + " là: " + dayName);

		// switch and string
		String color = "RED";

		switch (color) {
		case "RED":
			System.out.println("Màu đỏ");
			break;
		case "GREEN":
			System.out.println("Màu xanh lá");
			break;
		case "BLUE":
			System.out.println("Màu xanh dương");
			break;
		default:
			System.out.println("Màu khác");
		}

		// Switch expression với arrow (->)
		int day = 3;

		// Switch expression với -> (không cần break)
		String dayType = switch (day) {
		case 1, 2, 3, 4, 5 -> "Ngày làm việc";
		case 6, 7 -> "Ngày nghỉ";
		default -> "Ngày không hợp lệ";
		};

		System.out.println("Ngày thứ " + day + " là: " + dayType);

		// Switch với yield
		color = "RED";

		// Switch với yield
		int colorCode = switch (color) {
		case "RED" -> {
			System.out.println("Xử lý màu đỏ...");
			yield 1; // Trả về giá trị
		}
		case "GREEN" -> {
			System.out.println("Xử lý màu xanh lá...");
			yield 2;
		}
		case "BLUE" -> {
			System.out.println("Xử lý màu xanh dương...");
			yield 3;
		}
		default -> {
			System.out.println("Màu không xác định");
			yield 0;
		}
		};

		System.out.println("Mã màu: " + colorCode);

		// Pattern matching trong switch
		Object obj = "Hello";

		// Pattern matching trong switch
		String result = switch (obj) {
		case String s when s.length() > 5 -> "Chuỗi dài: " + s;
		case String s -> "Chuỗi ngắn: " + s;
		case Integer i when i > 0 -> "Số dương: " + i;
		case Integer i -> "Số: " + i;
		case Double d -> "Số thực: " + d;
		case null -> "Đối tượng null";
		default -> "Kiểu không xác định: " + obj.getClass().getSimpleName();
		};

		System.out.println(result);
	}
}
