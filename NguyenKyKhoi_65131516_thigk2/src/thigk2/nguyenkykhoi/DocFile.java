package thigk2.nguyenkykhoi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//1. Dùng FileReader để biết đọc file nào rồi dùng BufferedReader để đọc lưu vào 1 biến 
//2. kiểm tra nó có null hay không và đồng thời kết hợp để kiếm ngày sinh trong vòng lặp
//sau khi có thì in ra và các số thực đồng thời cũng được in ra sau khi được chuyển sang double
//vì nó không phải 1 khoảng trống

public class DocFile {

	public static void main(String[] args) throws IOException {

		FileReader fR = new FileReader("tutao.txt");
		try (BufferedReader bufReader = new BufferedReader(fR)) {
			String line;
			System.out.println("Các số trong file : ");
			double check = 0;
			while ((line = bufReader.readLine()) != null) {

				if (!line.isEmpty()) {
					double soThuc = Double.parseDouble(line);
					System.out.println(soThuc);
					if (soThuc == 26) {
						check = 26;
					}
				} else {
					System.out.println("Dòng không phải là số thực !!!");
				}
			}

			int check1 = (int) check;
			System.out.println("Tìm Ngày Sinh : ");
			if (check == 26) {
				System.out.println("Có số là ngày sinh của bản thân : " + check1);
			} else {
				System.out.println("Không có số là ngày sinh của bro á !!!");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
