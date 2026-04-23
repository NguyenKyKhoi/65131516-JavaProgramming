package thigk2.nguyenkykhoi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//1. Dùng FileReader để biết đọc file nào rồi dùng BufferedReader để đọc lưu vào 1 biến 
//2. Dùng split cắt ra và in ra

public class DocFile {

	public static void main(String[] args) throws IOException {

		FileReader fR = new FileReader("tutao.txt");
		BufferedReader bufReader = new BufferedReader(fR);
		String line;
		System.out.println("Các số trong file : ");
		double check;
		while ((line = bufReader.readLine()) != null) {
			String[] parts = line.split("\\s+");

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

		System.out.println("Tìm Ngày Sinh : ");
		if (check == 26) {
			System.out.println("Đã số có ngày sinh của bản thân : " + check);
		}

	}

}
