import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainObject {

	public static void main(String[] args) throws IOException {

		FileReader fR = new FileReader("object_2.txt");
		BufferedReader bufReader = new BufferedReader(fR);
		ArrayList<Object> dsObject = new ArrayList<Object>();
		String line;

		// while để lấy dữ liệu trên một hàng trong file
		while ((line = bufReader.readLine()) != null) {
			String[] parts = line.split(";\\s*");

			if (parts.length >= 4) {
				int stt = Integer.parseInt(parts[0].trim());
				String hoTen = parts[1].trim();
				int namSinh = Integer.parseInt(parts[2].trim());
				String gioiTinh = parts[3].trim();
				Object temp = new Object(stt, hoTen, namSinh, gioiTinh);
				dsObject.add(temp);
			}
		}

		System.out.printf("%-5s %-25s %-15s %-10s", "STT", "Họ Tên", "Năm Sinh", "Giới Tính\n");
		System.out.println("--------------------------------------------------------------");
		for (var temp : dsObject) {
			System.out.printf("%-5d %-25s %-15d %-10s\n", temp.getStt(), temp.getHoTen(), temp.getNamSinh(),
					temp.getGioiTinh());
		}

	}

}
