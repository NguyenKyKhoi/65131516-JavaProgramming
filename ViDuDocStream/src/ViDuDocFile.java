import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ViDuDocFile {
	public static void main(String[] args) throws IOException {
		FileReader fR = new FileReader("Input.txt");
		BufferedReader bufReader = new BufferedReader(fR);

		String line1 = bufReader.readLine();
		Double so1 = Double.parseDouble(line1);

		String line2 = bufReader.readLine();
		Double so2 = Double.parseDouble(line2);

		double tong = so1 + so2;
		System.out.println("Tổng là: " + String.valueOf(tong));
	}
}
