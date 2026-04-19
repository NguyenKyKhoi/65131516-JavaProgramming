import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainObject {

	public static void main(String[] args) throws IOException {

		FileReader fR = new FileReader("object_2.txt");
		BufferedReader bufReader = new BufferedReader(fR);
		ArrayList<Object> dsOject = new ArrayList<Object>();
		String line;

		while ((line = bufReader.readLine()) != null) {
			String[] parts = line.split(";\\s*");

			if (parts.length >= 4) {
				int stt = Integer.parseInt(parts[0].trim());
				String hoTen = parts[1].trim();
				int namSinh = Integer.parseInt(parts[2].trim());
				String gioiTinh = parts[3].trim();
				Object temp = new Object(stt, hoTen, namSinh, gioiTinh);
				dsOject.add(temp);
			}
		}

		for (var x : dsOject) {
			System.out.println(x.toString());
		}

	}

}
